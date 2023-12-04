#1.(4,0 Pontos) Criação das estruturas do modelo (tabelas, atributos e restrições);

CREATE TABLE usuario(
cd_usuario INTEGER PRIMARY KEY,
nm_usuario VARCHAR(50) NOT NULL,
ds_email VARCHAR(50) NOT NULL,
nr_telefone VARCHAR(15) NOT NULL
);

CREATE TABLE servico(
cd_servico INTEGER PRIMARY KEY,
ds_servico VARCHAR(50) NOT NULL,
ds_sugestao VARCHAR(200) NOT NULL
);

CREATE TABLE ordem_servico(
nr_os INTEGER PRIMARY KEY,
cd_usuario INTEGER REFERENCES usuario(cd_usuario),
dt_registro DATE NOT NULL,
ds_observacao VARCHAR(200) NOT NULL
);

ordem_servicoCREATE TABLE itens_ordem_servico(
nr_os INTEGER REFERENCES ordem_servico(nr_os),
cd_servico INTEGER REFERENCES servico(cd_servico),
dt_atendimento DATE NOT NULL,
ds_atendimento VARCHAR(100) NOT NULL
);

#2.(1,0 Ponto) Inserção de dados: 03 usuários; 05 serviços; 05 ordens de serviço com data de registro em qualquer dia do
#mês de novembro/2023 e com, no mínimo, 02 serviços em cada ordem;

INSERT INTO usuario(cd_usuario, nm_usuario, ds_email, nr_telefone) VALUES
(1, 'Usuário A', 'usuarioa@exemplo.com', '123456789012345'),
(2, 'Usuário B', 'usuariob@exemplo.com', '987654321098765'),
(3, 'Usuário C', 'usuarioc@exemplo.com', '567890123456789');

INSERT INTO servico(cd_servico, ds_servico, ds_sugestao) VALUES
(1, 'Ventilador não funcionando', 'Trocar o ventilador'),
(2, 'Monitor fica com a tela preta', 'Conferir os cabos ou trocar o monitor'),
(3, 'Sistema administrativo não funcionando', 'Acionar o TI'),
(4, 'Fio de energia exposto', 'Desligar a energia e trocar o fio'),
(5, 'Computador desligando sozinho', 'Conferir os cabos e a fonte do computador');

INSERT INTO ordem_servico(nr_os, cd_usuario, dt_registro, ds_observacao) VALUES
(1, 1, '2023-11-01', 'Desligar energia somente da sala para trocar o fio'),
(2, 3, '2023-11-06', 'Sistema não reconhece meu login'),
(3, 1, '2023-11-11', 'Ventilador fica desligando'),
(4, 2, '2023-11-16', 'Computador deligou sozinho novamente'),
(5, 2, '2023-11-21', 'Sistema não quer abrir');

INSERT INTO itens_ordem_servico(nr_os, cd_servico, dt_atendimento, ds_atendimento) VALUES
(1, 4, '2023-11-02', 'Fio será trocado durante o sábado'),
(1, 1, '2023-11-02', 'Será trocado junto do fio'),
(2, 3, '2023-11-08', 'concluído'),
(2, 2, '2023-11-08', 'concluído'),
(3, 1, '2023-11-12', 'concluído'),
(3, 3, '2023-11-12', 'concluído'),
(4, 5, '2023-11-18', 'A fonte será trocada devido a um problema no encaixe fêmea'),
(4, 4, '2023-11-18', 'O fio será trocado'),
(5, 3, '2023-11-23', 'concluído'),
(5, 5, '2023-11-23', 'concluído');

#3.(1.0 Ponto) Exibir a quantidade média de serviços associados as ordens de serviço cadastradas;
SELECT COUNT(cd_servico) FROM itens_ordem_servico GROUP BY(nr_os);

#4.(1.5 Pontos) Listar as ordens de serviço registradas entre os dias 10 e 15 de novembro de 2023 (inclusive estas datas),
#com respectivo nome de usuário que solicitou e respectivas descrições dos serviços associados a cada ordem;
SELECT os.nr_os, nm_usuario, ds_servico 
FROM usuario AS u
JOIN ordem_servico AS os ON u.cd_usuario = os.cd_usuario 
JOIN itens_ordem_servico AS i ON os.nr_os = i.nr_os
JOIN servico AS s ON i.cd_servico = s.cd_servico 
WHERE os.dt_registro > '2023-11-10' AND os.dt_registro < '2023-11-15';


#5.(1,0 Ponto) Exibir o nome do usuário com a respectiva quantidade de ordens de serviço que solicitou;
SELECT COUNT(nr_os), nm_usuario FROM usuario AS u JOIN ordem_servico AS os ON u.cd_usuario = os.cd_usuario GROUP BY nm_usuario;


#6.(1,5 Pontos) Listar o número da ordem de serviço, a data de registro da mesma e descrição do(s) serviço(s) associado(s)
#a respectiva ordem de serviço onde a descrição do serviço é diferente de “concluído”
SELECT ios.nr_os, os.dt_registro, s.ds_servico FROM ordem_servico AS os JOIN itens_ordem_servico AS ios ON ios.nr_os = os.nr_os
JOIN servico AS s ON ios.cd_servico = s.cd_servico WHERE ios.ds_atendimento <> 'concluido' GROUP BY ios.nr_os;