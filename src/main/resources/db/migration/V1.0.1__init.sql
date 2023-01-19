use ccdb;

DROP TABLE IF EXISTS city;
DROP TABLE IF EXISTS country;

CREATE TABLE country(
id bigint(20) NOT NULL AUTO_INCREMENT,
country varchar(100),
PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

CREATE TABLE city(
id bigint(20) NOT NULL AUTO_INCREMENT,
country_id bigint(20) NOT NULL,
city varchar(100),
PRIMARY KEY (id),
FOREIGN KEY (country_id) REFERENCES country(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;