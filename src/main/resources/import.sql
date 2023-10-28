INSERT INTO TB_PRODUTO (nome, descricao, preco, imagem) VALUES ('Pao de Frances', 'Pão de Frances', 0.5, 'https://amopaocaseiro.com.br/wp-content/uploads/2019/12/pao-de-forma-caseiro_02-840x560.jpg');
INSERT INTO TB_PRODUTO (nome, descricao, preco, imagem) VALUES ('Pao Integral', 'Pão Integral feito com ingredientes naturais', 1.5, 'https://encurtador.com.br/lGLP9');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Manteiga', 'Qually Com Sal', '7.5');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Manteiga', 'Delicia Com Sal', '7.8');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Manteiga', 'Qually Sem Sal', '7.5');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Manteiga', 'Delicia Sem Sal', '7.5');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Mortandela Defumada', 'Bandeja de Mortadela Defumada 0.500kg', '7.0');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Mortandela', 'Bandeja de Mortadela 0.500kg', '5.0');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Queijo Mussarela', 'Bandeja Queijo Mussarela', '6.5');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Queijo Prado', 'Bandeja Queijo Prado', '8.5');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Caixa de leite', 'Caixa de Leite Integral', '5.5');
INSERT INTO TB_PRODUTO (nome, descricao, preco) VALUES ('Caixa de leite de Soja', 'Caixa de Leite de Soja', '10.5');


INSERT INTO TB_CLIENTE (nome, cpf, telefone, email, endereco, imagem) VALUES ('CLIENTE 0','000.000.000-00','67 3461-0000','systempad@gmail.com', 'AV. Dourados, 111', 'https://cdn-icons-png.flaticon.com/512/17/17004.png');
INSERT INTO TB_CLIENTE (nome, cpf, telefone, email, endereco, imagem) VALUES ('Pedro B','111.222.070-99','67 99999-0000','samuel@gmail.com', 'AV. Dourados, 111', 'https://cdn-icons-png.flaticon.com/512/17/17004.png');
INSERT INTO TB_CLIENTE (nome, cpf, telefone, email, endereco, imagem) VALUES ('Jotinha A','111.222.070-99','67 99999-0000','samuel@gmail.com', 'AV. Dourados, 111', 'https://cdn-icons-png.flaticon.com/512/17/17004.png');
INSERT INTO TB_CLIENTE (nome, cpf, telefone, email, endereco, imagem) VALUES ('Marcos R','111.222.070-99','67 99999-0000','samuel@gmail.com', 'AV. Dourados, 111', 'https://cdn-icons-png.flaticon.com/512/17/17004.png');
INSERT INTO TB_CLIENTE (nome, cpf, telefone, email, endereco, imagem) VALUES ('Gabriel S','111.222.070-99','67 99999-0000','samuel@gmail.com', 'AV. Dourados, 111', 'https://cdn-icons-png.flaticon.com/512/17/17004.png');
INSERT INTO TB_CLIENTE (nome, cpf, telefone, email, endereco, imagem) VALUES ('Caio M','111.222.070-99','67 99999-0000','samuel@gmail.com', 'AV. Dourados, 111', 'https://cdn-icons-png.flaticon.com/512/17/17004.png');


INSERT INTO TB_ATENDENTE (nome, cpf, telefone, email) VALUES ('Samuel Atendente','111.222.070-99','67 99999-0000','samuel@gmail.com');
INSERT INTO TB_ATENDENTE (nome, cpf, telefone, email) VALUES  ('Gabriel','111.333.060-99','67 99999-0011','gabriel@gmail.com');


INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('PIX', 1 , 1);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('CARTAODEBITO', 2, 2);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('CARTAOCREDITO', 2, 3);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('AVISTA', 1, 4); 
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('PIX', 1 , 1);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('CARTAODEBITO', 2, 2);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('CARTAOCREDITO', 2, 5);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('AVISTA', 1, 2); 
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('PIX', 1 , 6);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('CARTAODEBITO', 2, 2);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('CARTAOCREDITO', 2, 6);
INSERT INTO TB_VENDA (pagamento, id_atendente_fk, id_cliente_fk) VALUES ('AVISTA', 1, 2); 


INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('1', 1, 1);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('2', 1, 2);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('3', 3, 3);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('4', 4, 4);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('5', 2, 1);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('6', 1, 2);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('7', 3, 3);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('8', 6, 4);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('9', 2, 1);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('10', 1, 2);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('11', 3, 3);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('12', 4, 4);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('12', 7, 1);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('11', 5, 2);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('10', 9, 3);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('9', 4, 4);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('1', 2, 1);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('2', 10, 2);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('3', 3, 3);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('4', 8, 4);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('5', 2, 1);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('6', 11, 2);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('7', 3, 3);
INSERT INTO TB_ITEM_VENDA (quantidade, id_produto_fk, id_venda_fk) values ('8', 12, 4);


//QUERRY DE PESQUISAS

// SELECIONANDO O ID DO CLIENTE E BUSCANDO ID, NOME, TELEFONE E O ID DAS VENDAS Q ELE JA REALIZOU
// SELECT c.id, c.nome, c.telefone, v.id_venda  FROM tb_cliente c, tb_venda v  WHERE c.id = v.id_cliente_fk and c.id = 1

// SELECIONANDO O ID, NOME E TELEFONE DO CLIENTE E A FORMA DE PAGAMENTO
//SELECT c.id, c.nome, c.telefone, v.pagamento, v.id_venda FROM tb_cliente c, tb_venda v  WHERE c.id = v.id_cliente_fk and v.pagamento = 'PIX'

