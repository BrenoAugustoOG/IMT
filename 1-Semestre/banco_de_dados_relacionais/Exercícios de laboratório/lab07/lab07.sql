-- Breno Augusto | RA: 24.01496-6
-- Bruno Nogueira | RA: 23.00313-8
-- Henrique Nalin | RA: 24.01883-0
-- Mateo Vuolo Cortez | RA: 24.00775-7
-- Mateusz Chaves Slawacki | RA: 24.01627-6
drop database dbvendas;
create database dbvendas;
use dbvendas;
create table vendedores(
idVendedor int unique not null,
celular varchar(9),
cpf varchar(14) unique,
nome char(30),
metaVendas varchar(8),
salarioFixo varchar(8),
totalvendasrealizadas float,
primary key(idvendedor)
);
insert into vendedores(idVendedor,cpf,nome,metaVendas,salarioFixo,
totalvendasrealizadas)values (100, '298.876.123.23', 'Paulo Souza',
5000.00,
2440.00, 3400.00);
insert into vendedores(idVendedor,cpf,nome,metaVendas,salarioFixo,
totalvendasrealizadas)values (200, '333.657.480.78','Ana Catarina',
4000.00,
2440.00, 4400.00);
insert into vendedores(idVendedor,cpf,nome,metaVendas,salarioFixo,
totalvendasrealizadas)values (300, '123.125.824.12','Joel Silva',
3000.00,
2440.00, 9400.00);
insert into vendedores(idVendedor,cpf,nome,metaVendas,salarioFixo,
totalvendasrealizadas)values (400, '879.982.013.90', 'Pedro de
Paula', 4300.00,
2440.00, 2600.00);
insert into vendedores(idVendedor,cpf,nome,metaVendas,salarioFixo,
totalvendasrealizadas)values (500, '268.811.861.06', 'Beatriz
Carvalho', 8700.00,
2440.00, 7400.00);
insert into vendedores(idVendedor,cpf,nome,metaVendas,salarioFixo,
totalvendasrealizadas)values (600, '631.938.066.48', 'Vitória
Santos', 2900.00,
2440.00, 3700.00);
select nome from vendedores;
select nome from vendedores order by nome;
select nome from vendedores order by nome desc;
select nome, totalvendasrealizadas from vendedores;
select nome, totalvendasrealizadas from vendedores order by
totalvendasrealizadas desc;
select nome, metaVendas, totalvendasrealizadas from vendedores where
totalvendasrealizadas>metavendas order by totalvendasrealizadas desc;
select nome, metaVendas, totalvendasrealizadas from vendedores where
totalvendasrealizadas<=metavendas order by totalvendasrealizadas desc;
select avg(totalvendasrealizadas) from vendedores;
select round(avg(totalvendasrealizadas),2) from vendedores;
select (metaVendas-totalvendasrealizadas), nome from vendedores order by
nome;
create table celulares (idvendedor integer not null,
celular varchar(40) not null,
primary key(celular),
foreign key (idvendedor)
references vendedores(idvendedor));
insert into celulares (idvendedor,celular) values (100, '11 90976-1234');
insert into celulares (idvendedor,celular) values (100, '11 97654-0975');
insert into celulares (idvendedor,celular) values (200, '11 99875-1237');
insert into celulares (idvendedor,celular) values (200, '11 76542-0962');
insert into celulares (idvendedor,celular) values (300, '11 78651-0987');
insert into celulares (idvendedor,celular) values (300, '11 75321-6723');
insert into celulares (idvendedor,celular) values (400, '11 99876-2739');
insert into celulares (idvendedor,celular) values (400, '11 98760-1269');
insert into celulares (idvendedor,celular) values (500, '11 76540-0098');
insert into celulares (idvendedor,celular) values (500, '11 99977-9944');
insert into celulares (idvendedor,celular) values (600, '11 87654-0042');
insert into celulares (idvendedor,celular) values (600, '11 99998-0062');
select*from celulares;
select round(count(nome)/(select count(nome) from vendedores) * 100,2) as
'percentual' from vendedores where metaVendas>5000;