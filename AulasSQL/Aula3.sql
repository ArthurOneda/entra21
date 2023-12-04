SELECT * FROM categoria;

SELECT mn_categoria, ds_categoria FROM categoria;

SELECT * FROM produto;

SELECT id FROM categoria;

SELECT nm_cliente, dt_nascimento FROM cliente;

SELECT * FROM cliente WHERE nm_cliente = 'João Silva' OR nm_cliente = 'Carlos Santos';

SELECT * FROM cliente ORDER BY nm_cliente ASC;
SELECT * FROM cliente ORDER BY nm_cliente DESC;

SELECT * FROM produto ORDER BY vl_produto ASC;
SELECT * FROM produto ORDER BY vl_produto DESC;

SELECT * FROM cliente WHERE bl_cooperado = TRUE;
SELECT nm_cliente, ds_cpf FROM cliente WHERE dt_nascimento > '1990-01-01';
SELECT nm_cliente, ds_cpf, cd_edereco FROM cliente WHERE cd_edereco = 2;
SELECT nm_cliente, dt_nascimento FROM cliente ORDER BY dt_nascimento ASC;
SELECT nm_cliente, ds_cpf FROM cliente WHERE bl_cooperado = TRUE AND cd_edereco = 2;

SELECT * FROM produto WHERE vl_produto > 100;
SELECT nm_produto, qt_estoque FROM produto WHERE cd_categoria = 1;
SELECT nm_produto, vl_produto, cd_categoria FROM produto WHERE vl_produto >= 10 AND vl_produto <= 50;
SELECT nm_produto, cd_categoria FROM produto WHERE qt_estoque > 10;
SELECT nm_produto, qt_estoque FROM produto WHERE cd_categoria = 3 AND vl_produto > 30;

SELECT c.nm_cliente, e.municipio, e.bairro FROM cliente AS c, endereco AS e WHERE c.cd_edereco = e.id;

SELECT * FROM cliente AS c JOIN endereco AS e ON c.cd_edereco = e.id;

SELECT * FROM produto AS p JOIN categoria AS c ON p.cd_categoria = c.id;

SELECT c.nm_cliente, c.ds_cpf, e.bairro FROM cliente AS c JOIN endereco AS e ON e.municipio = 'Cidade A' AND c.cd_edereco = e.id;
SELECT c.nm_cliente, c.dt_nascimento, e.municipio FROM cliente AS c JOIN endereco AS e ON c.cd_edereco = e.id ORDER BY e.municipio ASC;
SELECT c.nm_cliente, c.ds_cpf, e.bairro FROM cliente AS c JOIN endereco AS e ON e.bairro = 'Centro' AND c.cd_edereco = e.id AND c.bl_cooperado = TRUE;
SELECT c.nm_cliente, c.dt_nascimento, e.municipio, e.bairro FROM cliente AS c JOIN endereco AS e ON c.dt_nascimento > '1990-01-01' AND c.cd_edereco = e.id ORDER BY c.dt_nascimento ASC;
SELECT c.nm_cliente, c.ds_cpf, e.municipio FROM cliente AS c JOIN endereco AS e ON c.bl_cooperado = FALSE AND c.cd_edereco = e.id ORDER BY e.municipio, c.nm_cliente;

SELECT p.nm_produto, p.qt_estoque, p.vl_produto FROM produto AS p JOIN categoria AS c ON p.cd_categoria = c.id AND c.mn_categoria = 'Eletrônicos';