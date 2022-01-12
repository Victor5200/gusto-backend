CREATE TABLE User
(
    id           BIGINT       NOT NULL,
    USER_NAME VARCHAR(255) NULL,
    USER_PASSWORD VARCHAR(255) NULL,
    CONSTRAINT pk_country PRIMARY KEY (id)
);

insert into User values(1, 'Victor', 'dGVzdGUxMjM0');
