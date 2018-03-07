drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user
(
   id                   bigint not null,
   name                 varchar(50),
   age                  int,
   sex                  tinyint,
   createTime           datetime,
   primary key (id)
);
