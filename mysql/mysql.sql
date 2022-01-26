select where from 
not case sensative
best pracatice to uppcase keywords
select * from table;
'this string'

create database test;
click regresh to make UI render
drop database test;

create database record_company;
use record_company;
create table test(
    test_column INT

);

alter table test
add another_column varchar(255);

drop table test;
create table bands(
    id INT NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    PRIMARY KEY (id)    
    );


create table albums(
 id inT NOT NULL AUTO_INCREMENT,
 name varchar(255) not null,
 release_year INT ,
 band_id int not null, 
 primary key(id),
 foreign key(band_id) references bands(id)
);


insert into bands (name) 
    values ('iron maiden');

insert into bands (name)
    values ('deuce'),('avenged sevenfold'),('ankor');


select * from bands;

select * from bands limit 2;
select name from bands;
select id as 'ID' , name AS 'band name' from bands;

select * from bands order by name;
select * from bands order by name DESC;
select * from bands order by name ASC;
insert into albums(name, release_year,band_id)
    values('numnber of beast',1985,1),
    ('power slace', 1984,1),
    ('nightmare',2018,2),
    ('nightmare',2010,3),
    ('test album',NULL,3);

SELECT * from albums;
31:49

