# Inlämningsrapport

Information
OBS!!! Ändra absolut inte på rubrikerna i denna fil!!!!

## Inledning

### Vad handlar uppgiften om?
Uppgiften handlar om att skapa ett kalkylator-API med hjälp av Docker. Målet är att utveckla en applikation som kan utföra grundläggande matematiska beräkningar och exponera dessa funktioner via ett API. Applikationen ska paketeras i en Docker-container för att underlätta distribution och körning.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur uppfattade du uppgiften initialt?
Initialt uppfattade jag uppgiften som en bra möjlighet att tillämpa mina kunskaper inom API-utveckling och Docker. Jag såg det som en chans att fördjupa min förståelse för hur man skapar och paketerar applikationer i containrar. Samtidigt insåg jag att det kunde finnas utmaningar med att implementera kalkylatorfunktionaliteten och säkerställa att API:et fungerade korrekt.
--- Skriv ovanför och ta inte bort denna raden ---

## Planering och genomförande

### Hur planerade du att lösa uppgiften?
För att lösa uppgiften planerade jag att dela upp arbetet i flera steg. Först tänkte jag skapa en grundläggande struktur för applikationen och definiera API-endpoints för de olika matematiska operationerna. Sedan skulle jag implementera logiken för beräkningarna och testa att allt fungerade som förväntat. Därefter skulle jag skapa en Dockerfile för att paketera applikationen i en container och konfigurera den för att kunna köras med Docker.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka steg tog du för att lösa uppgiften, skiljer sig ditt utförande från tidigare uppgifter?
Skapade en grundläggande projektstruktur med nödvändiga filer och mappar.
Definierade API-endpoints för addition, subtraktion, multiplikation och division.
Implementerade logiken för beräkningarna i applikationen.
Testade API:et lokalt för att säkerställa att det fungerade korrekt.
Skapade en Dockerfile för att bygga en Docker-image av applikationen.
Konfigurerade Dockerfile med nödvändiga instruktioner för att bygga och köra containern.
Byggde Docker-imagen och testade att köra containern lokalt.
Verifierade att API:et var tillgängligt och fungerade som förväntat i containern.
Mitt tillvägagångssätt skilde sig något från tidigare uppgifter, då jag den här gången lade mer fokus på att paketera applikationen i en Docker-container. Jag behövde sätta mig in i hur man skapar en Dockerfile och konfigurerar den för att bygga och köra applikationen korrekt.
--- Skriv ovanför och ta inte bort denna raden ---

### Skriv en tydlig och lättförståelig dokumentation av bygg- och körprocessen:
Klona projektet från GitLab-repositoriet till din lokala miljö.
Navigera till projektets rotmapp i terminalen.
Kör kommandot docker build -t calculator-api . för att bygga Docker-imagen. Detta kommer att skapa en image med taggen "calculator-api".
När bygget är klart, kör kommandot docker run -p 8080:8080 calculator-api för att starta en container baserad på den byggda imagen. Detta kommer att mappa port 8080 i containern till port 8080 på värddatorn.
API:et är nu tillgängligt på http://localhost:8080. Du kan testa det genom att skicka HTTP-förfrågningar till de olika endpoints som definierats, t.ex. http://localhost:8080/add?a=5&b=3 för att addera talen 5 och 3.
--- Skriv ovanför och ta inte bort denna raden ---

## Utmaningar och lösningar

### Vilka utmaningar stötte du på under projektet?
En av de största utmaningarna var att konfigurera Dockerfile korrekt för att bygga och köra applikationen. Jag behövde säkerställa att alla nödvändiga dependencies installerades och att applikationen startades på rätt sätt inuti containern. En annan utmaning var att hantera felaktiga indata till API:et och returnera lämpliga felmeddelanden.
--- Skriv ovanför och ta inte bort denna raden ---

### Hur löste du dessa utmaningar?
För att lösa utmaningen med Dockerfile studerade jag dokumentationen och exempel på hur man strukturerar en Dockerfile för en liknande applikation. Jag experimenterade med olika instruktioner och testade att bygga och köra containern för att se att allt fungerade som förväntat. När det gällde felhantering i API:et lade jag till kontroller för att validera indata och returnera tydliga felmeddelanden om indatan var ogiltig.
--- Skriv ovanför och ta inte bort denna raden ---

## Reflektion och utvärdering

### Vad lärde du dig genom att genomföra projektet?
Genom att genomföra det här projektet fick jag en djupare förståelse för hur man skapar och paketerar applikationer med Docker. Jag lärde mig hur man skriver en Dockerfile för att bygga en Docker-image och hur man konfigurerar containern för att köra applikationen. Jag fick också praktisk erfarenhet av att utveckla ett API med olika endpoints och hantera felaktiga indata. Dessutom förbättrade projektet min förmåga att strukturera kod och skapa en tydlig dokumentation.
--- Skriv ovanför och ta inte bort denna raden ---

### Vilka möjligheter ser du för framtida projekt baserat på denna erfarenhet?
Erfarenheten från detta projekt öppnar upp många möjligheter för framtida utveckling. Jag känner mig nu mer bekväm med att använda Docker för att paketera och distribuera applikationer, vilket är en värdefull kunskap i dagens utvecklingsmiljö. Jag ser potential att tillämpa dessa kunskaper i mer komplexa projekt där skalbarhet och portabilitet är viktiga faktorer. Dessutom har jag fått en bättre förståelse för API-design och felhantering, vilket jag kan dra nytta av i framtida projekt som involverar utveckling av webbtjänster och integration med andra system.






--- Skriv ovanför och ta inte bort denna raden ---
