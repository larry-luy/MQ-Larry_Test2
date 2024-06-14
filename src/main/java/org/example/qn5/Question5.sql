SELECT a.company_name, COUNT(b.employee_id) AS COUNT
FROM Company a
LEFT JOIN Employee b ON a.company_id = b.company_id
GROUP BY a.company_name;