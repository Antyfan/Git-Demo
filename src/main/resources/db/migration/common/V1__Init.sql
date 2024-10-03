CREATE TABLE IF NOT EXISTS book (
    id varchar(255) NOT NULL PRIMARY KEY,
    name varchar(255) NOT NULL,
    author varchar(255) NOT NULL,
    publisher varchar(255) NOT NULL,
    category varchar(255) NOT NULL,
    color varchar(255) NULL,
    pages NUMERIC NULL
);