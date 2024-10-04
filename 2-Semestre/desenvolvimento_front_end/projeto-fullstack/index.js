const express = require('express')
const app = express()
app.use(express.json())

//get http://localhost:3000/oi
app.get('/oi' , (req,res) => {
    res.send('oi')
}) 

app.listen (3000, () => console.log("server up and running"))

let filmes = [
    {
        titulo: "TED",
        sinopse: "Quando criança, John desejou que seu ursinho Ted ganhasse vida e, surpreendentemente, foi atendido. Porém, agora que é adulto, ele precisa lidar com as consequências de seu pedido, já que Ted não vai parar de atormentar a sua vida."
    },
    {
        titulo: "Gotham",
        sinopse: "Antes de Batman, a cidade de Gotham já existia. James Gordon (Ben McKenzie) é um detetive iniciante polícia. Corajoso, sincero e ansioso para mostrar serviço, o recém-promovido tem como missão solucionar o caso do assassinato dos bilionários Thomas e Martha Wayne, um dos casos mais complexos da cidade."
    }
]

app.get('/filmes', (req,res) => {
    res.json(filmes)
})

app.post('/filmes', (req,res) => {
    // Capturar as informações enviadas e trazer para o contexto
    const titulo = req.body.titulo
    const sinopse = req.body.sinopse

    // Montar um json novo com as informações recebidas
    const filme_novo = {titulo: titulo, sinopse: sinopse}

    // Acrescentar o novo filme à base
    filmes.push(filme_novo)

    // Exibir a base atualizada
    res.json(filmes)
})