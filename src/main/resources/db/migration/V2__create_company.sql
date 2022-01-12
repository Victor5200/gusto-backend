CREATE TABLE Company
(
    id           BIGINT       NOT NULL,
    COMPANY_NAME VARCHAR(255) NULL,
    CONSTRAINT pk_country PRIMARY KEY (id)
);

insert into Company values(1, 'GUUSTO');
