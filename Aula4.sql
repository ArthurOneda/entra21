SELECT AVG(qt_alunos), SUM(qt_alunos) FROM sala_de_aula;

SELECT AVG(vl_produto) FROM produto;
SELECT SUM(vl_produto) FROM produto;

SELECT MAX(dt_nascimento) FROM cliente;
SELECT MIN(dt_nascimento) FROM cliente;

SELECT COUNT(cd_edereco), cd_edereco FROM cliente GROUP BY(cd_edereco);

SELECT COUNT(bl_cooperado) FROM cliente WHERE bl_cooperado = TRUE;

#Exercício 1
SELECT AVG(YEAR(CURRENT_DATE) - YEAR(dt_nascimento)) FROM cliente;
#Exercício 2
SELECT SUM(qt_estoque) FROM produto;
#Exercício 3
SELECT MAX(vl_produto) FROM produto;
#Exercício 4
SELECT SUM(vl_produto) FROM produto WHERE cd_categoria = 1;
#Exercício 5
SELECT nm_produto, vl_produto FROM produto WHERE vl_produto = (SELECT MIN(vl_produto) FROM produto);
#Exercício 6
SELECT COUNT(c.cd_edereco), e.municipio FROM cliente AS c JOIN endereco AS e ON c.cd_edereco = e.id GROUP BY(e.municipio);
#Exercício 7
SELECT AVG(p.qt_estoque), c.mn_categoria FROM produto AS p JOIN categoria AS c ON p.cd_categoria = c.id GROUP BY(p.cd_categoria);
#Exercício 9
SELECT COUNT(p.cd_categoria), c.mn_categoria FROM produto AS p JOIN categoria AS c ON p.cd_categoria = c.id GROUP BY(c.id);