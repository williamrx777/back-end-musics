CREATE TABLE musics (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    title varchar(100) NOT NULL,
    description varchar(100) NOT NULL,
    image varchar(255) NOT NULL,
    url varchar(255) NOT NULL,
    PRIMARY KEY (id)
);