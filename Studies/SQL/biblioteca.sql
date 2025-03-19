-- Create Database
CREATE DATABASE db_livro_0301;

USE db_livro_0301;

-- Create Table
CREATE TABLE tb_editora (
	cd_editora int not null primary key,
	editora char(30)
);

CREATE TABLE tb_genero (
	cd_genero int not null primary key,
	genero char(30)
);

CREATE TABLE tb_livro (
    isbn varchar(13) NOT NULL PRIMARY KEY,  -- ISBN geralmente é varchar, com até 13 caracteres
    titulo varchar(50),                     -- Título do livro (char pode ser substituído por varchar)
    cd_editora int,                          -- Código da editora (depende de outra tabela)
    cd_genero int,                           -- Código do gênero (depende de outra tabela)
    preco decimal(12,2),                     -- Preço do livro com duas casas decimais
    dt_livro date                            -- Data de lançamento do livro
);

-- Relacionamentos
ALTER TABLE tb_livro
ADD CONSTRAINT fk_editora FOREIGN KEY (cd_editora)
REFERENCES tb_editora (cd_editora);

ALTER TABLE tb_livro
ADD CONSTRAINT fk_genero FOREIGN KEY (cd_genero)
REFERENCES tb_genero (cd_genero);

-- Popular
insert into tb_editora (
	cd_editora,
    editora)
value(1, "abenti");

insert into  tb_genero (
	cd_genero,
    genero)
value(1, "ficcao");

insert into tb_livro (
	isbn,
	titulo,
	cd_editora,
	cd_genero,
	preco,
	dt_livro)
VALUES(2, "seila", 1, 1, 10.99, "2025-10-2");

-- Selects / Update
select * from tb_livro;

UPDATE tb_livro
SET preco = '500.00'
WHERE isbn = 2;



