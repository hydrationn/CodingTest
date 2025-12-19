SELECT
    P1.ID, 
    P1.NAME, 
    P1.HOST_ID
FROM 
    PLACES P1
JOIN 
    (
        SELECT
            *
        FROM 
            PLACES
        GROUP BY
            HOST_ID
        HAVING
            COUNT(HOST_ID) >= 2
    ) AS P2
ON P1.HOST_ID = P2.HOST_ID
ORDER BY
    P1.ID;