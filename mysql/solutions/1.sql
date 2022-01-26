1. Create a Songs Table
This table should be called `songs` 
and have four properties with these exact names.

1. `id`: An integer that is the 
primary key, and auto increments.
2. `name`: A string that cannot be null.
3. `length`: A float that represents
 the length of the song in minutes that cannot be null.
4. `album_id`: An integer that is 
a foreign key referencing the albums 
table that cannot be null.
-----
CREATE TABLE songs (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  length FLOAT NOT NULL,
  album_id INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (album_id) REFERENCES albums(id)
);