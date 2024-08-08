-- Breno Augusto Oliveira Gandolfo | RA: 24.01496-6
-- Leonardo Tedeschi Belo | RA: 24.00262-3
-- Leticia de Carvalho Silva | RA: 24.00141-4
-- Lyssa Okawa Perini | RA: 24.01193-2
-- 2) Criar o banco de dados dbpessoal
CREATE DATABASE dbpessoal;
-- 3) Implementar as tabelas e populá-las de acordo com o script fornecido
no Canvas
-- Criar a tabela Departamento
CREATE TABLE Departamento (
idDepto INT PRIMARY KEY,
nomeDepto VARCHAR(100)
);
-- Adicionar uma constraint na tabela Departamento
ALTER TABLE Departamento
ADD CONSTRAINT nomeDepto_not_null
CHECK (nomeDepto IS NOT NULL);
-- Criar a tabela Funcionario
CREATE TABLE Funcionario (
idFunc INT PRIMARY KEY,
nomeFunc VARCHAR(150),
cpf VARCHAR(14)
);
-- Adicionar um atributo adicional na tabela Funcionario
ALTER TABLE Funcionario
ADD salario DECIMAL(10, 2);
-- Corrigir o tipo do cpf para VARCHAR na tabela Funcionario
ALTER TABLE Funcionario
ALTER COLUMN cpf VARCHAR(14);
-- 4) Listar os nomes dos funcionários e seus respectivos nomes de
departamento.
SELECT Funcionario.nomeFunc, Departamento.nomeDepto
FROM Funcionario
JOIN Departamento ON Funcionario.idDepto = Departamento.idDepto;
-- 5) Listar os nomes dos funcionários e seus respectivos nomes de
departamento, incluindo os funcionários sem departamento.
SELECT Funcionario.nomeFunc, COALESCE(Departamento.nomeDepto, 'Sem
Departamento') AS departamento
FROM Funcionario
LEFT JOIN Departamento ON Funcionario.idDepto = Departamento.idDepto;
-- 6) Listar os nomes dos funcionários e seus respectivos nomes de
departamento, incluindo os departamentos sem funcionários.
SELECT COALESCE(Funcionario.nomeFunc, 'Sem Funcionário') AS funcionario,
Departamento.nomeDepto
FROM Departamento
LEFT JOIN Funcionario ON Departamento.idDepto = Funcionario.idDepto;
-- 7) Listar os nomes dos funcionários que têm o nome iniciando com o
caractere ‘A’ e seus respectivos nomes de departamento.
SELECT Funcionario.nomeFunc, Departamento.nomeDepto
FROM Funcionario
JOIN Departamento ON Funcionario.idDepto = Departamento.idDepto
WHERE Funcionario.nomeFunc LIKE 'A%';
-- 8) Listar os nomes dos funcionários que têm o nome finalizando com o
caractere ‘s’ e seus respectivos nomes de departamento.
SELECT Funcionario.nomeFunc, Departamento.nomeDepto
FROM Funcionario
JOIN Departamento ON Funcionario.idDepto = Departamento.idDepto
WHERE Funcionario.nomeFunc LIKE '%s';
-- 9) Listar os nomes dos funcionários e seus respectivos nomes de
departamento e que têm código de funcionário superior a 1030.
SELECT Funcionario.nomeFunc, Departamento.nomeDepto
FROM Funcionario
JOIN Departamento ON Funcionario.idDepto = Departamento.idDepto
WHERE Funcionario.idFunc > 1030;
DROP DATABASE dbpessoal;