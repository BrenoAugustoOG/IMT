/*******************************************/
/****** Aula 06/set - Importação e funções de grupo *****/
Para importar dados no MongoDB Compass, seguir os seguintes passos:
0- Baixar do Canvas : movie.json e IMDb_names.csv para a pasta documentos
1- Conectar-se ao sistema que contém a coleção para a qual se deseja importar os dados;
2 - Selecionar um database. Para criar um novo selecionar a conexão e botão Create database
à direita acima (em verde).Preencha os dados e crie uma nova coleção que será destino da importação.
As coleção serão "movie" (movie.json) e "actor" (IMDB_names.csv)
3- Navegar até a coleção de destino;
4 - Clicar no menu suspenso Add Data (verde) e selecionar Import JSON or CSV file;
5 - Selecionar o tipo de arquivo apropriado, JSON ou CSV para importar e clicar em Select;
6 - Configurar opções de importação;
7 - Clicar em Import. 

// dentro do NOSQL Booster
use importacao_si
db.movie.find().count()

//renomeando um campo
db.movie.updateMany({}, {$rename: {"year": "ano_lancamento"}})
// datatype
// $type : date-9, timestamp-17, string-2, double-1
db.movie.aggregate( [ 
        { "$project": { "dataType": {  "$type": "$ano_lancamento"  } } } ])
// convertendo ano de lancamento
db.movie.find({ano_lancamento:{$ne: ""}}).count()

db.movie.find({ano_lancamento:{$ne: ""}}).forEach( function (doc) {
doc._id = doc._id ;
doc.ano_lancamento = parseInt(doc.ano_lancamento);
//print(doc._id); 
//print(doc.ano_lancamento) } ) 
// deprecated save()
db.movie.replaceOne({_id:doc._id},doc ) } ) ;

db.movie.createIndex(
  { title: 1, ano_lancamento: -1 } ,
  { name: "titulo_ano" })

// conversão da duração do filme - runtime - limpar o "min"
db.movie.find()
// criando novo campo para receber a duração sem os minutos
db.movie.updateMany({}, {$set : {duracao: null}})
db.movie.updateMany({runtime: {$ne: null}},
[ { $set: {duracao: {$substr: ["$runtime",0, { $indexOfBytes : ["$runtime", " min"] }] }  } } ] )
// conversão para inteiro
db.movie.find({duracao:{$ne: null}}).forEach( function (doc) {
doc._id = doc._id ;
doc.duracao = parseInt(doc.duracao);
//print(doc.duracao)
db.movie.replaceOne({_id:doc._id},doc ) } ) ;

// Manipulando datas
// O MongoDB converte as datas para BSON, e além disso trabalha com milissegundos, característico de sistemas UNIX
// No relacional as datas são convertidas, nos sistemas ocidentais, para o calendário Juliano , por exemplo, o dia
// de hoje 06/set/2024 é convertido na quantidade de dias que se passaram desde 01/01/00, vamos imaginar que essa conversão
// resultasse 738945,67321
// No MOngoDB. o início do calendário é 01/01/1970, isso significa que datas posteriores são positivas, e anteriores são negativas

// coleção teste para funções de data 
db.teste.insertOne({teste:"teste"})

// Equivalente ao EXTRACT
db.teste.aggregate(
[ { $project :
    { hoje : new Date(),
      dia:  {$dayOfMonth: new Date()},
      hora: {$hour: new Date()},
    minuto: {$minute: new Date()},
    segundo: {$second: new Date()},
    milisegundo: {$millisecond: new Date()},
    dia_ano: {$dayOfYear: new Date()},
    dia_semana: {$dayOfWeek: new Date()},
    semana: {$week: new Date()}  }  }   ]   )
    
// diferença do localtimezone para GMT   
var now = new Date();
now.getTimezoneOffset()  

// diferença entre datas 
db.teste.aggregate( [
  { $project: { difdias: { $dateDiff: { startDate: ISODate("2024-08-25T00:00:00.000Z") ,
                                        endDate: ISODate("2024-09-01T00:00:00.000Z") ,
                                          unit: "day" } } , _id: 0 } } ] )
                                          
db.teste.aggregate( [
  { $project: { difhoras: { $dateDiff: { startDate: ISODate("2024-09-01T00:00:00.000Z") ,
                                        endDate: new Date(),
                                          unit: "hour" } } , _id: 0 } } ] )                                          
// subtraindo unidades de tempo 
db.teste.aggregate( [
  { $project: { intervalo: { $dateSubtract:{ startDate: ISODate("2024-03-31T12:10:05Z"),
                                             unit: "month",
                                             amount: 1 } } } } ] ) 
											 
// adicionando unidades de tempo 
db.teste.aggregate( [
  { $project: { intervalo: { $dateAdd:{ startDate: new Date(),
                                             unit: "hour",
                                             amount: 2 } } } } ] ) 