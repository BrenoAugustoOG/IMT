-- Breno Augusto RA: 24.01496-6
-- Henrique Nalin RA: 24.01883-0
-- Mateo Vuolo Cortez RA: 24.00775-7
-- Mateusz Chaves Slawacki RA: 24.01627-6
drop database bdalunos;
create database bdalunos;
use bdalunos;
create table tabaluno (
idAluno integer not null,
cpfAluno char(14) not null unique,
nomeAluno char(30) null,
primary key (idAluno ) ) ;
describe tabaluno;
INSERT INTO tabaluno (idAluno, cpfAluno) values(1, '111.222.333-44');
SELECT * FROM tabaluno;
INSERT INTO tabaluno (idAluno, cpfAluno) values(1, '222.333.444-55');
SELECT * FROM tabaluno;
-- ERROR 1062 (23000): Duplicate entry '1' for key 'tabaluno.PRIMARY'
INSERT INTO tabaluno (idAluno, cpfAluno) values(2, '111.222.333-44', 'Paulo de
Souza');
SELECT * FROM tabaluno;
-- ERROR 1136 (21S01): Column count doesn't match value count at row 1
INSERT INTO tabaluno (idAluno, cpfAluno) values(2, '222.333.444-55');
SELECT * FROM tabaluno;
describe tabaluno;
drop table tabaluno;
create table tabaluno (
idAluno integer not null,
cpfAluno char(14) not null unique,
nomeAluno char(30) null,
primary key (idAluno, cpfAluno ) ) ;
describe tabaluno;
INSERT INTO tabaluno (idAluno, cpfAluno) values(1, '111.222.333-44');
SELECT * FROM tabaluno;
INSERT INTO tabaluno (idAluno, cpfAluno) values(1, '222.333.444-55');
SELECT * FROM tabaluno;
INSERT INTO tabaluno (idAluno, cpfAluno) values(2, '222.333.444-55');
SELECT * FROM tabaluno;
-- ERROR 1062 (23000): Duplicate entry '222.333.444-55' for key 'tabaluno.cpfAluno'
INSERT INTO tabaluno (idAluno, cpfAluno) values(2, '111.222.333-44');
SELECT * FROM tabaluno;
-- ERROR 1062 (23000): Duplicate entry '111.222.333-44' for key 'tabaluno.cpfAluno'
describe tabaluno;
drop table tabaluno;
drop database bdalunos;