CREATE TABLE users (
user_id SERIAL PRIMARY KEY,
username VARCHAR(20) UNIQUE NOT NULL,
password VARCHAR(20) NOT NULL,
email VARCHAR(40) UNIQUE NOT NULL
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
score INT NULL,
user_id_fk INt REFERENCES users (user_id) NOT NULL
);
SELECT * FROM leaderboard 

INSERT INTO leaderboard (score, user_id_fk)
VALUES
(12, 1),
(7, 2),
(5, 3),
(24, 4);

CREATE TABLE mixed_letters (
mixed_letters_id SERIAL PRIMARY KEY,
jumbled_letters VARCHAR(6) NOT NULL
);

INSERT INTO mixed_letters (jumbled_letters)
VALUES
('NABRSA'),
('LOPSNT');

CREATE TABLE words (
words_id SERIAL PRIMARY KEY,
word VARCHAR(6) NOT NULL,
mixed_letters_fk int REFERENCES mixed_letters (mixed_letters_id) NOT NULL
);

DROP TABLE mixed_letters
DROP TABLE words
DROP TABLE users
DROP table leaderboard

INSERT INTO words (word, mixed_letters_fk)
VALUES
('BARN', 1),
('BARS', 1),
('ABS', 1),
('BRA', 1),
('BARNS', 1),
('RAN', 1),
('NAB', 1),
('BAR', 1),
('PLOT', 2),
('SLOT', 2),
('SNOT', 2),
('SLOP', 2),
('STOP', 2),
('TOP', 2),
('TOPS', 2),
('SPOT', 2);

SELECT * FROM mixed_letters;
SELECT * FROM words;
SELECT * FROM users
--IF '' IS equal TO words WHERE mixed_letters_fk = 2 THEN ADD 1 TO score WHERE user_id = ?
