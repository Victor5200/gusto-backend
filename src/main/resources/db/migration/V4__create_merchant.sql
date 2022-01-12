CREATE TABLE merchant
(
    id              BIGINT       NOT NULL,
    enterprise_name VARCHAR(255) NULL,
    type            VARCHAR(255) NULL,
    initial_value   DOUBLE       NULL,
    final_value     DOUBLE       NULL,
    img_logo        VARCHAR(255) NULL,
    company_id      BIGINT       NULL,
    country_id      BIGINT       NULL,
    CONSTRAINT pk_merchant PRIMARY KEY (id)
);

ALTER TABLE merchant
    ADD CONSTRAINT FK_MERCHANT_ON_COMPANY FOREIGN KEY (company_id) REFERENCES company (id);

ALTER TABLE merchant
    ADD CONSTRAINT FK_MERCHANT_ON_COUNTRY FOREIGN KEY (country_id) REFERENCES country (id);


insert into merchant values (1, 'Amazon', 'In-store', 5, 100, '', 1, 1);
insert into merchant values (2, 'Airbnb', 'In-store', 25, 100, '', 1, 1);
insert into merchant values (3, 'AMC Theatres', 'In-store & Online', 5, 30, '', 1, 1);
insert into merchant values (4, 'Aquarium', 'In-store & Online', 5, 10, '', 1, 1);
insert into merchant values (5, 'Athleta', 'Online', 35, 50, '', 1, 1);
insert into merchant values (6, 'Big Fish', 'Online', 30, 100, '', 1, 1);
insert into merchant values (7, 'Brenners', 'In-store', 25, 100, '', 1, 1);



insert into merchant values (8, 'America', 'In-store', 5, 100, '', 1, 2);
insert into merchant values (9, 'Air Canada', 'In-store', 25, 100, '', 1, 2);
insert into merchant values (10, 'Bannock', 'In-store & Online', 5, 30, '', 1, 2);
insert into merchant values (11, 'Biffs Bistro', 'In-store & Online', 5, 10, '', 1, 2);
insert into merchant values (12, 'Canoe', 'Online', 35, 50, '', 1, 2);
insert into merchant values (13, 'Earls', 'Online', 30, 100, '', 1, 2);
insert into merchant values (14, 'Google Play', 'In-store', 25, 100, '', 1, 2);
