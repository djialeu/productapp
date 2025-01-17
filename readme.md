

cloner le repository 

git clone git@github.com:djialeu/productapp.git

creer un fichier .env a la racine du projet (au meme niveau que pom.xml) et rajouter les variables suivantes :

POSTGRES_USER=postgres
POSTGRES_PASSWORD=password
POSTGRES_DB=product

NB:  En cas de lancement sans docker, veuillez mettre à jour les valeurs des variables avec leur correspondance en local sur votre pc (postgres_user, postgres_password, spring_datasource_username, spring_datasource_password). 
     N'oubliez pas de creer la base de donnees "product"

Avec Docker

rassurez vous d'avoir docker installé sur votre pc puis positionnez vous à la racine du projet et lancer la commande:

docker-compose up -d 

le sgbd  postgresql est disponible sur le port 5432 avec la bd "product"
le projet api est disponible sur le port 8080 : http://localhost:8080


Sans docker 

une fois le fichier .env cree utiliser la commande .\mvnw spring-boot:run
rassurez vous d'avoir le dossier .mvn


Front End 
Dans le dossier src/main/crud-app

lancer 
- npm install
- npm start 

Le projet est lancer au http://localhost:3000