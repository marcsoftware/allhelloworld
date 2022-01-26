### 8. Insert a record for your favorite Band and one of their Albums

[Solution](solutions/8.sql)

If you performed this correctly you should be able to now see that band 
and album in your tables.

INSERT INTO bands (name)
VALUES ('Favorite Band Name');

/* This is the query used to get the band id of the band just added */
/*
  SELECT id FROM bands
  ORDER BY id DESC LIMIT 1;
*/

INSERT INTO albums (name, release_year, band_id)
VALUES ('Favorite Album Name', 2000, 8);