CREATE TABLE IF NOT EXISTS products
(
product_id varchar(60) primary key,
title varchar(200),
description varchar(200),
price varchar(50),
discount varchar(10),
discounted_price varchar(10)
);