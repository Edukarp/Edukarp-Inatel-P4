create database if not exists teorica;
use teorica;

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