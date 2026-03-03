# 📘 PROG3 – Progetto di Programmazione 3

Repo dedicato al **progetto realizzato per l’esame di Programmazione 3** all’Università degli Studi di *Parthenope*.

Il progetto è stato sviluppato con l’obiettivo di simulare il trasferimento di diversi tipi di dati (*immagini, audio, testo*) attraverso un sistema di comunicazione, utilizzando concetti di **design pattern, algoritmi di percorso minimo e tecnologie server**.

---

## 🎯 Descrizione del Progetto

L’applicazione costruita affronta i seguenti obiettivi principali:

- Simulare il trasferimento di dati tramite modem virtuali
- Applicare opportuni **design pattern** per una struttura modulare e scalabile
- Calcolare il **percorso minimo** per raggiungere il modem di destinazione utilizzando l’**algoritmo di Dijkstra**
- Fornire una semplice **interfaccia grafica web** per visualizzare la simulazione

La logica principale è implementata in Java, con una componente front-end minimale gestita tramite un server Tomcat.

---

## 🧠 Architettura del Progetto

Il progetto è strutturato in due parti:

### 📁 `src/main`

Contiene il codice sorgente Java:

- Modelli per la rappresentazione dei dati
- Implementazioni dei design pattern
- Algoritmo di percorso minimo (Dijkstra)
- Logica di simulazione

### 📁 `lib`

Library esterne utilizzate per compilazione e runtime.

---

## 🚀 Funzionalità

Il software implementa:

- Parsing di tipologie di dati (immagini, audio, testo)
- Rappresentazione dei nodi di rete come oggetti gestibili
- Calcolo di percorsi ottimali tra modem
- Esposizione della simulazione tramite interface web su Tomcat

---

## 🛠️ Tecnologie Utilizzate

- **Java** (principal language)
- **Design Pattern** per organizzazione del codice
- **Algoritmo di Dijkstra** per percorso minimo
- **Apache Tomcat** come server web
- **HTML/CSS/JS** per interfaccia front-end minimale

---

## 🧾 Istruzioni per l’Esecuzione

1. Clona il repository:
   ```bash
   git clone https://github.com/criskong/PROG3.git
