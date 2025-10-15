# Write your MySQL query statement below
SELECT customer_id, COUNT(visit_id) as count_no_trans FROM Visits 
WHERE visit_id NOT in (SELECT visit_id FROM Transactions)
GROUP BY 1;