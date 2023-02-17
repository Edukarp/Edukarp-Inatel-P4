#Fazendo um Autorelacionamento
Select e.nome as 'Empregado', s.nome as 'Supervisor'
From empregado as e, empregado as s
Where e.SSN_Supervisor = s.SSN;

#Fazendo um Join com 3 tabelas
Select e.Pnome as 'Empregado' , p.Pnome as 'Projeto'
From empregado as e, projeto as p, trabalha_em as te
Where te.SSN_Empregado = e.SSN and te.PNumero_Projeto = p.PNumero; #FK com PK

#Retirando repeticoes em buscas
Select Distinct SSN_Supervisor
From Empregado;
