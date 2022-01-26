5. Get all Bands that have No Albums
This is very similar to #4 but will 
require more than just a join.

Return the band name as `Band Name`.

SELECT bands.name AS 'Band Name'
FROM bands
LEFT JOIN albums ON bands.id = albums.band_id
GROUP BY albums.band_id
HAVING COUNT(albums.id) = 0;