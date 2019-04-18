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


INSERT INTO `categorie`(id,nom,description) VALUES (1,'ART DE LA TABLE','Description ART DE LA TABLE')
INSERT INTO `categorie`(id,nom,description) VALUES (2,'MOBILIER','Description MOBILIER')
INSERT INTO `categorie`(id,nom,description) VALUES (3,'CUISINE','Description CUISINE')
INSERT INTO `categorie`(id,nom,description) VALUES (4,'NAPPES','Description NAPPES')
INSERT INTO `categorie`(id,nom,description) VALUES (5,'ANIMATION','Description ANIMATION')

INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (1,'COUVERTS',1,'Description COUVERTS','couverts-adagio.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (2,'ASSIETTES',1,'Description ASSIETTES','assiettes-filet-or.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (3,'VERRES',1,'Description VERRES','verres-crystal.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (4,'TABLES',2,'Description TABLES','table.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (5,'BUFFETS, BAR ET MANGE-DEBOUT',2,'Description BUFFETS, BAR ET MANGE-DEBOUT','buffet.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (6,'CHAISES',2,'Description CHAISES','chaise.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (7,'FAUTEUILS, POUFS ET CANAPES',2,'Description FAUTEUILS, POUFS ET CANAPES','location-fauteuil-conference.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (8,'BANCS ET TABOURETS',2,'Description BANCS ET TABOURETS','banc.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (9,'ACCUEIL ET ACCESSOIRES DE CONFERENCE',2,'Description ACCUEIL ET ACCESSOIRES DE CONFERENCE','location-pupitre-conference-lumineux.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (10,'ETUVES FOURS ET PLAQUES DE CUISSON',3,'Description ETUVES FOURS ET PLAQUES DE CUISSON','etuves-electriques.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (11,'REFRIGERATEURS ET CONGELATEURS',3,'Description REFRIGERATEURS ET CONGELATEURS','frigo.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (12,'USTENSILES DE CUISINE',3,'Description USTENSILES DE CUISINE','ustensiles-de-cuisine.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (13,'NAPPES',4,'Description NAPPES','nappe-satin-blanc-perle.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (14,'SON',5,'Description SON','pack-table-de-mixage-enceintes.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (15,'LUMIERES',5,'Description LUMIERES','guirlandes-electriques.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (16,'VIDEO',5,'Description VIDEO','video.png') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (17,'PRESTATAIRES',5,'Description PRESTATAIRES','atelier-traiteur-home-2048x1250-1-2048x1250.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (18,'PLATS ET PLATEAUX',1,'Description PLATS ET PLATEAUX','plateaux-rectangulaires.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (19,'ACCESSOIRES ET DECORATION DE TABLE',1,'Description ACCESSOIRES ET DECORATION DE TABLE','photophores-light.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (20,'SALADIERS ET CONTENANTS',1,'Description SALADIERS ET CONTENANTS','saladiers-verre-duralex.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (21,'COOKING ET ACCESSOIRES D ANIMATION',3,'Description COOKING ET ACCESSOIRES D ANIMATION','location-fontaine-chocolat.jpg') 
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (22,'STOCKAGE ET MATERIEL ISOTHERME',3,'Description STOCKAGE ET MATERIEL ISOTHERME','location-conteneurs-isothermes.jpg')
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (23,'CHEMINS DE TABLE',4,'Description CHEMINS DE TABLE','rouleau-toile-de-jute.jpg')
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (24,'MOLLETONS',4,'Description MOLLETONS','molletons-ronds.jpg')
INSERT INTO `sousCategorie`(id,nom,categorie_id,description,nomImage) VALUES (25,'SERVIETTES,TORCHONS ET LITEAUX',4,'Description SERVIETTES,TORCHONS ET LITEAUX','serviettes-a-usage-unique-20x20.jpg')





INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (1,'Couverts Adagio','Longueur de couverts : \r\n Couteau Table : 23 cm \r\n Couteau Entremets : 21.5 cm \r\n Fourchette et Cuillère Table : 21 cm \r\n Fourchette et Cuillère Entremets : 18.5 cm \r\n Cuillère Café : 14.5 cm \r\n Cuillère Moka : 12 cm \r\n Le conditionnement des couverts se fait par 10.','couverts-adagio.jpg',0.45,1)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (2,'Couverts Copper','Longueur de couverts : \n\r Couteau Table : 23 cm \n\r Couteau Entremets : 21.5 cm \n\r Fourchette et Cuillère Table : 21 cm  \n\r Fourchette et Cuillère Entremets : 18.5 cm \n\r  Cuillère Café : 14.5 cm  \n\r  Le conditionnement des couverts se fait par 10.','couverts-copper.jpg',0.5,1)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (3,'Couverts Gold','Longueur de couverts : \n\r  Couteau Table : 23 cm  \n\r Couteau Entremets : 21.5 cm \n\r   Fourchette de Table : 21 cm \n\r Fourchette et Cuillère Entremets : 18.5 cm \n\r Cuillère Café : 14.5 cm \n\r  Le conditionnement des couverts se fait par 10.','couverts-gold.jpg',0.65,1)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (4,'Couverts de Service Inox','N oubliez pas les indispensables ! \n\r KiKaTou vous propose les couverts de service adaptés à tous vos plats chauds ou froids, salades, fromage, pâtes... \n\r Acier inoxidable Inox qualité 18/10.','couverts-de-service-inox.jpg',0.3,1)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (5,'Couverts de Service Argent','Servez vos plats avec élégance ! \n\r KiKaTou vous propose les couverts de service adaptés à tous vos plats chauds ou froids, salades, soupe... \n\r Argenture 33 microns.','couverts-de-service-argent.jpg',0.4,1)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (6,'Assiettes Filet Or','Découvrez notre ligne d assiettes délicatement ornées d un Filet Or. /n/r Le filet somptueux à la feuille dor sublimera votre table et lui donnera un côté festif tout en délicatesse. \n\r Porcelaine Deshoulières. Fabriqué en France.','assiettes-filet-or.jpg',0.45,2)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (7,'Assiettes Pierre de Lave','Succombez au charme de notre nouvelle collection d assiettes en grès Pierre de Lave ! \n\rJouez sur le contraste en mettant en lumière vos mets sur ces assiettes sombres et élégantes. \n\r Associez les à l infini avec notre nouvelle gamme d assiettes Moon pour encore plus de contraste et un jeu de matières très tendance. /n/r Pierre de Lave is the new Black! /n/r Assiettes Guy Degrenne. Grès véritable. Fabriqué en France ','location-assiettes-modulo-pierre-de-lave-.jpg',0.65,2)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (8,'Assiettes Modulo','Découvrez notre nouvelle collection en location d\n\r assiettes carrées Modulo en porcelaine. \n\r Dressez une table moderne et épurée avec cette porcelaine blanche aux formes géométriques douces. \n\r Ne passez pas à côté de nos assiettes de présentation Modulo idéales pour vos buffets ! \n\r Porcelaine véritable. Fabriqué en France ','assiettes-modulo.jpg',0.4,2)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (9,'Assiette Rectangulaire 28x15cm','Nous vous proposons notre assiette Rectangulaire de dimensions : \n\r 28x15cm. Cette assiette est parfaite pour vos mises en scène cocktail ou fromage. \n\r Optez pour une touche d originalité et changez de forme d assiette !','assiette-rectangulaire-28x15cm.jpg',0.55,2)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (10, 'Assiettes Cocktail','KiKaTou vous propose en location les assiettes de cocktail en porcelaine.\n\r Leur légèreté et format mini s adapteront parfaitement à vos buffets et cocktails.','assiettes-cocktail.jpg',0.35,2)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (11, 'Assiettes Platine','Découvrez notre collection d assiettes Platine. Ces assiettes aux formes géométriques ornées d un décor Platine donneront une touche de modernité à tous vos repas. \n\r Fabriqué à la main. 100% Verre recyclé.','assiettes-platine.jpg',0.65,2)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (12,'Verres Collection Crystal','Offrez du luxe et du raffinement à votre événement avec notre nouvelle collection Crystal. \n\r Verres en cristal bavarois. \n\r La collection Crystal s associe parfaitement avec la collection BROADWAY.','verres-crystal.jpg',0.6,3)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (13,'Verres Collection Napoli','La collection de verres Napoli s adaptera parfaitement à tout type d évènements. \n\r Nous vous proposons en location les verres à vin, flûtes ou coupes à Champagne ! \n\r Fabriqué en Belgique. \n\r Le conditionnement des verres se fait par caisses de 25,36 ou 49 selon le modèle.','verres-napoli.jpg',0.3,3)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (14,'Verres Gobelets BLACK & WHITE','Nous vous proposons en location les verres à eau / soft design Black & White! \n\r Avec leur design coloré et mat, les verres Black & White s intègrent parfaitement à une table moderne et épurée. Créez une harmonie sur votre table ou buffet avec le côté opaque de nos verres : vous ne pourrez pas vous tromper dans votre mise en scène ! /n/r Fabrication française artisanale. Soufflé bouche. /n/r Le conditionnement se fait par caisse de 25 verres.','verres-gobelets-black-and-white-29-cl.jpg',0.2,3)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (15,'Verre Ballon 35 cl','KiKaTou vous propose en location le verre Ballon. Ce grand verre aux formes arrondies convient parfaitement pour la dégustation de vins, pour vos cocktails ou vos champagnes piscine.\n\r Dimensions Verre Ballon 35 cl : 9,1 cm x 18,2 cm \n\r Le conditionnement se fait par caisse de 16 verres.','verre-ballon.jpg',0.1,3)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (16,'Verres à Bière','Le conditionnement des verres se fait par caisse de 25 ou 36 verres selon le modèles.','verres-a-biere.jpg',0.2,3)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (17,'Verre à Thé Oriental 10 cl','Le conditionnement des verres se fait par caisse de 49 verres','verre-a-the-oriental-10-cl.jpg',0.34,3)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (18,'Table Wood chêne massif','KiKaTou vous propose en location la table en chêne Wood qui va s adapter parfaitement à une ambiance chic et naturelle très tendance. Réalisée dans un assemblage en chêne massif sablé, notre table Wood s affirme dans une identité à la fois authentique, mais aussi industrielle grâce à son piètement noir texturé. /n/r La table permet de placer jusqu à 8 convives. /n/r  Piètement pliant et plateau en chêne massif à poser  /n/r  Livré avec sa housse de protection  /n/r Dimensions du plateau : 180 x 90 cm  /n/r Hauteur de la table montée : 76 cm  /n/r  Dimensions du piètement plié : 112.5x72x9.3 cm','location-table-en-bois-massif.jpg',55,4)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (19,'Tables Rondes et Guéridons à napper','Découvrez en location nos tables rondes de réception. Nos tables sont pliantes et robustes. De gueridons aux tables de diamètre Ø200 cm, choisissez la dimension qui convient le mieux pour votre événement ! ','tables-rondes-et-gueridons.jpg',6,4)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (20,'Tables Rectangulaires à napper','Découvrez en location nos tables rectangulaires de réception.Nos tables sont pliantes et robustes, trouvez la dimension qui convient le mieux pour votre événement ! ','tables-rectangulaires.jpg',12,4)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (21,'Tables Carrées','Découvrez en location nos tables carrées de réception. Nos tables sont pliantes et robustes, trouvez la dimension qui convient le mieux à votre événement ! ','tables-carrees.jpg',10,4)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (22,'Tables Basses','KiKaTou vous propose en location plusieurs type de tables basses : - Des tables basses Quadro au design minimaliste. Leur structure en métal s adapte à la fois aux environnements design et classiques en apportant une touche tendance. - Des tables rondes à napper de dimension 120 cm ou 150 cm.','tables-basses.jpg',8,4)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (23,'Tables Demi-rond et Demi-creux','Découvrez les formes originales des tables demi-rond ou demi creux qui permettent d optimiser l espace.','tables-demi-rond-et-demi-creux.jpg',15,4)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (24,'Mange-debout ronds','Découvrez en location nos mange-debout ! Pratiques avec leurs pieds détachables. Pour un rendu optimisé, nous vous conseillons de les louer avec nos housses colorées !','mange-debout.jpg',20,5)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (25,'Chaise Conférence','Découvrez en location notre chaise coque Conférence avec ou sans tablette parfaite pour vos réunions, séminaires ou conférences. Nos chaises coque sont empilables et s accrochent entre elles. Coloris Gris. Les chaises et les tablettes sont livrées séparément.','chaises-avec-tablettes.jpg',4,6)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (26,'Fauteuil Conférence Noir','KiKaTou vous propose son fauteuil club en similicuir noir parfait pour vous conférences ou salons ! location-fauteuil-conference','location-fauteuil-conference.jpg',15,7)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (27,'Tabourets ZZ','Nous vous proposons en location les tabourets hauts ZZ en coloris Blanc ou Noir. Structure chromée. Assise en similicuir.  Dimensions : Hauteur 83 cm. Diamètre de lassise Ø33 cm.','tabourets-zz.jpg',14,8)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (28,'Pupitre de Conférence Lumineux','KiKaTou vous propose en location le pupitre lumineux très design, indispensable pour vos discours, conférences, séminaires ou mariages. Original et élégant, le pupitre lumineux est parfait pour une utilisation extérieure et intérieure et peut être personnalisé. Ses formes gracieuses et intemporelles sollicitent autant l oeil que la main.  Structure polyéthylène roto-moulé. Dimensions : 62x62. Hauteur : 120 cm','location-pupitre-conference-lumineux.jpg',75.6,9)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (29,'Etuves Electriques','KiKaTou vous propose en location les Etuves Electriques Ventilées pour remettre ou conserver au chaud vos préparations ou encore vos assiettes. Pour un cocktail, un buffet ou encore un repas assis, nous vous proposons un large choix de dimensions ! Nous proposons également en location l Armoire de maintien à température permettant de maintenir vos préparations à température qu elles soient chaudes ou froides. Pour plus d informations et caractéristiques de chaque appareil, nous vous invitons à consulter les fiches techniques. ','etuves-electriques.jpg',55,10)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (30,'Refrigérateur / Congélateur SMEG 248 L','KiKaTou vous propose en location le réfrigérateur / congélateur SMEG avec son look années 50 très tendance qui s inscrira parfaitement dans n importe quel type d événement ! Ajoutez une touche pop à votre scénographie avec son coloris rouge ! Dimensions : Hauteur : 151 cm, Largeur : 60 cm Caractéristiques techniques : Contenance totale : 248 LRéfrigérateur : volume net : 222 L, froid par air brassé Congélateur : volume net : 26 L Consommation d énergie : 180 kWh/an, Puissance : 90 W','location-refrigerateur-congelateur-smeg-.jpg',120,11)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (31,'Ustensiles de Cuisine','Location d’ustensiles de cuisine en acier inoxydable ! Choisissez parmi notre large gamme d’ustensiles professionnels !','ustensiles-de-cuisine.jpg',3,12)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (32,'Nappe Satin Blanc Perlé','Découvrez en location nos nappes en satin en coloris Blanc Perlé ! Nos nappes en satin se distinguent par leur tombé élégant et seront parfaites pour vos réceptions, diners, mariages... Choisissez parmi nos multiples dimensions de nappes rondes, carrées ou rectangulaires. Nos nappes sont fabriquées en France en tissu 100% satin.','nappe-satin-blanc-perle.jpg',5,13)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (33,'Pack Table de Mixage + 2 Enceintes','TABLE DE MIXAGE DJM-102: - Table de mixage à 6 canaux - Entrées : 8 Ligne, 2 Phono, 2 Micro - 2 microphones DJ : 1 micro DJ + 1 micro à fil - 3 Sorties : Master, cabine DJ et Record- Sortie casque : Contrôle CUE/PGM','pack-table-de-mixage-enceintes.jpg',110,14)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (34,'Guirlandes Lumineuses', 'Location de Guirlande Lumineuse électrique étanche. Guirlande type guinguette disponible en longueur 9 ou 15 mètres. Utilisation intérieure et extérieure. Disponible en lumière Blanche ou Muticolore.','guirlandes-electriques.jpg',10,15)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (35,'Caméra', 'Location de caméra','video.png',50,16)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (36,'Plateaux Rectangulaires', 'Présentez avec raffinement vos mets grâce à nos plateaux rectangulaires. Moderne Inox ou Argent ou encore Louis XVI Argent, choisissez le style qui correspond le mieux à votre mise en scène !','plateaux-rectangulaires.jpg',3,18)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (37,'Photophores Light', 'Apportez une touche de lumière colorée avec nos photophores Light! Photophore Ovale avec bougie incluse. ','photophores-light.jpg',2,19)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (38,'Saladiers Verre Duralex', 'Saladiers Verre Duralex','saladiers-verre-duralex.jpg',3,20)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (39,'Fontaine à Chocolat', 'Kikatou vous propose en location une Fontaine à Chocolat professionnelle (à Paris et région Parisienne). Offrez à vos convives une animation gourmande !','location-fontaine-chocolat.jpg',30,21)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (40,'Conteneur Isotherme', 'Nous vous proposons en location un conteneur gastro isotherme chaud/froid livré avec 4 grilles GN 1/1. Notre container isotherme monobloc à chargement frontal avec poignées de manutention est parfait pour vos liaisons chaudes ou froides. Le container peut accueillir 1 ou 2 plaques eutectique','location-conteneurs-isothermes.jpg',150,22)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (41,'Rouleau Toile de Jute 5m x 30cm', 'Nous vous proposons en vente des rouleaux de toile de jute de 5m, largeur 30cm.','rouleau-toile-de-jute.jpg',5,23)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (42,'Molletons Ronds', 'Pour une utilisation optimale, recouvrez votre table par un molleton. Molletons ronds 100% coton. Disponibles en dimensions: Ø100, Ø120 ou Ø150','molletons-ronds.jpg',2,24)
INSERT INTO `article` (id,nom,description,nomImage,prix,sousCategorie_id) VALUES (43,'Serviettes cocktail coton non tissé 20x20 cm', 'Nous vous proposons des serviettes à usage unique 100% coton et 100% recyclable. Ces serviettes sont idéales pour vos buffets, cocktails. Dimensions : 20 x 20 cm, 2 plis. Conditionnement par 25.','serviettes-a-usage-unique-20x20.jpg',1,25)


INSERT INTO `typeMouvement` (id,nom) VALUES (1,'Achat')
INSERT INTO `typeMouvement` (id,nom) VALUES (2,'Inventaire')

INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (1,'2015-08-25','Maj stock 1',1)
INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (2,'2015-07-07','Inventaire été',2)
INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (3,'2016-09-12','Maj stock 2',1)
INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (4,'2016-07-07','Inventaire été',2)
INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (5,'2017-04-01','Inventaire début année',2)
INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (6,'2017-07-07','Inventaire été',2)
INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (7,'2018-06-06','Maj stock 3',1)
INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (8,'2018-07-07','Inventaire été',2)
INSERT INTO `mouvement` (id,date,description,typeMouvement_id) VALUES (9,'2019-02-16','Maj stock 4',1)



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


INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (46,150,21,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (47,100,22,2)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (48,105,23,3)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (49,150,24,4)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (50,150,25,5)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (51,200,26,6)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (52,300,27,7)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (53,80,28,8)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (54,60,29,9)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (55,100,30,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (56,105,31,2)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (57,140,32,3)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (58,160,33,4)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (59,140,34,5)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (60,150,35,6)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (61,160,36,7)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (62,140,37,8)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (63,180,38,9)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (64,140,39,1)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (65,190,40,2)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (66,200,41,3)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (67,100,42,4)
INSERT INTO `majStock`(id,quantite,article_id,mouvement_id) VALUES (68,100,43,5)




INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (1,'Choppe à bière très pratique et plutôt solide, je recommande','2018-07-03',5,16,1)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (2,'Jolie et pratique','2018-01-07',4,10,2)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (3,'Pour ajouter un côté chic aux réceptions, ses couverts sont parfaits!','2017-06-02',5,5,3)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (4,'Belles assiettes!!','2016-09-25',4,7,4)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (5,'Plusieurs compliments pendant la soirée, très jolie! ','2018-07-19',4,11,5)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (6,'Tendance!!','2018-08-06',4,18,6)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (7,'la batterie de la camera était a plat à la livraison ','2017-04-09',2,35,7)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (8,'Solide? Je ne crois pas, nous en avons cassé trois rien que pendant l apéritif! Merci la caution','2018-09-11',1,16,3)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (9, 'Rien à dire, parfaite!', '2017-04-21',5,10,6)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (10, 'Pas facile à laver... mais jolie','2017-04-12',3,7,1)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (11,'Tendance!!','2018-01-06',4,11,6)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (12,'Tendance!!','2017-11-06',5,22,4)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (13,'Tendance!!','2018-03-06',4,31,1)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (14,'On se prend facilement pour un chef étoilé!!','2019-04-06',5,31,2)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (15,'Belle capacité niveau contenance!!','2018-10-06',5,30,3)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (16,'Très pratique!!','2017-12-06',5,24,5)
INSERT INTO `message`(id,texte,date,note,article_id,user_id) VALUES (17,'Tendance!!','2016-02-06',4,18,6)


INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (1,'2017-06-02','2017-06-04','2017-04-02','3 rue du chateau','2017-06-04',1,3)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (2,'2018-09-22','2018-09-25','2017-06-18','15 avenue du marais','2018-09-25',2,5)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (3,'2017-03-01','2017-03-02','2017-02-02','156 boulevard victor hugo','2017-03-02',3,8)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (4,'2016-08-09','2016-08-15','2016-06-26','16 rue du sentier','2016-08-15',4,12)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (5,'2017-01-22','2017-01-25','2017-01-12','25 place des grands hommes','2017-01-25',5,7)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (6,'2018-04-17','2018-04-19','2018-04-01','12 impasse du mortier','2018-04-19',6,1)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (7,'2019-03-22','2019-03-26','2019-01-11','32 rue du lion','2019-03-26',7,9)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (8,'2016-09-24','2016-09-28','2016-08-31','1 avenue du champs','2016-09-28',2,5)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (9,'2017-09-20','2017-09-23','2017-05-12','42 rue de montparnasse','2017-09-24',2,5)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (10,'2019-09-20','2019-09-23','2019-09-20','42 avenue Chauvet',null,2,5)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (11,'2019-01-11','2019-01-12','2019-05-02','42 rue du boucher',null,3,1)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (12,'2019-03-15','2019-03-16','2019-03-11','4 avenue des mignons',null,1,2)
INSERT INTO `event`(id,dateDebut,dateFin,DateValidation,rueLivraison,dateRetour,user_id,ville_id) VALUES (13,'2019-02-28','2019-03-01','2019-01-24','32 rue de montparnasse',null,4,6)


INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (1,12,12,1,1)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (2,56,56,1,3)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (3,8,8,1,8)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (4,22,22,1,11)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (5,3,3,1,16)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (6,4,4,2,10)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (7,4,4,2,20)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (8,4,4,2,22)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (9,20,20,2,2)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (10,20,20,2,6)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (11,20,20,2,15)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (12,10,10,3,1)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (13,25,25,3,3)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (14,15,15,3,4)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (15,7,7,3,5)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (16,8,8,4,6)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (17,12,12,4,2)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (18,14,14,4,10)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (19,1,1,4,35)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (20,4,4,4,18)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (21,15,15,5,3)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (22,2,2,5,11)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (23,16,16,5,8)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (24,12,12,5,14)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (25,2,2,5,34)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (26,20,20,6,14)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (27,1,1,6,18)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (28,3,3,7,11)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (29,1,1,7,15)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (30,1,1,8,35)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (31,25,25,8,2)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (32,25,25,8,6)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (33,25,25,8,11)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (34,14,14,8,15)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (35,2,2,8,22)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (36,1,1,8,27)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (37,1,1,9,35)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (38,10,10,9,3)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (39,10,10,9,7)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (40,10,10,9,10)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (41,1,1,9,39)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (42,42,0,10,1)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (43,32,0,10,10)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (44,10,0,10,24)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (45,12,0,10,14)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (46,6,0,11,12)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (47,28,0,11,3)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (48,12,0,11,8)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (49,2,0,12,34)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (50,45,0,12,5)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (51,10,0,13,21)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (52,15,0,13,9)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (53,2,0,13,23)
INSERT INTO `commande`(id,quantite,quantiteRetour,event_id,article_id) VALUES (54,4,0,13,40)
