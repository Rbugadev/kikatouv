INSERT INTO `ville` (id, nom, codePostal) VALUES (1, '1er arrondissement - Paris', '75001');
INSERT INTO `ville` (id, nom, codePostal) VALUES (2, '2ème arrondissement - Paris', '75002');
INSERT INTO `ville` (id, nom, codePostal) VALUES (3, '3ème arrondissement - Paris', '75003');
INSERT INTO `ville` (id, nom, codePostal) VALUES (4, '4ème arrondissement - Paris', '75004');
INSERT INTO `ville` (id, nom, codePostal) VALUES (5, '5ème arrondissement - Paris', '75005');
INSERT INTO `ville` (id, nom, codePostal) VALUES (6, '6ème arrondissement - Paris', '75006');
INSERT INTO `ville` (id, nom, codePostal) VALUES (7, '7ème arrondissement - Paris', '75007');
INSERT INTO `ville` (id, nom, codePostal) VALUES (8, '8ème arrondissement - Paris', '75008');
INSERT INTO `ville` (id, nom, codePostal) VALUES (9, '9ème arrondissement - Paris', '75009');
INSERT INTO `ville` (id, nom, codePostal) VALUES (10, '10ème arrondissement - Paris', '75010');
INSERT INTO `ville` (id, nom, codePostal) VALUES (11, '11ème arrondissement - Paris', '75011');
INSERT INTO `ville` (id, nom, codePostal) VALUES (12, '12ème arrondissement - Paris', '75012');
INSERT INTO `ville` (id, nom, codePostal) VALUES (13, '13ème arrondissement - Paris', '75013');
INSERT INTO `ville` (id, nom, codePostal) VALUES (14, '14ème arrondissement - Paris', '75014');
INSERT INTO `ville` (id, nom, codePostal) VALUES (15, '15ème arrondissement - Paris', '75015');
INSERT INTO `ville` (id, nom, codePostal) VALUES (16, '16ème arrondissement - Paris', '75016');
INSERT INTO `ville` (id, nom, codePostal) VALUES (17, '17ème arrondissement - Paris', '75017');
INSERT INTO `ville` (id, nom, codePostal) VALUES (18, '18ème arrondissement - Paris', '75018');
INSERT INTO `ville` (id, nom, codePostal) VALUES (19, '19ème arrondissement - Paris', '75019');
INSERT INTO `ville` (id, nom, codePostal) VALUES (20, '20ème arrondissement - Paris', '75020');
INSERT INTO `ville` (id, nom, codePostal) VALUES (21, 'Saint-Denis', '93200');
INSERT INTO `ville` (id, nom, codePostal) VALUES (22, 'Lognes', '77185');
INSERT INTO `ville` (id, nom, codePostal) VALUES (23, 'Carhaix-Plouguer', '29270');

INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (1, 'DUPOND', 'Jérémie', '1975-01-25','0612325465','0244325465','j.dupond@mail.fr','28 Allée Verte','2018-08-12',null, 'jdupond', 'dupond',1);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (2, 'BERRA', 'Claire', '1985-10-05','0613325465','0244225465','c.berra@mail.fr','2 Rue du Général Leclerc','2018-08-01',null, 'cberra', 'berra',1);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (3, 'MARCHAND', 'Michel', '1963-11-15','0614325465','0244125465','m.marchand@mail.fr','28 Rue de la République','2018-07-03',null, 'mmarchand', 'marchand',2);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (4, 'DUPUIS', 'Mathilde', '1972-08-16','0615325465','0244425465','m.dupuis@mail.fr','28 Rue Vivaldi','2018-07-16',null, 'mdupuis', 'dupuis',2);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (5, 'Administrateur', '', '1972-08-16','0615325465','0244425465','admin@mail.fr','28 Rue Vivaldi','2018-07-16',null, 'admin', 'admin',null);

INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (6, 'Boulanger', 'Romain', '1975-01-25','0618825465','0288325465','r.boulanger@mail.fr','42 Allée Verte','2018-08-12',null, 'rboulanger', 'boulanger',6);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (7, 'Lechat', 'Cindy', '1986-10-05','0613995465','0144225465','c.lechat@mail.fr','26 Rue Leclerc','2018-08-01',null, 'clechat', 'lechat',5);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (8, 'Breton', 'Romuald', '1964-11-15','061425465','0144335465','r.breton@mail.fr','8 Rue de la République','2018-07-03',null, 'rbreton', 'breton',6);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (9, 'Durand', 'Yohann', '1972-08-26','0617825465','0247725465','y.durand@mail.fr','2 Rue Vivaldi','2018-07-16',null, 'ydurand', 'durand',4);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (10, 'Hoquet', 'Gisèle', '1962-01-16','0615324765','0165425465','g.hoquet@mail.fr','15 Rue Alesia','2018-07-16',null, 'ghoquet', 'hoquet',3);

INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (11, 'Moreau', 'Lisa', '1982-12-25','0618825433','0188325115','l.moreau@mail.fr','12 rue des champs','2018-08-12',null, 'lmoreau', 'moreau',7);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (12, 'Richard', 'Georges', '1986-03-18','0613995477','0144225775','g.richard@mail.fr','06 Rue Division Leclerc','2018-08-01',null, 'grichard', 'richard',7);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (13, 'Roy', 'Roger', '1974-11-15','061425488','0144335885','r.roger@mail.fr','86 Rue de la République','2018-07-03',null, 'rroy', 'roy',6);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (14, 'Collin', 'Liliane', '1972-08-26','0617825995','0247725995','l.collin@mail.fr','2 Rue de Stalingrad','2018-07-16',null, 'lcollin', 'collin',4);
INSERT INTO `user` (id, nom, prenom, dateDeNaissance, numTelPortable, numTelFixe, adresseMail, adresse, dateInscription, dateDesinscription, login, password, ville_id) VALUES (15, 'Martinez', 'Solange', '1962-04-16','0615324744','0175425445','m.solange@mail.fr','15 Rue Alesia','2018-07-16',null, 'smartinez', 'martinez',8);


INSERT INTO `categorie`(id,nom) VALUES (1,'Mobilier')
INSERT INTO `categorie`(id,nom) VALUES (2,'Décoration')
INSERT INTO `categorie`(id,nom) VALUES (3,'Sono')
INSERT INTO `categorie`(id,nom) VALUES (4,'Vidéo')
INSERT INTO `categorie`(id,nom) VALUES (5,'Divers')

INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (1,'table',1) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (2,'chaise',1) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (3,'plante',2) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (4,'ballon',2) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (5,'ampli',3) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (6,'chaine stereo',3) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (7,'ecran',4) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (8,'camera',4) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (9,'prestation externe',5) 
INSERT INTO `sousCategorie`(id,nom,categorie_id) VALUES (10,'autres',5) 

INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (1,'ceci est un ecran','grand','ecran0.jpg',1)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (2,'ecran1','grand','ecran1.jpg',2)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (3,'ecran2','grand','ecran2.jpg',2)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (4,'ecran3','grand','ecran3.jpg',3)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (5,'ecran4','grand','ecran4.jpg',3)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (6,'ecran5','grand','ecran5.jpg',3)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (7,'ecran6','grand','ecran6.jpg',4)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (8,'ecran7','grand','ecran7.jpg',4)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (9,'ecran8','grand','ecran8.jpg',5)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (10,'ecra9n','grand','ecran9.jpg',5)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (11,'ecra10n','grand','ecra10n.jpg',5)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (12,'ecran11','grand','ecran11.jpg',6)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (13,'ecran12','grand','ecran12.jpg',7)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (14,'ecran13','grand','ecran13.jpg',7)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (15,'ecran14','grand','ecran14.jpg',8)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (16,'ecran15','grand','ecran15.jpg',8)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (17,'ecran16','grand','ecran16.jpg',8)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (18,'ecran17','grand','ecran17.jpg',9)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (19,'ecran18','grand','ecran18.jpg',10)
INSERT INTO `article` (id,nom,description,nomImage,sousCategorie_id) VALUES (20,'ecran19','grand','ecran19.jpg',10)


INSERT INTO `typeMouvement` (id,nom) VALUES (1,'achat')
INSERT INTO `typeMouvement` (id,nom) VALUES (2,'inventaire')

INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (1,'2015-08-25','1')
INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (2,'2015-07-07','2')
INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (3,'2016-09-12','1')
INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (4,'2016-07-07','2')
INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (5,'2017-04-01','1')
INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (6,'2017-07-07','2')
INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (7,'2018-06-06','1')
INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (8,'2018-07-07','2')
INSERT INTO `mouvement` (id,date,typeMouvement_id) VALUES (9,'2019-02-16','1')



INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (1,50,1,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (2,500,2,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (3,500,3,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (4,500,4,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (5,50,5,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (6,20,6,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (7,150,7,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (8,40,8,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (9,50,9,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (10,50,10,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (11,50,11,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (12,50,12,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (13,50,13,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (14,50,14,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (15,50,15,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (16,50,16,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (17,50,17,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (18,50,19,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (19,50,20,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (20,80,1,2)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (21,10,3,2)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (22,10,6,2)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (23,30,2,3)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (24,20,4,3)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (25,10,5,3)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (26,20,7,3)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (27,30,3,4)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (28,50,5,4)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (29,10,6,4)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (30,60,1,5)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (31,40,2,5)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (32,30,6,5)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (33,10,7,5)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (34,20,6,6)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (35,30,12,6)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (36,10,15,6)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (37,10,8,7)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (39,10,16,7)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (40,80,20,7)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (41,20,5,8)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (42,50,9,8)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (43,10,1,9)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (44,60,10,9)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (45,10,15,9)


INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (1,'produit haut de gamme je le recommande','2018-07-03',5,16,1)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (2,'produit facile à utiliser bonne qualité','2018-01-07',4,10,2)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (3,'plante artificielle très réaliste effet garanti','2017-06-02',5,5,3)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (4,'prévoir un compresseur si vous voulez gonfler vos ballons.... à la bouche impossible !','2016-09-25',3,7,4)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (5,'le son était nickel ','2018-07-19',4,11,5)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (6,'personnel très professionnel service de qualité','2018-08-06',4,18,6)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (7,'la batterie de la camera était a plat à la livraison ','2017-04-09',2,15,7)



INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (1,'2017-06-02','2017-06-04','2017-04-02','3 rue du chateau','2017-06-04',1,3)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (2,'2018-09-22','2018-09-25','2017-06-18','15 avenue du marais','2018-09-25',2,5)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (3,'2017-03-01','2017-03-02','2017-02-02','156 boulevard victor hugo','2017-03-02',3,8)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (4,'2016-08-09','2016-08-15','2016-06-26','16 rue du sentier','2016-08-15',4,12)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (5,'2017-01-22','2017-01-25','2017-01-12','25 place des grands hommes','2017-01-25',5,7)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (6,'2018-04-17','2018-04-19','2018-04-01','12 impasse du mortier','2018-04-19',6,1)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (7,'2019-03-22','2019-03-26','2019-01-11','32 rue du lion','2019-03-26',7,9)



INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (1,12,12,1,1)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (2,56,56,1,3)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (3,8,8,1,8)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (4,22,22,1,11)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (5,3,3,1,16)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (6,4,4,2,10)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (7,10,10,3,1)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (8,25,25,3,3)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (9,15,15,3,4)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (10,7,7,3,5)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (11,8,8,4,6)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (12,12,12,4,7)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (13,15,15,5,3)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (14,2,2,5,11)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (15,20,20,6,14)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (16,1,1,6,18)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (17,3,3,7,11)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (18,1,1,7,15)

