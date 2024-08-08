-- EX.1

CREATE DATABASE aulao;

USE aulao;

CREATE TABLE search_query (query_id int PRIMARY KEY, user_id INT UNIQUE, search_query TEXT);

INSERT INTO search_query VALUES ('1','1','celular novo');
INSERT INTO search_query VALUES ('2','2','celular usado');

SELECT * FROM search_query WHERE search_query LIKE 'celular%' AND search_query NOT LIKE 'usado%';

DROP DATABASE aulao;

-- EX.2

CREATE DATABASE ex2;

USE ex2;

CREATE TABLE customers (customer_id INT PRIMARY KEY, customer_name TEXT);
CREATE TABLE filmes (filme_id INT PRIMARY KEY, titulo TEXT);
CREATE TABLE rentals (rental_id INT PRIMARY KEY, customer_id INT, filme_id INT, titulo TEXT, rental_date DATE, foreign key (customer_id) REFERENCES customers(customer_id), foreign key (filme_id) REFERENCES filmes(filme_id));

INSERT INTO customers VALUES ('1', 'joao');
INSERT INTO filmes VALUES ('25', 'meu malvado favorito');
INSERT INTO rentals VALUES('1', '1', '25', 'meu malvado favorito', '2024-03-18');

SELECT c.customer_name, f.titulo FROM customers c JOIN rentals r ON c.customer_id = r.customer_id JOIN filmes f ON r.filme_id = f.filme_id;

DROP DATABASE ex2;

-- EX.3

CREATE DATABASE ex3;

USE ex3;

CREATE TABLE produtos (produtos_id INT PRIMARY KEY, produto_nome TEXT, categoria_id INT);
CREATE TABLE vendas ( venda_id INT PRIMARY KEY, produtos_id INT, quantidade INT, preco DECIMAL(6,2), foreign key (produtos_id) REFERENCES produtos (produtos_id));

INSERT INTO vendas VALUES ('1', '1','10', '20.00');
INSERT INTO produtos VALUES ('1', 'cabo hdmi', '10');

SELECT p.produto_nome, SUM(v.quantidade * v.preco) AS vendas_totais FROM vendas v JOIN produtos p ON v.produtos_id = p.produtos_id WHERE p.categoria_id ='10' GROUP BY p.produto_nome;

DROP DATABASE ex3;

-- 	EX.4

CREATE DATABASE ex4;

USE ex4;

CREATE TABLE runners (runner_id INT PRIMARY KEY, runner_name TEXT, registration_date DATE);
CREATE TABLE run_results ( results_id INT PRIMARY KEY, runner_id INT, arrival_time TIME, foreign key (runner_id) references runners(runner_id));

INSERT INTO runners VALUES ('1', 'maria', '2024-02-01');
INSERT INTO runners VALUES ('2', 'giovanna', '2024-02-13');

INSERT INTO run_results VALUES ('1','1','01:01:01');
INSERT INTO run_results VALUES ('2','2','00:56:06');

SELECT r.runner_id, r.runner_name FROM runners r LEFT JOIN run_results rr ON r.runner_id = rr.runner_id GROUP BY r.runner_id HAVING MAX(rr.arrival_time) > 60;

-- EX. 05


