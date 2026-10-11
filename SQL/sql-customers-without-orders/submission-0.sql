-- Write your query below

select c.name from orders o right join customers c on c.id=o.customer_id where c.id not in(select customer_id from orders);