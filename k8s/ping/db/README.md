# DB 

- le credenziali dovrebbero essere codificate in base64. 
- Ad esempio, bXl1c2Vy è il risultato di echo -n 'myuser' | base64 
- e cGFzc3dvcmQ= è il risultato di echo -n 'password' | base64.


- avvia docker image mysql
lanciare il docker-compose.yml con il comando docker-compose up -d


exec in pod
mysql -u root -p 
CRATE DATABASE mydb;
use mydb;
CREATE TABLE Persons (     PersonID int,  
LastName varchar(255),     FirstName varchar(255),    
Address varchar(255),     City varchar(255) );


Verifica che le variabili d'ambiente siano correttamente impostate nel container:
Puoi verificare che le variabili d'ambiente siano correttamente propagate al container eseguendo un comando come:

kubectl exec -it <pod-name> -- printenv | grep SPRING

Questo comando dovrebbe mostrare le variabili d'ambiente `SPRING_DATASOURCE_URL`, `SPRING_DATASOURCE_DRIVER_CLASS_NAME`, `SPRING_DATASOURCE_USERNAME` e `SPRING_DATASOURCE_PASSWORD` con i rispettivi valori. 

l'ip di mysql viene restituito con ifconfig