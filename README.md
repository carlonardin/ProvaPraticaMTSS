[![Java CI with Maven](https://github.com/carlonardin/ProvaPraticaMTSS/actions/workflows/main.yml/badge.svg?branch=main)](https://github.com/carlonardin/ProvaPraticaMTSS/actions/workflows/main.yml)
[![Coverage Status](https://coveralls.io/repos/github/carlonardin/ProvaPraticaMTSS/badge.svg?branch=c70b4b81b8c2617e3452d3c55e958c48b21427dd)](https://coveralls.io/github/carlonardin/ProvaPraticaMTSS?branch=c70b4b81b8c2617e3452d3c55e958c48b21427dd)


# Prova Pratica | roman-number

## Descrizione del Progetto
Il progetto consiste nello sviluppo di un convertitore Java per trasformare numeri interi (da 1 a 1000) in numeri romani, con successiva stampa in formato **ASCII Art**. Lo sviluppo è stato condotto seguendo i principi della **Continuous Integration** per garantire un software affidabile e ben strutturato.

**Corso:** Metodi e Tecnologie per lo Sviluppo Software (MTSS)  
**Università:** Università degli Studi di Padova

## Componenti del Gruppo
* **Carlo Nardin** - 2148000
* **Cristian Gramegna** - 2148633

## Workflow Adottato
Per la gestione del ciclo di vita del software e dei rami di sviluppo è stato adottato il modello **Feature Branch - Gitflow**

## Qualità del Software e CI
Per soddisfare i requisiti di qualità e automazione richiesti, sono stati integrati i seguenti strumenti:

* **Build Automation:** Pipeline gestita tramite **GitHub Actions** che automatizza la compilazione e l'esecuzione dei test ad ogni push o pull request.
* **Analisi Statica:** Verifica della qualità e dello stile del codice tramite il plugin **Checkstyle**, configurato per far fallire la build in caso di violazioni dei vincoli definiti.
* **Code Coverage:** Monitoraggio della copertura dei test tramite **JaCoCo** e integrazione con **Coveralls**, mantenendo una soglia di copertura superiore all'85%.