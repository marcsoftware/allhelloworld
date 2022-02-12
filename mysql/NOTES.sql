mysql -u root
source \home\user\Desktop\test.sql;
source \work\allhelloworld\mysql\schemas.sql

 commands : select where from 
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
select name from albums;
select distinct name from album ;
update albums set relsear_year = 1982;//wrong changes all records :(
    update albums set release_year = 1982
        where id=1;

select * from albums where
relsease<2000;


select * from albums
where name like '%er%';

select * from albums
where name like '%er%'or band_id=2;


select * from albums
where name release_year = 1984 and band_id=1;

select * from albums
where relsear_year between 2000 and 2018;

select * from albums 
where release_year is null;

delete from albums where id = 5;

select * from bands
join albums on bands.id=albums.band_id;
//select when equal

join
inner join 
left join // returns left side even if no match
right join // returns right side even if no match

select avg(relsease_year) from albums;
select SUM(relsease_year) from albums;
select band_id, count(band_id) from albums
group by band_id; // squish matching band_id in to one

excersies in video
https://github.com/WebDevSimplified/Learn-SQL

select b.name as band_name, count(a.id) as num_albums
from bands as b 
left join albums as a on b.id=a.band_id
group by b.id;

select b.name as band_name, count(a.id) as num_albums
from bands as b 
left join albums as a on b.id=a.band_id
where num_albums =1 // wont work since where happends after group by
group by b.id;


select b.name as band_name, count(a.id) as num_albums
from bands as b 
left join albums as a on b.id=a.band_id
group by b.id
having num_albums =1;


select b.name as band_name, count(a.id) as num_albums
from bands as b 
left join albums as a on b.id=a.band_id
where b.name='deuce'
group by b.id
having num_albums =1;


