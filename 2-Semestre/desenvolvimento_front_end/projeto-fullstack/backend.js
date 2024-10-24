const express = require('express')
const cors = require('cors')
const mongoose = require('mongoose')
const app = express()
app.use(express.json())
app.use(cors())

const Filme = mongoose.model("Filme", mongoose.Schema({
    titulo: {type: String}, sinopse: {type: String}
}))

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

app.listen (3000, () => {
    try{
        conectarAoMongo()
        console.log("server up & running and connection ok")    
    }
    catch (e) {
        console.log('erro de conexão', e)
    }
})