create database Customer;

use Customer;

create table
(
    FirstName varchar(50),
    LastName varchar(50),
    Age int
);

insert into Customer
    (FirstName, LastName, [Age])
    values ('Joey', 'Blue', 40);

select * 
from Customer;

select FirstName, LastName, Age
from Customer;

select FirstName, LastName
from Customer;

select FirstName, LastName
from Customer
where FirstName='Mike';

select FirstName, LastName
from Customer
where FirstName='Mike'
and LastName='Schmidt';

-- % means starts with Schmidt and end with anything else
select FirstName, LastName
from Customer
where FirstName='Mike'
and LastName like 'Schmidt%';

-- _ means starts with Schmidt and has to match something
select FirstName, LastName
from Customer
where FirstName='Mike'
and LastName like 'Schmidt_';

update Customer
set Age=20
where FirstName='Mike'
and LastName='Schmidt';

DELETE Customer;

DELETE Customer;
where FirstName='Mike'
and LastName= liek 'Schmidt_';

alter table Customer
add City varchar(50);

update Customer
set City='New York'
where FirstName='Mike'
and LastName='Schmidt';

drop table Customer;

create table
(
    id int Primary Key,
    FirstName varchar(50),
    LastName varchar(50),
    Age int,
    City varchar(50)
);

create table Products
(
    id int primary key identity(1,1),
    ProductName varchar(50)
);

alter table Products
add Price float;

select * from Products;

insert into Products (ProductName, Price) values ('Baseball', 5.95);

Create table Orders
(
    orderId int primary key identity(1,1),
    OrderDate Datetime,
    CustomerID int,
    ProductID int
)

select * from Orders;

insert into Orders (OrderDate, CustomerID, ProductID)
    values (GetDate(), 2, 2);

--this allows our relations to be solid
alter table Orders
add foreign key (CustomerId) references Customer(id);

alter table Orders
add foreign key (ProductId) references Product(id);

--inner jin means everything has to equal out in both tables
select * from Orders as o
inner join Producst as p on o.ProductID=p.id;

-- as is optional
select * from Orders o
inner join Producst p on o.ProductID=p.id;

select o.*, p.*, c.*
from Orders o
inner join Producst p on o.ProductID=p.id
inner join Customer c on o.CustomerID=c.Id;

select o.OrderDate, p.ProductName, p.ProductPrice c.*
from Orders o
inner join Producst p on o.ProductID=p.id
inner join Customer c on o.CustomerID=c.Id;

select sum(p.ProductPrice) 
from Orders o
inner join Producst p on o.ProductID=p.id
inner join Customer c on o.CustomerID=c.Id;

select sum(p.ProductPrice) as total
from Orders o
inner join Producst p on o.ProductID=p.id
inner join Customer c on o.CustomerID=c.Id;

select c.LastName, sum(p.ProductPrice) total
from Orders o
inner join Producst p on o.ProductID=p.id
inner join Customer c on o.CustomerID=c.Id
group by c.LastName;

select c.LastName, p.ProductName, sum(p.ProductPrice) total
from Orders o
inner join Producst p on o.ProductID=p.id
inner join Customer c on o.CustomerID=c.Id
group by c.LastName, p.ProductName;

select c.City, sum(p.ProductPrice), AVG(p.Price) total
from Orders o
inner join Producst p on o.ProductID=p.id
inner join Customer c on o.CustomerID=c.Id
group by c.City;