DROP TABLE birds IF EXISTS;
DROP TABLE posts IF EXISTS;
DROP TABLE users IF EXISTS;

CREATE TABLE birds (
    id INTEGER IDENTITY PRIMARY KEY,
    english_name VARCHAR(30),
    latin_name VARCHAR(30),
    portuguese_name VARCHAR(30),
    dominant_color VARCHAR(30),
    gender VARCHAR(30),
    habitat VARCHAR(30),
    family VARCHAR(30),
    bird_size VARCHAR(30)
);

CREATE TABLE users (
    id INTEGER IDENTITY PRIMARY KEY,
    profile_photo VARCHAR(255),
    username VARCHAR(20) NOT NULL,
    email VARCHAR(50) NOT NULL,
    password VARCHAR(20) NOT NULL
);

CREATE TABLE posts (
    id INTEGER IDENTITY PRIMARY KEY,
    image VARCHAR(255),
    location VARCHAR(255),
    date VARCHAR(255),
    fk_user INTEGER,
    fk_bird INTEGER
);
--ALTER TABLE posts ADD CONSTRAINT fk_user FOREIGN KEY (id) REFERENCES posts (id);