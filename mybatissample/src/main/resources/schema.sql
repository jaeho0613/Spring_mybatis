drop table if exists Products;

create table Products
(
    prod_id         identity        primary key,
    prod_name       varchar(255)    not null,
    prod_price      int             not null
);