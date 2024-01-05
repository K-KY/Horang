drop table if exists sample;
create table sample
(
    id     bigint not null auto_increment,
    age    integer,
    name   varchar(255),
    region varchar(255),
    primary key (id)
)
