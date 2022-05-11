CREATE TABLE users (
user_id SERIAL PRIMARY KEY,
username VARCHAR(20) UNIQUE NOT NULL,
password VARCHAR(20) NOT NULL,
email VARCHAR(40) UNIQUE NOT NULL,
leaderboard_id_fk INt REFERENCES leaderboard (leaderboard_id)
);

DROP TABLE users
DROP TABLE leaderboard

INSERT INTO users (username, password, email)
VALUES 
('mikecordero42', 'bossman24', 'mikec42@gmail.com'),
('joeybones5', 'greenobot', 'joeyb5@gmail.com'),
('samanthafitz33', 'sunshine22', 'samfitz92@gmail.com');

CREATE TABLE leaderboard (
leaderboard_id SERIAL PRIMARY KEY,
score INT NULL
);

CREATE TABLE mixed_letters (
mixed_letters_id SERIAL PRIMARY KEY,
jumbled_letters VARCHAR(6) NOT NULL
);

DROP TABLE mixed_letters

INSERT INTO mixed_letters (jumbled_letters)
VALUES
('NABRSA');

--CREATE TABLE words (
--words_id SERIAL PRIMARY KEY,
--word VARCHAR(6) NOT NULL
--mixed_letters_fk int REFERENCES mixed_letters (mixed_letters_id) NOT NULL
--);

DROP TABLE mixed_letters
DROP TABLE words
DROP TABLE users
DROP table leaderboard

--INSERT INTO words (word, mixed_letters_fk)
--VALUES
--('BARN', 1),
--('BARS', 1),
--('ABS', 1);
----('BRA'),
----('BARNS'),
----('RAN'),
----('NAB'),
----('BAR');