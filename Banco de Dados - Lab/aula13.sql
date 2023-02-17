drop database if exists masterchef;
create database masterchef;

use masterchef;
#RELACIONAMENTO N:M ENTRE JURADO E COMPETIDOR
#JULGAR É A TABELA INTERMEDIARIA
create table Competidor(
	id int not null auto_increment,
    nome varchar(100) not null,
    idade int not null,
    profissao varchar(50) not null,
    cidade varchar(50) not null,
    estado varchar(2) not null,
    primary key(id)
);

create table Jurado(
	id int not null auto_increment,
    nome varchar(100) not null,
    paisOrigem varchar(100) not null,
    primary key(id)
);

create table Julgar(
	idCompetidor int not null,
    idJurado int not null,
	CONSTRAINT fk1
    foreign key (idCompetidor) 
    references Competidor (id) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    CONSTRAINT fk2
    foreign key (idJurado) 
    references Jurado (id) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE,
    PRIMARY KEY(idCompetidor, idJurado)
);

create table Prato(
	id int not null auto_increment,
    tipoCulinaria varchar(50) not null,
    idCompetidor int not null,
    nota float not null,
    primary key(id),
    CONSTRAINT fk3
    foreign key (idCompetidor) 
    references Competidor (id) 
    ON DELETE CASCADE 
    ON UPDATE CASCADE
);

insert into Competidor(nome, idade, profissao, cidade, estado) values
('Janaina Caetano', '38', 'Taróloga', 'Diadema', 'SP'),
('Rodrigo Massoni', '33', 'Engenheiro Ambiental', 'Osasco', 'SP'),
('Lorena Dayse', '35', 'Enfermeira', 'Teresina', 'PI'),
('Helton Oliveira', '19', 'Estudante', 'Jacutinga', 'MG'),
('Haila Santuá', '25', 'Publicitária', 'Chapadão do Céu', 'GO'),
('Davi','20', 'Estudante', 'Santa Rita do Sapucai', 'MG');

insert into Jurado(nome, paisOrigem) values
('Paola Carosella', 'Argentina'),
('Érick Jacquin', 'França'),
('Henrique Fogaça', 'Brasil');

insert into Julgar(idJurado, idCompetidor) values
('1', '1'),
('1', '2'),
('1', '3'),
('1', '4'),
('2', '3'),
('2', '5'),
('3', '1'),
('3', '2'),
('3', '4');

insert into Prato(tipoCulinaria, nota, idCompetidor) values
('Japonesa', '9.5', '1'),
('Italiana', '8.7', '1'),
('Francesa', '9.2', '2'),
('Brasileira', '4.6', '3'),
('Francesa', '2.7', '4'),
('Francesa', '8.0', '4'),
('Chinesa', '7.5', '4'),
('Japonesa', '3.0', '5');

#Buscar nota dos pratos, nome, idade e cidade dos compentidores que nao sao de SP
#Com inner join
select p.nota, c.nome, c.idade, c.cidade from Competidor as c inner join Prato as p on c.id = p.idCompetidor and c.estado not like 'SP';
#Sem inner join
select p.nota, c.nome, c.idade, c.cidade from Competidor as c, Prato as p where c.id = p.idCompetidor and c.estado not like 'SP';

#Buscar nome, idade e profissao dos competidores julgados pela Paola Carosella
#Com inner join
select c.nome, c.idade, c.profissao from Julgar inner join Competidor as c on Julgar.idCompetidor = c.id inner join Jurado as j on Julgar.idJurado = j.id and j.nome = 'Paola Carosella';
#Sem inner join
select c.nome, c.idade, c.profissao from Julgar,Jurado as j, Competidor as c where Julgar.idCompetidor = c.id and Julgar.idJurado = j.id and j.nome = 'Paola Carosella';

#Buscar a media das notas dos pratos dos competidores cuja profissao comeca com a letra E
#Com inner join
select avg(p.nota) from Prato as p inner join Competidor as c on c.id = p.idCompetidor and c.profissao like 'E___%';
#Sem inner join
select avg(p.nota) from Prato as p, Competidor as c where c.id = p.idCompetidor and c.profissao like 'E___%';

#Buscar a maior nota de um prato de um competidor com menos de 28 anos
#Com inner join
select max(p.nota) from Prato as p inner join Competidor as c on c.id = p.idCompetidor and c.idade < 28;
#Sem inner join
select max(p.nota) from Prato as p, Competidor as c where c.id = p.idCompetidor and c.idade < 28;

#Buscar nome e pais de origem dos jurados e nome, idade e cidade dos competidores, mas apenas dos competidores que não sejam de SP e que tenham sido julgados por algum jurado
#Com inner join
select j.nome, j.paisOrigem, c.nome, c.idade, c.cidade from Julgar inner join Jurado as j on Julgar.idJurado = j.id inner join Competidor as c on Julgar.idCompetidor = c.id and c.estado not like 'SP';
#Sem inner join
select j.nome, j.paisOrigem, c.nome, c.idade, c.cidade from Julgar inner join Jurado as j, Competidor as c where Julgar.idJurado = j.id and Julgar.idCompetidor = c.id and c.estado not like 'SP';

#Buscar todos os tipos de culinaria diferentes dos pratos dos competidores de SP
#Com inner join
select distinct(p.tipoCulinaria) from Prato as p inner join Competidor as c on p.idCompetidor = c.id and c.estado = 'SP';
#Sem inner join
select distinct(p.tipoCulinaria) from Prato as p, Competidor as c where p.idCompetidor = c.id and c.estado = 'SP';

#Buscar tipo de culinaria e nome do competidor, dos competidores julgados pelo Jacquin
select p.tipoCulinaria, c.nome from Prato as p inner join Competidor as c on p.idCompetidor = c.id inner join Julgar on Julgar.idCompetidor = c.id inner join Jurado as j on j.id = j.idJurado and j.nome like '%Jacquin';
select p.tipoCulinaria, c.nome from Prato as p,Competidor as c, Jurado as j, Julgar where p.idCompetidor = c.id and Julgar.idCompetidor = c.id and j.id = j.idJurado and j.nome like '%Jacquin';


