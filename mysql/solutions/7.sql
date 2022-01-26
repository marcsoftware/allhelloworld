### 7. Update the Release Year of the Album with no Release Year

[Solution](solutions/7.sql)

Set the release year to 1986.

You may run into an error if you try to update 
the release year by using `release_year IS NULL`
in the WHERE statement of your UPDATE. This is 
because MySQL Workbench by default will not let 
you update a table that has a primary key without
 using the primary key in the UPDATE statement. 
 This is a good thing since you almost never want 
 to update rows without using the primary key, so 
 to get around this error make sure to use the 
 primary key of the row you want to update in 
 the WHERE of the UPDATE statement.

/* This is the query used to get the id */
/*
  SELECT * FROM albums where release_year IS NULL;
*/

UPDATE albums
SET release_year = 1986
WHERE id = 4;