create table CLIENTS
(
    ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_CBBEED95_22A5_43EF_87BF_927E31F95D8B) auto_increment,
    NAME         VARCHAR(50) not null,
    PHONE_NUMBER INTEGER     not null,
    EMAIL        VARCHAR(50) not null
        constraint CLIENTS_EMAIL_UINDEX
            unique,
    PASSWORD     VARCHAR(50),
    constraint CLIENTS_PK
        primary key (ID)
);

create table EMPLOYEES
(
    ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_069B5AB4_752E_4346_BB7B_01E281583CA7) auto_increment,
    NAME         VARCHAR(50) not null,
    JOB_TITLE    VARCHAR(20) not null,
    PHONE_NUMBER INTEGER     not null
        constraint EMPLOYEES_PHONE_NUMBER_UINDEX
            unique,
    PASSWORD     VARCHAR(50) not null
        constraint EMPLOYEES_PASSWORD_UINDEX
            unique,
    EMAIL        VARCHAR(50) not null
        constraint EMPLOYEES_EMAIL_UINDEX
            unique,
    constraint EMPLOYEES_PK
        primary key (ID)
);

create table PAYMENT
(
    ID              INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_0BDC602A_6D7C_41B8_B53F_5D10D06525FF) auto_increment,
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
    ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_66AD593B_2306_4DC0_9F4F_22424AF6C27F) auto_increment,
    SERVICE_NAME VARCHAR(50) not null
        constraint SERVICES_SERVICE_NAME_UINDEX
            unique,
    PRICE        DECIMAL     not null,
    constraint SERVICES_PK
        primary key (ID)
);

create table APPOINTMENTS
(
    ID          INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_E2F87065_3002_4014_B074_21B5D2A28B24) auto_increment,
    SERVICE_ID  INTEGER               not null,
    CLIENT_ID   INTEGER               not null,
    EMPLOYEE_ID INTEGER               not null,
    CANCELLED   BOOLEAN default FALSE not null,
    START_TIME  TIMESTAMP,
    END_TIME    TIMESTAMP,
    PAYMENT_ID  INTEGER               not null
        constraint APPOINTMENTS_PAYMENT_ID_UINDEX
            unique,
    constraint APPOINTMENTS_PK
        primary key (ID),
    constraint APPOINTMENTS_CLIENTS_ID_FK
        foreign key (CLIENT_ID) references CLIENTS
            on update cascade on delete set null,
    constraint APPOINTMENTS_EMPLOYEES_ID_FK
        foreign key (EMPLOYEE_ID) references EMPLOYEES
            on update cascade on delete set null,
    constraint APPOINTMENTS_PAYMENT_ID_FK
        foreign key (PAYMENT_ID) references PAYMENT,
    constraint APPOINTMENTS_SERVICES_ID_FK
        foreign key (SERVICE_ID) references SERVICES
            on update cascade on delete set null
);

