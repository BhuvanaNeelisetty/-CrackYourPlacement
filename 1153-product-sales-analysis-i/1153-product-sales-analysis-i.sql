# Write your MySQL query statement below
select Product.product_name as product_name,sales.year as year, sales.price as price from Product,sales where product.product_id=sales.product_id;