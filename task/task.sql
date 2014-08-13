drop database Logiweb;
create database Logiweb;
use Logiweb;

create table Trucks (
    id int unsigned auto_increment primary key,
    reg_number char(7),
    capacity int,
    drivers_qty int
);

create table Orders (
    id int unsigned auto_increment primary key,
    truckId int unsigned,
    foreign key (truckId)
        REFERENCES Trucks (id),
    order_state char(11) NOT NULL default 'create',
    gps decimal,
    loading varchar(50),
    weight int
);

create table Users (
    id int unsigned auto_increment primary key,
    full_name char(30),
    license int(11) default 0,
    driver_state char(12) NOT NULL default 'not on shift',
    orderId int unsigned default 0,
    foreign key (orderId)
        REFERENCES Orders (id),
    pwd int(4),
    isManager boolean default false
);

create table Orders_Statuses (
    id int unsigned auto_increment primary key,
    orderId int unsigned,
    foreign key (orderId)
        REFERENCES Orders (id),
    state char(11) NOT NULL,
    time timestamp,
    UNIQUE KEY (orderId , state)
);
	

	
	


