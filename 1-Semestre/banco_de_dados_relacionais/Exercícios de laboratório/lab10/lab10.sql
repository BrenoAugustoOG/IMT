-- Breno Augusto Oliveira Gandolfo | RA: 24.01496-6
CREATE DATABASE dbpatio;
USE dbpatio;
CREATE TABLE cliente (
idCliente INT NOT NULL PRIMARY KEY,
CPF CHAR(14) NOT NULL UNIQUE,
nomeCliente VARCHAR(60) NOT NULL,
dataNascimento DATE NOT NULL
);
INSERT INTO cliente (idCliente, CPF, nomeCliente, dataNascimento) VALUES
(100, '298.876.123.23', 'Paulo Souza', '2001-10-30'),
(200, '333.657.480.78', 'Ana Catarina', '1999-02-03'),
(300, '123.125.824.12', 'Joel Silva', '1950-01-20'),
(400, '879.982.013.90', 'Pedro de Paula', '1964-01-03'),
(500, '268.811.861.06', 'Beatriz Carvalho', '1978-03-04'),
(600, '631.938.066.48', 'Vitória Sandos', '1985-08-10'),
(700, '345.987.009-12', 'Antonio da Silva Alves', '2001-01-10'),
(800, '123.876.654-16', 'Pedro Luz', '2000-05-05');
SELECT * FROM cliente;
CREATE TABLE patio (
idPatio INTEGER UNIQUE NOT NULL PRIMARY KEY,
enderecoPatio VARCHAR(80) NOT NULL,
capacidadePatio INTEGER NOT NULL
);
INSERT INTO patio (idPatio, enderecoPatio, capacidadePatio) VALUES
(1, 'São Paulo - Vila Mariana', 200),
(2, 'São Paulo - Av. Paulista', 250),
(3, 'São Caetano do Sul - Av. Goiás', 180);
SELECT * FROM patio;
CREATE TABLE veiculo (
idVeiculo INT NOT NULL UNIQUE PRIMARY KEY,
placa CHAR(10) NOT NULL,
modelo VARCHAR(45) NOT NULL,
cor VARCHAR(45) NOT NULL,
idcliente INTEGER,
FOREIGN KEY(idcliente) REFERENCES cliente(idcliente)
ON DELETE NO ACTION
ON UPDATE NO ACTION
);
INSERT INTO veiculo (idVeiculo, placa, modelo, cor, idCliente) VALUES
(1001, 'BEE4R22', 'FOX', 'Preto', 100) ,
(1011, 'DKD5Y34', 'TOYOTA', 'Vermelho', NULL) ,
(1021, 'KIU8Y44', 'GOL', 'Branco', NULL) ,
(1032, 'BTT9KIU', 'FIAT PULSE', 'Preto', 200) ,
(1033, 'XTT6H77', 'VW NIVUS', 'Vermelho', 200) ,
(1034, 'INH7J81', 'ONIX', 'Branco', NULL) ,
(1041, 'JUI3S88', 'FIAT ARGO', 'Preto', 300) ,
(1043, 'MIU8542', 'FOX', 'Branco', 400) ,
(1045, 'ZRE4YH7', 'GOL', 'Branco', 500) ,
(1046, 'AII8J866', 'GOL', 'Prata', 600) ,
(1048, 'ZYT4WR55', 'VW NIVUS', 'Prata', NULL) ,
(1051, 'ZU78JU49', 'JETTA', 'Vermelho', 100) ,
(1055, 'CYW9I775', 'PASSAT', 'Preto', 100) ;
SELECT * FROM veiculo;
CREATE TABLE estaciona (idPatio INTEGER NOT NULL,
idVeiculo INTEGER NOT NULL,
dataEntrada DATE,
dataSaida DATE,
horaEntrada TIME,
horaSaida TIME,
PRIMARY KEY (idPatio, idVeiculo),
FOREIGN KEY (idPatio) REFERENCES patio(idPatio)
ON DELETE NO ACTION
ON UPDATE NO ACTION,
FOREIGN KEY (idVeiculo) REFERENCES veiculo(idVeiculo)
ON DELETE NO ACTION
ON UPDATE NO ACTION
);
INSERT INTO estaciona (idPatio, idVeiculo, dataEntrada, dataSaida,
horaEntrada, horaSaida) VALUES
(1, 1001, '2022-01-03', '2022-01-05', '10:00:00', '12:10:00'),
(1, 1011, '2022-04-10', '2022-04-15', '08:15:00', '14:30:00'),
(1, 1021, '2022-02-03', '2022-02-07', '15:00:00', '09:14:00'),
(2, 1033, '2021-01-10', '2022-01-15', '17:00:00', '18:14:00'),
(2, 1041, '2021-10-10', '2022-10-15', '14:35:00', '08:37:00'),
(2, 1043, '2022-02-02', '2022-02-15', '17:57:00', '06:56:00'),
(3, 1046, '2022-03-10', '2022-03-11', '19:38:00', '19:39:00'),
(3, 1048, '2022-04-12', '2022-04-19', '13:34:00', '05:55:00');
SELECT * FROM estaciona;
SELECT c.nomeCliente, v.placa
FROM cliente c
LEFT JOIN veiculo v ON c.idCliente = v.idCliente
ORDER BY c.nomeCliente;
SELECT c.nomeCliente, IFNULL(v.placa, 'Nenhum veículo') AS placa
FROM cliente c
LEFT JOIN veiculo v ON c.idCliente = v.idCliente
ORDER BY c.nomeCliente;
SELECT c.nomeCliente, IFNULL(v.placa, 'Veículo sem proprietário') AS placa
FROM veiculo v
LEFT JOIN cliente c ON v.idCliente = c.idCliente
ORDER BY c.nomeCliente;
SELECT c.CPF, c.nomeCliente
FROM cliente c
JOIN veiculo v ON c.idCliente = v.idCliente
WHERE v.placa = 'ZU78JU49';
SELECT v.modelo, v.placa, v.cor
FROM veiculo v
JOIN estaciona e ON v.idVeiculo = e.idVeiculo
WHERE e.idPatio = 1;
SELECT v.modelo, v.placa, v.cor
FROM veiculo v
JOIN estaciona e ON v.idVeiculo = e.idVeiculo
WHERE e.idPatio = 2;
SELECT v.modelo, v.placa, v.cor
FROM veiculo v
JOIN estaciona e ON v.idVeiculo = e.idVeiculo;
SELECT v.modelo, v.placa
FROM veiculo v
JOIN estaciona e ON v.idVeiculo = e.idVeiculo
WHERE v.cor = 'Prata';
SELECT v.modelo, v.placa
FROM veiculo v
JOIN estaciona e ON v.idVeiculo = e.idVeiculo
WHERE v.cor != 'Vermelho';
SELECT v.modelo, v.placa, e.dataEntrada
FROM veiculo v
JOIN estaciona e ON v.idVeiculo = e.idVeiculo;
SELECT v.modelo, v.placa, e.dataEntrada
FROM veiculo v
JOIN estaciona e ON v.idVeiculo = e.idVeiculo
WHERE YEAR(e.dataEntrada) = 2021;