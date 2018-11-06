Thomas B. Bjerke - boltho17
Vegard Gallefoss - galveg17

Hvordan kjøre prosjektet:
1. SQL filen "V1__Create_conference_talk.sql" i db.migrations/resources må kjøres manuelt for å opprette databasen.(Flyway gjør ikke dette når programmet kjøres)
2. Programmet krever input i program arguments. Skriv inn enten: 
a) Insert + Tittel + Beskrivelse (Feks: insert MyTalk awesome-description)
b) List
c) Programmet vil gi feilmelding ved andre inputs 

Kjør deretter ConferenceTalkProgram klassen.

Hva vi ikke fikk til å fungere:
1. Vi klarte ikke lese og sette opp data source fra Properties fil, Filereader klarte ikke finne filen.
2. Man får en build error når man skriver mvn package I terminal.

Evaluering:
Vi var dessverre begge syke og gikk glipp av forelesning(er) i ukene vi lærte om JDBC. Oppgaven ble derfor krevende og vi brukte mye tid på å sette oss inn i stoffet for å kunne få den til.
Det gjorde at vi ikke rakk å ta med video fra parprogrammering og evaluering fra en annen gruppe. 
Det å jobbe sammen gikk fint, selvom vi møtte på mange utfordringer med oppgaven. Det hjalp å samarbeide kontra det å jobbe alene. 