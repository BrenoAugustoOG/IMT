const express = require('express')
const cors = require('cors')
const mongoose = require('mongoose')
const uniqueValidator = require('mongoose-unique-validator')
const bcrypt = require('bcrypt')
const jwt = require('jsonwebtoken')
const app = express()
app.use(express.json())
app.use(cors())

const Filme = mongoose.model("Filme", mongoose.Schema({
    titulo: {type: String}, sinopse: {type: String}
}))

const usuarioSchema = mongoose.Schema({
    login: {type: String, required: true, unique: true},
    password: {type: String, required: true, unique: true}
})

usuarioSchema.plugin(uniqueValidator)
const Usuario = mongoose.model ("Usuario", usuarioSchema)

async function conectarAoMongo() {
    await mongoose.connect(`mongodb+srv://srbreno7:170406Ba@cluster.hb9ue.mongodb.net/?retryWrites=true&w=majority&appName=Cluster`)
}

app.get('/filmes', async (req,res) => {
    const filmes = await Filme.find()
    res.json(filmes)
})

app.post('/filmes', async (req,res) => {
    const titulo = req.body.titulo
    const sinopse = req.body.sinopse
    const filme = new Filme({titulo: titulo, sinopse: sinopse})
    await filme.save()
    const filmes = await Filme.find()
    res.json(filmes)
})

app.post('/signup', async (req, res) => {
    try {
        const login = req.body.login
        const password = req.body.password
        const password_criptografada = await bcrypt.hash(password, 10)
        const usuario = new Usuario({login: login, password: password_criptografada})
        const respMongo = await usuario.save()
        console.log(respMongo)
        res.status(201).end()
    }
    catch (e) {
        console.log('Erro ao efetuar login', e)
        res.status(409).end()
    }
    
})

app.post('/login', async (req, res) => {
    const login = req.body.login
    const password = req.body.password
    //verifica se o usuário existe
    const usuarioExiste = await Usuario.findOne({login: login})
    if (!usuarioExiste) {
        return res.status(401).json({mensagem: "Login Inválido"})
    }
    const senhaValida = await bcrypt.compare(password, usuarioExiste.password)
    if (!senhaValida) {
        return res.status(401).json({mensagem: "Senha inválida"})
    }
    const token = jwt.sign(
        {login: login}, "id-secreto", {expiresIn: "1h"}
    )
    res.status(200).json({token: token})
})

app.listen (3000, () => {
    try{
        conectarAoMongo()
        console.log("server up & running and connection ok")    
    }
    catch (e) {
        console.log('erro de conexão', e)
    }
})
