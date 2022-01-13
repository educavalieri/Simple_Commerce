INSERT INTO tb_user(name_user, cpf) VALUES ('Eduardo', '279');
INSERT INTO tb_user(name_user, cpf) VALUES ('Camila', '287');
INSERT INTO tb_user(name_user, cpf) VALUES ('Leonardo', '456');
INSERT INTO tb_user(name_user, cpf) VALUES ('Rafael', '789');

INSERT INTO tb_product(name, stock, type) VALUES ('Celular', 5, 'ELETRONIC');
INSERT INTO tb_product(name, stock, type) VALUES ('Geladeira', 11, 'ELETRONIC');
INSERT INTO tb_product(name, stock, type) VALUES ('Frigobar', 7, 'ELETRONIC');
INSERT INTO tb_product(name, stock, type) VALUES ('Ervin brogovic', 3, 'BOOK');
INSERT INTO tb_product(name, stock, type) VALUES ('O Senhor dos aneis', 2, 'BOOK');
INSERT INTO tb_product(name, stock, type) VALUES ('Pastel', 10, 'GENERIC');
INSERT INTO tb_product(name, stock, type) VALUES ('Pamonha', 16, 'GENERIC');


INSERT INTO tb_order(order_number, product_id_order, user_id_order) VALUES (1, 1, 1);
INSERT INTO tb_order(order_number, product_id_order, user_id_order) VALUES (2, 1, 3);
INSERT INTO tb_order(order_number, product_id_order, user_id_order) VALUES (3, 2, 2);
