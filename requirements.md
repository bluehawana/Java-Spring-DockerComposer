# Vecka 4: Dockerisera ett Spring Boot-projekt med Multi-Stage Build

## Beskrivning

Detta projekt handlar om att dockerisera ett Spring Boot-projekt med ett kalkylator API. Målet är att skapa en effektiv
byggprocess genom att använda multi-stage builds i Docker, vilket ger de studerande praktisk erfarenhet av
containeriseringstekniker och Docker. Projektet involverar att använda Maven för att bygga projektet och skapa en körbar
JAR-fil.

## Mål

- Skapa en Dockerfile med multi-stage build för att bygga och köra Spring Boot-applikationen.
- Bygga applikationen med Maven och skapa en körbar JAR-fil.
- Använda Docker för att automatisera byggprocessen.
- Dokumentera steg för steg processen för att bygga och köra applikationen med Docker.
- Följa Clean Code-principer.

## Förkunskaper

- Grundläggande kunskaper i Java.
- Förståelse för Objektorienterad Programmering (OOP).
- Grundläggande kunskaper i Spring Boot.
- Grundläggande kunskaper i Maven.
- Grundläggande kunskaper i Docker och containerisering.

## Färdigheter som utvecklas

- Förmågan att skapa och hantera Docker-images.
- Förståelse för multi-stage builds i Docker.
- Kunskap i att använda Maven för att bygga Java-applikationer.
- Implementering av Clean Code-principer.
- Automatisering av byggprocessen med Docker.
- Dokumentation av bygg- och körprocessen med Docker.

## Steg-för-Steg Instruktioner

1. **Dockerfile:** Skapa en Dockerfile med multi-stage build för att bygga och köra Spring Boot-applikationen.
2. **Bygg JAR-fil:** Använd Maven för att bygga projektet och skapa en körbar JAR-fil (i Multi-Stage Build momentet)
3. **Bygg och Kör med Docker:** Bygg Docker-imagen och kör applikationen i en container.
4. **Dokumentation:** Skapa en dokumentation som beskriver processen för att bygga och köra applikationen med Docker.

## Ni ska leverera

- En Dockerfile med multi-stage build.
- Byggd Docker-image och körbar container.
- En dokumentationsfil som beskriver steg för steg processen för att bygga och köra applikationen med Docker.
- Ifylld `personal-reflection.md`-fil.

## Bedömningskriterier

- **Funktionalitet:** Applikationen ska korrekt byggas och köras i en Docker-container.
- **Kodkvalitet:** Dockerfile skall vara lättförståelig.
- **Testning:** Manuell kontroll att applikationen fungerar korrekt i Docker med `generated-requests.http`.
- **Docker-implementation:** Effektiv och korrekt användning av multi-stage builds i Docker.
- **Dokumentation:** Tydlig och lättförståelig dokumentation av bygg- och körprocessen.

## Kursmål som testas

- Den studerande kan bygga, containerisera och dokumentera en applikation med Docker.

Lycka till och ha kul!
