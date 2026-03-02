SELECT 
    T.CAR_ID,
    T.CAR_TYPE,
    T.FEE
FROM 
    (SELECT 
        CH.CAR_ID,
        P.CAR_TYPE,
        ROUND(CH.DAILY_FEE * 30 * (100 - P.DISCOUNT_RATE) / 100, 0) AS FEE
     FROM 
        (SELECT
            C.CAR_ID, C.CAR_TYPE, C.DAILY_FEE
        FROM
            CAR_RENTAL_COMPANY_CAR C 
            LEFT JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H 
             ON C.CAR_ID = H.CAR_ID 
             AND H.START_DATE <= '2022-11-30'
             AND H.END_DATE >= '2022-11-01'
        WHERE
            C.CAR_TYPE IN ('세단', 'SUV') 
        GROUP BY
            C.CAR_ID, C.CAR_TYPE, C.DAILY_FEE
        HAVING
            COUNT(H.HISTORY_ID) = 0
        ) CH
     JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN P 
       ON CH.CAR_TYPE = P.CAR_TYPE
      AND P.DURATION_TYPE = '30일 이상'
    ) T
WHERE
    500000 <= T.FEE AND T.FEE < 2000000
ORDER BY
    T.FEE DESC, T.CAR_TYPE ASC, T.CAR_ID DESC;