/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Cesar Rojas
 * Created: 10-04-2016
 */

create table Acopio(
    id serial primary key not null,
    Nombre varchar(100) not null,
    Identificador varchar(100) not null,
    Capacidad float not null,
    Stock float not null,
    Estado int not null
);