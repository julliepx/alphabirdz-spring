INSERT INTO birds(english_name, latin_name, portuguese_name, dominant_color, gender, habitat, family, bird_size) 
            VALUES ('great egret', 'ardea alba', 'garça-real', 'branco', 'macho', 'campo alagado', 'ardeidae', '65 cm');
INSERT INTO birds(english_name, latin_name, portuguese_name, dominant_color, gender, habitat, family, bird_size) 
            VALUES ('black crowned monjita', 'xolmis coronatus', 'noivinha-coroada', 'branco', 'macho/fêmea', 'campo com árvores', 'tyrannidae', '20 cm');

INSERT INTO users(profile_photo, username, email, password)
            VALUES ('kalpic', 'kal', 'kal@gmail.com', 'kalpassword');

INSERT INTO posts(image, location, date ,fk_user, fk_bird)
            VALUES ('grifo', 'condado', '1996', 1, 1);
INSERT INTO posts(image, location, date ,fk_user, fk_bird)
            VALUES ('coruja', 'hogwarts', '1996', 1, 1);