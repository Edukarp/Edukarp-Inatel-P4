#Select Simples -> Envolve geralmente uma unica tabela
SELECT pnome, salario FROM empregado WHERE salario > 3000;

#Select com duas Tabelas (e sem apelidos)
SELECT pnome,dnome FROM empregado,departamento WHERE DNumero_Departamento = DNumero;

#Select com duas Tabelas com inner join
SELECT e.pnome, d.dnome FROM empregado as e inner join Departamento as d on e.DNumero_Departamento = d.DNumero;

#Select com duas Tabelas sem inner join
SELECT e.pnome, d.dnome FROM empregado as e,departamento as d WHERE e.DNumero_Departamento = d.DNumero;

#Select com autorelacionamento
SELECT emp.pnome, sup.pnome FROM empregado as emp, empregado as sup WHERE emp.SSN_Supervisor = sup.SSN;

#Select como produto cartesiano
SELECT * FROM empregado,projeto;

#Select de valores diferentes
SELECT DISTINCT pnome,SSN_Supervisor FROM empregado;

#Select baseado num padrao de caracteres
SELECT * FROM projeto WHERE Pnome LIKE '%__X';

#Select com valor aritimetico
SELECT PNome, salario*1.25 as 'Novo Salario' FROM empregado WHERE salario < 3000;
