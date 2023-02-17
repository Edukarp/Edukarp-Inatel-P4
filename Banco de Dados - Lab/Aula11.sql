create database if not exists hogwarts;
use hogwarts;
create table if not exists school(
idescola INT NOT NULL,
  nomeEscola VARCHAR(45) NULL,
  localizacao VARCHAR(45) NULL,
  anoFundacao DATE NULL,
  PRIMARY KEY (idescola)
);
CREATE TABLE IF NOT EXISTS Animal (
  idanimal INT NOT NULL,
  nomeAnimal VARCHAR(45) NULL,
  especie VARCHAR(45) NULL,
  PRIMARY KEY (idanimal));
  
  CREATE TABLE IF NOT EXISTS witch (
  idnome INT NOT NULL,
  nomeBruxo VARCHAR(45) NULL,
  casa VARCHAR(45) NULL,
  PRIMARY KEY (idnome));

#Criando Usuario
CREATE USER hermione IDENTIFIED by 'usuario1';
CREATE USER harry IDENTIFIED by 'usuario2';
CREATE USER hagrid IDENTIFIED by 'usuario3';

#Garantindo acesso a eles (Grant)

#Garantindo acesso a hermione apenas para uso em qualquer BD
GRANT USAGE ON *.* TO hermione;

#Dar todos privilegios no BD hogwarts para o harry
GRANT ALL ON hogwarts.* TO harry;

#Tirando privilegio do hagrid de criar tabelas do BD hogwards
REVOKE CREATE ON hogwarts.* FROM hagrid; 

#Permitir que hagrid possa adicionar e alterar dados da tabela Animal e dê privilegios a outros Usuarios
GRANT INSERT, UPDATE, GRANT OPTION ON hogwarts.Animal to harry;

#Dando a hermione o poder de alterar nome e sobrenome da tabela witch
GRANT UPDATE(nome, sobrenome) ON hogwarts.witch TO hermione;

#Tirando todos os privilegios do harry, e dando privilegios a outros usuarios
REVOKE ALL, GRANT OPTION FROM harry; 

#Tirando os privilegios de hagrid de inserir e deletar bruxos da tabela witch
REVOKE INSERT, DELETE ON hogwarts.witch from hagrid;
