create database if not exists teorica2;
use teorica2;

CREATE TABLE Departamento
(
    DNome VARCHAR(15),
    DNumero INT NOT NULL,
    DataInicio DATE,
    SSN_Empregado BIGINT,
    PRIMARY KEY(DNumero)
);

CREATE TABLE Empregado
(
  PNome VARCHAR(15) NOT NULL,
  MInicial CHAR,
  UNome VARCHAR(15) NOT NULL,
  SSN BIGINT NOT NULL,
  DataNasc DATE,
  Endereco VARCHAR(80),
  Sexo BIT,
  Salario DECIMAL(10,2),
  SSN_Supervisor BIGINT,
  DNumero_Departamento INT NOT NULL,
  
  PRIMARY KEY (SSN),
  CONSTRAINT fk1
	FOREIGN KEY (SSN_Supervisor) REFERENCES Empregado (SSN) 
    ON DELETE SET NULL ON UPDATE CASCADE,
  
  CONSTRAINT fk2
	FOREIGN KEY (DNumero_Departamento) REFERENCES Departamento (DNumero)
    ON DELETE CASCADE ON UPDATE CASCADE
);

AlTER TABLE Departamento ADD CONSTRAINT fk3 FOREIGN KEY (SSN_Empregado) REFERENCES Empregado (SSN) ON DELETE CASCADE ON UPDATE CASCADE;

create table Projeto
(
	Pnome VARCHAR(45) NOT NULL,
	PNUMERO INT NOT NULL,
	PLocalizacao VARCHAR(45) NOT NULL,
	DNumero_Departamento INT,
    PRIMARY KEY(PNumero),
    
	CONSTRAINT fk4
		FOREIGN KEY (DNumero_Departamento) REFERENCES Departamento (Dnumero)
		ON DELETE CASCADE ON UPDATE CASCADE
);

create table Dependente(
	SSN_Empregado BIGINT,
    Nome_Dependente VARCHAR(45) NOT NULL,
	DataNasc DATE,
	Sexo BIT,
    Parentesco VARCHAR(45),
    PRIMARY KEY(SSN_Empregado, Nome_Dependente),

    CONSTRAINT fk5
		FOREIGN KEY (SSN_Empregado) REFERENCES Empregado (SSN)
		ON DELETE CASCADE ON UPDATE CASCADE
);

create table Depto_Localizacoes(
	LNumero INT NOT NULL,
    DLocalizacao VARCHAR(45),
    DNumero_Departamento INT,
    PRIMARY KEY(LNumero),
    
	CONSTRAINT fk6
		FOREIGN KEY (DNumero_Departamento) REFERENCES Departamento (Dnumero)
		ON DELETE CASCADE ON UPDATE CASCADE
);

create table Trabalha_Em(
	SSN_Empregado BIGINT,
    PNumero_Projeto INT,
    Horas DATE,
    PRIMARY KEY(SSN_Empregado),
    
	CONSTRAINT fk7
		FOREIGN KEY (SSN_Empregado) REFERENCES Empregado (SSN)
		ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Departamento (DNumero, DNome, DataInicio) VALUES (125, "Dep1", 12/04/2002);

INSERT INTO Departamento (DNumero, Dnome) VALUES(225, "Dep2");

INSERT INTO Empregado (SSN, UNome, DNumero_Departamento, PNome, Salario) VALUES (146, "Eduardo", 125, "Projeto bla bla", 2500);
INSERT INTO Empregado (SSN, UNome, DNumero_Departamento, PNome, Salario) VALUES (147, "Maria", 225, "Projeto bla bla", 2500);

INSERT INTO Empregado VALUES ("Projeto 2", 'T', "Joao", 148, 11/04/2002, "Rua bla bla", 1 , 2000, 146, 125);
INSERT INTO Empregado VALUES ("Projeto 3", 'T', "Pedro", 149, 23/06/1999, "Rua bla bla", 1 , 4000, 147, 225);

ALTER TABLE Projeto CHANGE COLUMN PLocalizacao PLocalizacao VARCHAR(45);
INSERT INTO Projeto (PNumero, PNome) VALUES (12, "Projeto bla bla");
INSERT INTO Projeto (PNumero, PNome) VALUES (13, "Projeto 2");
INSERT INTO Projeto (PNumero, PNome) VALUES (14, "Projeto 3");

INSERT INTO Empregado VALUES ("Projeto 3", 'T', "Rosa", 150, 28/07/1998, "Rua bla bla", 1 , 3000, 147, 125);

UPDATE Empregado SET SSN_Supervisor = 147 WHERE SSN = 148;
UPDATE Empregado SET SSN_Supervisor = 148 WHERE SSN = 149;
UPDATE Empregado SET SSN_Supervisor = 148 WHERE SSN = 150;

UPDATE Departamento SET SSN_Empregado = 146 WHERE DNumero = 125;
UPDATE Departamento SET SSN_Empregado = 147 WHERE DNumero = 225;

UPDATE Projeto SET PLocalizacao = "Rua blabla 1", DNumero_Departamento = 125 WHERE PNumero = 12;
UPDATE Projeto SET PLocalizacao = "Rua blabla 2", DNumero_Departamento = 125 WHERE PNumero = 13;
UPDATE Projeto SET PLocalizacao = "Rua blabla 3", DNumero_Departamento = 225 WHERE PNumero = 14;

DELETE FROM Projeto WHERE DNumero_Departamento = 225;




