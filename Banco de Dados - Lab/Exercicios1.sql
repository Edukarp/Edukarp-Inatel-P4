create database if not exists exercicio1;
use exercicio1;

#Criando tabela
create table if not exists usuario(
id int not null auto_increment primary key,
nome varchar(45),
email varchar(45),
senha varchar(45)
);

#Inserindo dados
INSERT INTO usuario(nome,email,senha) VALUES('Alexandre','alexandre@email.com','12345');
INSERT INTO usuario(nome,email,senha) VALUES('Natanael','natanael@email.com','ABCDE');
INSERT INTO usuario(nome,email,senha) VALUES('Julia','julia_09@email.com','98765');
INSERT INTO usuario(nome,email,senha) VALUES('Fernanda','fernanda@email.com','EFGHI');

#Mostrando a tabela
SELECT * from usuario;

#Deletando o usuario de id 4
DELETE FROM usuario WHERE id = 4;

#Mostrando a tabela depois do DELEETE
SELECT * from usuario;

#Mostrando a tabela com apenas os nomes que contem "N"
SELECT * FROM usuario WHERE nome like '%n%';
