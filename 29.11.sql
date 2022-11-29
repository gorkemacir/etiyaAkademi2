--yaşı 2000'den büyük olan müşterileri listele.
select * from customers
where DATE_PART('year',birthday) < 2000

-- yaşı 22 olan müşterileri getir.
select * from customers
where date_part('year', current_date) - date_part('year',birthday) = 22

--ödemesi 2020'den sonra yapılan siparişlerin müşteri numarası getirildi.
select payment_date,cu.customer_no from payments pa
inner join orders od on pa.id=od.payment_id
inner join customers cu on od.customer_id=cu.id
where date_part('year',payment_date) > 2020

--son 10 günde yapılan siparişler.
select * from orders
where date_part('days',current_date :: timestamp - order_date :: timestamp) <= 10 

-- birden fazla sipariş verilen yıllar.
Select extract(year from order_date), count(*) from orders
group by extract(year from order_date)
having count(*)>1

-- belirli tarihler arasındaki siparişler.
select * from orders
where date_part('year',order_date) between 2020 and 2022

--  doğum günü bugün olan müşteriler.
Select * from customers 
where date_part('day', birthday::timestamp)=date_part('day', current_date::timestamp) 
and date_part('month', birthday::timestamp)=date_part('month', current_date::timestamp) ;

-- müşterilerin yaşları getirildi ve müşteri numarasına göre sıralandı.
select customers.customer_no as "Müşteri Numarası",date_part('year', current_date) - date_part('year',birthday) as "Yaş"
from customers
group by customers.customer_no,date_part('year', current_date) - date_part('year',birthday)

-- müşterilerin yaş ortalaması.
select AVG(date_part('year', current_date) - date_part('year',birthday)) as "Yaş Ortalaması"
from customers

-- 2021 yılında sipariş edilen ürünler.
select pd.name , od.order_date from orders od
inner join order_details odd on od.id=odd.order_id
inner join products pd on odd.product_id=pd.id
where date_part('year',order_date)=2021




