create table pessoas (
    id bigint not null auto_increment,
    nome varchar(100) not null,
    data_Nascimento varchar(10) not null unique,
    cpf varchar(11) not null unique,
    primary key(id)
);

create table enderecos (
    id bigint not null auto_increment,
    rua varchar(100) not null,
    numero varchar(4),
    bairro varchar(100),
    cidade varchar(100) not null,
    estado char(2) not null,
    cep varchar(9) not null,
    pessoa_id bigint,
    primary key(id),
    foreign key(pessoa_id) references pessoas(id)
);
