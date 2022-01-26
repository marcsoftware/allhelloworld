### 6. Get the Longest Album

[Solution](solutions/6.sql)

This problem sounds a lot like #3 
but the solution is quite a bit different.
 I would recommend looking up the SUM 
 aggregate function.

Return the album name as `Name`, 
the album release year as `Release Year`,
 and the album length as `Duration`.
 
SELECT
  albums.name as Name,
  albums.release_year as 'Release Year',
  SUM(songs.length) as 'Duration'
FROM albums
JOIN songs on albums.id = songs.album_id
GROUP BY songs.album_id
ORDER BY Duration DESC
LIMIT 1;