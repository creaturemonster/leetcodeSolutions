Select e.name, b.bonus
From Employee e
LEFT OUTER JOIN BONUS b
ON e.empId=b.empId
WHERE b.bonus < 1000 OR b.bonus IS NULL;
