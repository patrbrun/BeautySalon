create table CLIENTS
(
    ID           INTEGER auto_increment,
    NAME         VARCHAR(125) not null,
    PHONE_NUMBER INTEGER      not null,
    constraint CLIENTS_PK
        primary key (ID)
);

create table EMPLOYEES
(
    ID           INTEGER auto_increment,
    NAME         VARCHAR(20) not null,
    JOB_TITLE    VARCHAR(20) not null,
    PHONE_NUMBER INTEGER     not null
        unique,
    constraint EMPLOYEES_PK
        primary key (ID)
);

create table PAYMENT
(
    ID              INTEGER auto_increment,
    MODE_OF_PAYMENT VARCHAR(20) not null,
    AMOUNT_PAYED    INTEGER     not null,
    DISCOUNT        INTEGER,
    AMOUNT_DUE      INTEGER     not null,
    BALANCE         INTEGER     not null,
    constraint PAYMENT_PK
        primary key (ID)
);

create table SERVICES
(
    ID           INTEGER auto_increment,
    SERVICE_NAME VARCHAR(50) not null
        unique,
    PRICE        DECIMAL     not null,
    constraint SERVICES_PK
        primary key (ID)
);

create table APPOINTMENTS
(
    ID          INTEGER auto_increment,
    SERVICE_ID  INTEGER               not null,
    CLIENT_ID   INTEGER               not null,
    EMPLOYEE_ID INTEGER               not null,
    CANCELLED   BOOLEAN default FALSE not null,
    START_TIME  TIMESTAMP(26, 6),
    END_TIME    TIMESTAMP(26, 6),
    DISCOUNT    INTEGER default 0,
    FULL_PRICE  DECIMAL,
    FINAL_PRICE DECIMAL,
    constraint APPOINTMENTS_PK
        primary key (ID),
    constraint APPOINTMENTS_CLIENTS_ID_FK
        foreign key (CLIENT_ID) references CLIENTS
            on update cascade on delete set null,
    constraint APPOINTMENTS_EMPLOYEES_ID_FK
        foreign key (EMPLOYEE_ID) references EMPLOYEES
            on update cascade on delete set null,
    constraint APPOINTMENTS_SERVICES_ID_FK
        foreign key (SERVICE_ID) references SERVICES
            on update cascade on delete set null
);

