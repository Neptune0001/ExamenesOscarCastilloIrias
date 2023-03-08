create database Cinelitas;
use Cinelitas;

create table `peliculas`(
	`id` int(11) not null auto_increment,
    `nombre` varchar(45) not null,
    `costo_entrada` int not null,
    `fecha` date not null,
    primary key(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Inserts Peliculas*/
insert into `peliculas` values (1,'Duro de Matar', 6500, '2023-08-17');
insert into `peliculas` values (2,'Spiderman 2', 6500, '2023-08-17');
/*Fin Inserts Peliculas*/

create table `salas`(
	`id` int(11) not null auto_increment,
	`numero_sala` int not null,
    `capacidad_maxPersonas` int not null,
    `id_Pelicula` int(11) not null,
    primary key(`id`,`id_Pelicula`),
    key `fk_sala_pelicula_idx`(`id_Pelicula`),
    constraint `fk_sala_peliculapeliculaidpelicula` foreign key (`id_Pelicula`) references `peliculas`(`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);

/*Inserts sala*/
insert into `salas` values (1,6, 60, 1);
insert into `salas` values (2,8, 60, 2);
/*Fin Inserts sala*/