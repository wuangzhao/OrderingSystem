create table address_info
(
  user_id    varchar(100) not null,
  address_id varchar(100) not null,
  address    tinytext     not null,
  tel_phone  varchar(20)  not null,
  receiver   tinytext     not null
);

create table admin_order_form
(
  admin_order_id int auto_increment
    primary key,
  order_form_id  int not null,
  constraint order_form_id_UNIQUE
  unique (order_form_id)
);

create table food_info
(
  food_name    tinytext     null,
  food_img     tinytext     null,
  food_price   tinytext     null,
  food_reserve tinytext     null,
  food_details tinytext     null,
  food_id      varchar(100) null
);

create table home_img
(
  home_img_id   int auto_increment
    primary key,
  home_img_path tinytext not null
);

create table order_form_food_detail_info
(
  order_form_id varchar(100) not null,
  food_id       varchar(100) not null,
  amount        double       not null
);

create table order_form_info
(
  order_form_id int auto_increment
    primary key,
  user_id       varchar(100)                       not null,
  status        int                                null,
  create_time   datetime default CURRENT_TIMESTAMP null
);

create table recommend_info
(
  recommend_id int(100) auto_increment
    primary key,
  food_id      varchar(100) not null
);

create table sales_info
(
  sales_id int(20) auto_increment
    primary key,
  food_id  varchar(100) not null
);

create table season_info
(
  season_id int(20) auto_increment
    primary key,
  food_id   varchar(100) not null
);

create table shopping_cart
(
  user_id     varchar(20) not null,
  food_id     varchar(20) null,
  food_amount int         null
);

create table user_info
(
  user_id       int auto_increment,
  user_name     tinytext        not null,
  user_password tinytext        not null,
  user_tel      varchar(11)     null,
  user_group    int default '1' null,
  constraint user_id_UNIQUE
  unique (user_id)
);

alter table user_info
  add primary key (user_id);


