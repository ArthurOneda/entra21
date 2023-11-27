CREATE TABLE pessoa(
cd_pessoa INTEGER,
nm_pessoa VARCHAR(150),
fl_estado_civil CHAR(1)
);

CREATE TABLE sala_de_aula(
qt_alunos INTEGER,
nm_professor VARCHAR(150),
periodo CHAR(1)
);

CREATE TABLE categoria(
id INTEGER PRIMARY KEY,
mn_categoria VARCHAR(50),
ds_categoria VARCHAR(150)
);

CREATE TABLE cliente(
id INTEGER,
nm_cliente VARCHAR(150),
ds_cpf CHAR(11),
bl_cooperado BOOLEAN,
dt_nascimento date
);

CREATE TABLE voo(
nr_numero INTEGER,
qnt_passagens INTEGER,
hr_decolagem DATETIME,
hr_prevista DATETIME,
ds_destino VARCHAR(150),
preco_passagem decimal
);

ALTER TABLE sala_de_aula ADD COLUMN fl_monitor INTEGER;
ALTER TABLE sala_de_aula DROP fl_monitor;
ALTER TABLE pessoa MODIFY nm_pessoa VARCHAR(100);
#ALTER TABLE cliente ADD telefone CHAR(14);
#ALTER TABLE cliente ADD descricao VARCHAR(200);
#ALTER TABLE cliente ADD email VARCHAR(150);
#ALTER TABLE cliente DROP dt_nascimento;
#ALTER TABLE cliente DROP bl_cooperado;

CREATE TABLE departamento (
id INTEGER PRIMARY KEY,
ds_departamento VARCHAR(150)
);

CREATE TABLE chefe (
id INTEGER PRIMARY KEY,
ds_nome VARCHAR (50),
cd_departamento INTEGER REFERENCES departamento (id)
);

CREATE TABLE endereco(
id INTEGER PRIMARY KEY,
municipio VARCHAR(50),
bairro VARCHAR(50)
);

CREATE TABLE cliente(
id INTEGER PRIMARY KEY,
nm_cliente VARCHAR(150),
ds_cpf CHAR(11),
bl_cooperado BOOLEAN,
dt_nascimento DATE,
cd_edereco INTEGER REFERENCES endereco (id)
);

CREATE TABLE produto (
id INTEGER PRIMARY KEY,
nm_produto VARCHAR(50),
qt_estoque INTEGER,
vl_produto DECIMAL,
cd_categoria INTEGER REFERENCES categoria (id)
);

CREATE TABLE pessoa (
id INTEGER PRIMARY KEY,
nome VARCHAR(50),
cpf CHAR(11),
gerente BOOLEAN,
empregado boolean
);

CREATE TABLE empresa (
id INTEGER PRIMARY KEY,
cnpj CHAR(18),
qtd_funcionários INTEGER
);

CREATE TABLE pessoa_empresa (
cd_pessoa INTEGER REFERENCES pessoa (id),
cd_empresa INTEGER REFERENCES empresa (id)
);

