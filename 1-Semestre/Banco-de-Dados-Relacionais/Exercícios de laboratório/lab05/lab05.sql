-- Breno Augusto Oliveira Gandolfo RA: 24.01496-6
-- Bruno Nogueira Asevedo Souza RA: 23.00313-8
-- Lyssa Okawa Perini RA: 24.01193-2
-- Mateo Vuolo Cortez RA: 24.00775-7
drop database labdb;
create database labdb;
use labdb;
create table autor (
id_autor integer not null,
autor varchar(30) not null,
primary key (id_autor)
);
create table titulo (
id_titulo integer not null,
titulo varchar(30) not null unique,
id_autor integer not null,
data_publicacao date null,
primary key (id_titulo, id_autor ),
foreign key (id_autor) references autor (id_autor)
);
describe titulo ;
describe autor ;
insert into autor (id_autor, autor) values(1, 'Antoine de Saint-Exupery');
insert into autor (id_autor, autor) values(2, 'Chico Buarque');
insert into autor (id_autor, autor) values(3,'Blandina Franco');
insert into autor (id_autor, autor) values(4, 'R.J Palacio');
insert into autor (id_autor, autor) values(5, 'Jeff Kinney');
insert into autor (id_autor, autor) values(6, 'Adam Wallace');
insert into autor (id_autor, autor) values(7, 'Silvana Rando');
insert into titulo (id_titulo, titulo, id_autor) values (77,'O Pequeno Príncipe',
1);
insert into titulo (id_titulo, titulo, id_autor) values (78, 'Chapeuzinho Amarelo',
2);
insert into titulo (id_titulo, titulo, id_autor) values (79, 'Quem soltou o pum?',
3);
insert into titulo (id_titulo, titulo, id_autor) values (80, 'Extraordinário', 4);
insert into titulo (id_titulo, titulo, id_autor) values (81,'Diário de um Banana',
5);
insert into titulo (id_titulo, titulo, id_autor) values (82, 'Como Capturar um
Unicórnio', 6);
insert into titulo (id_titulo, titulo, id_autor) values (83, 'A Carta do Gildo',
7);