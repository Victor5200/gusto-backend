CREATE TABLE Country
(
    id           BIGINT       NOT NULL,
    country_name VARCHAR(255) NULL,
    CONSTRAINT pk_country PRIMARY KEY (id)
);

insert into Country values(1, 'USA');
insert into Country values(2, 'Canada');
insert into Country values(3, 'Brasil');
