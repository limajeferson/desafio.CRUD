create table pessoas(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    dataNascimento varchar(10) not null unique,
    cpf varchar(11) not null unique,
    email varchar(100) not null unique,
    endereco varchar(100) not null,
    rua varchar(100) not null,
    numero varchar(4),
    bairro varchar(100),
    cidade varchar(100) not null,
    estado char(2) not null,
    cep varchar(9) not null,

    primary key(id)

);