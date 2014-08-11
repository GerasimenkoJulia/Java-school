drop database Logiweb;
create database Logiweb;
use Logiweb;

create table Trucks (
    idTruck int unsigned auto_increment primary key,
    reg_number char(7),
    capacity int,
    kolvo_drivers int,
    condition_of_truck char(10)
);

create table Drivers (
    idDriver int unsigned auto_increment primary key,
    full_name char(30),
    license int(11)
);

create table Orders (
    idOrder int unsigned auto_increment primary key,
    truckId int unsigned,
    foreign key (truckId)
        REFERENCES Trucks (idTruck),
    cost int,
    order_status char(11),
    delivery_date date
);

create table Order_items (
    idItem int unsigned auto_increment primary key,
    orderId int unsigned,
    foreign key (orderId)
        REFERENCES Orders (idOrder),
    gps decimal,
    loading varchar(50),
    weight int,
    delivery_status char(3) NOT NULL default 'No'
);



create table Drivers_Orders (
    orderId int unsigned,
    foreign key (orderId)
        REFERENCES Orders (idOrder),
    driverId int unsigned,
    foreign key (driverId)
        REFERENCES Drivers (idDriver),
    driver_status char(11)
);

create table Orders_Statuses (
    orderId int unsigned,
    foreign key (orderId)
        REFERENCES Orders (idOrder),
    statys char(11) NOT NULL,
    time_change_of_status timestamp,
    UNIQUE KEY (orderId , statys)
);
	
	
	
	


