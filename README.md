# Tep
Progetto scolastico di: Moruzzi Chiara, Ponzini Gloria, Dallatomasina Chezia, Delucchi Mattia e Bernazzoli Thomas.
Software realizzato utilizzando ECLIPSE.

Si vuole realizzare un sistema software per gestire gli abbonamenti e i biglietti dei clienti di una compagnia di autobus. 
Al sistema possono accedere gli amministratori dell'azienda per inserire la lista delle corse. Ogni corsa è formata dai nomi delle fermate e i vari orari giornalieri. Ad ogni fermata è associata una zona (es. Ozzano, Riccò, Fornovo Stazione e Fornovo Itsos Gadda sono zona 1, mentre da Collecchio inizia zona 2 etc.). 
Inoltre gli amministratori possono inserire le tipologie di abbonamenti e le tipologie di biglietti acquistabili.  
Un abbonamento ad esempio può essere mensile per 2 zone al costo di 30 euro o bimestrale per 3 zone al costo di 65 euro etc. 
Un biglietto può essere singolo per 2 zone al costo di 1 euro o valido per 7 corse per 3 zone al costo di 9 euro etc. 
Il cliente accede al sistema senza autenticazione e può comprare i biglietti o gli abbonamenti o rinnovare un abbonamento scaduto. 
La procedura di acquisto prevede l'inserimento di Nome e Cognome e restituirà un codice numerico identificativo del biglietto o abbonamento comprato, mentre la procedura di rinnovo prevede l'inserimento dell'identificativo dell'abbonamento e il sistema, una volta riconosciuto l'utente gli mostrerà la lista delle tipologie di abbonamento acquistabili. 
Il cliente potrà anche usare il sistema per obliterare il biglietto o l'abbonamento. Infatti potrà accedere al sistema e inserire l'identificativo del biglietto o abbonamento e dichiarare il numero e l'orario della corsa in cui si trova, la fermata in cui è salito e la fermata in cui scenderà. Il sistema controllerà se il biglietto in possesso prevede questo numero di zone e renderà il biglietto obliterato. 
A quel punto un eventuale controllore potrà, accedendo al sistema, controllare se il biglietto con quell'identificativo risulta obliterato per quella corsa. 
Esiste un account Super Amministratore che può entrare nel sistema solo per aggiungere nuovi amministratori e nuovi controllori e creare i loro accessi. 
