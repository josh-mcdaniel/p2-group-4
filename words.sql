
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

CREATE TABLE mixed_letters (
mixed_letters_id SERIAL PRIMARY KEY,
jumbled_letters VARCHAR(6) NOT NULL
);

INSERT INTO mixed_letters (jumbled_letters)
VALUES
('PMAELM'),
('SECDAD'),
('RBINDY'),
('XMIBRL'),
('XBOMLA'),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
(''),
('');

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
('AMPLE', 1),
('LEMMA', 1),
('MAPLE', 1),
('LAMP', 1),
('MALM', 1),
('PALM', 1)
('ALME', 1),
('LAME', 1),
('LEAP', 1),
('MALE', 1),
('MEAL', 1), 
('PALE', 1),
('PEAL', 1),
('PLEA', 1),
('AMP', 1),
('MAM', 1),
('MAP', 1),
('ALP', 1),
('APE', 1),
('ELM', 1),
('LAM', 1), 
('LAP', 1),
('PAL', 1),
('PEA', 1),
('ALE', 1),
('MM', 1),
('AM', 1),
('EM', 1),
('MA', 1),
('ME', 1),
('PA', 1), 
('PE', 1),
('AE', 1),
('AL', 1),
('EL', 1),
('LA', 1),
('A', 1)
('CASED', 2),
('ACED', 2),
('CADS', 2),
('DACE', 2),
('SCAD', 2),
('ACES', 2),
('ADDS', 2),
('CASE', 2),
('DADS', 2),
('DEAD', 2),
('CAD', 2),
('ACE', 2),
('ADD', 2),
('DAD', 2),
('SAC', 2),
('SEC', 2),
('ADS', 2),
('DAS', 2),
('SAD', 2),
('SEA', 2),
('AD', 2),
('DA', 2),
('DE', 2),
('ED', 2),
('AE', 2),
('AS', 2),
('ES', 2),
('A', 2),
('BRINY', 3),
('BIND', 3),
('BIRD', 3),
('RIND', 3),
('DRY', 3),
('BID', 3),
('DIB', 3),
('YIN', 3),
('BIN', 3),
('NIB', 3),
('RIB', 3),
('DIN', 3),
('RID', 3),
('BY', 3),
('BI', 3),
('ID', 3),
('IN', 3),
('I', 3),
('BRIM', 4),
('LIMB', 4),
('BIRL', 4),
('MIX', 4),
('LIB', 4),
('MIL', 4),
('RIB', 4),
('RIM', 4),
('XI', 4),
('BIRL', 4),
('MI', 4),
('LI', 4),
('I', 4), 
('MOXA', 5), 
('AMBO', 5), 
('BALM', 5), 
('BLAM', 5), 
('LAMB', 5), 
('BOLA', 5), 
('LOAM', 5), 
('MOLA', 5), 
('BOX', 5), 
('MAX', 5), 
('LAX', 5), 
('LOX', 5), 
('BAM', 5), 
('MOB', 5), 
('ALB', 5), 
('BOA', 5), 
('LAB', 5), 
('LAM', 5), 
('LOB', 5), 
('MOA', 5), 
('MOL', 5), 
('OBA', 5), 
('OMA', 5), 
('AX', 5), 
('OX', 5), 
('AB', 5), 
('AM', 5), 
('BA', 5), 
('BO', 5), 
('MA', 5), 
('MO', 5), 
('OM', 5), 
('AL', 5), 
('LA', 5), 
('LO', 5), 
('A', 5);


SELECT * FROM words WHERE mixed_letters_fk = 2;
--IF '' IS equal TO words WHERE mixed_letters_fk = 2 THEN ADD 1 TO score WHERE user_id = ?