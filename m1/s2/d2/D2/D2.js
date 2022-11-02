/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Elenca e descrivi i principali datatype in JavaScript. Prova a spiegarli come se volessi farli comprendere a un bambino.
*/

/* I datatype vengono utilizzati per classificare un particolare tipo di dati nei linguaggi di programmazione.Questi sono:
   string:la sequenza di uno o più caratteri. Rappresentano dati testuali come lettere numeri e simboli.
   number:la sequenza di uno o più numeri. Rappresentano dati numerici anche decimali.
   boolean:Può essere solo due valori: True o False. Viene utilizzato per indicare una particolare condizione
   array:può contenere più valori all'interno di una singola variabile. Ciò significa che è possibile contenere un elenco di valori all'interno di un array e scorrere attraverso di essi.
   object:può contenere molti valori come coppie nome:valore. Queste coppie forniscono un modo utile per archiviare e accedere ai dati.


*/


/* ESERCIZIO 2
 Crea una variable chiamata "name" e assegna ad essa il tuo nome, sotto forma di stringa.
*/

var name = 'marco'


/* ESERCIZIO 3
 Scrivi il codice necessario ad effettuare un addizione (una somma) dei numeri 12 e 20.
*/

let a = 12 + 20

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 4
 Crea una variable di nome "x" e assegna ad essa il numero 12.
*/

let x = 12

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 5
  Riassegna un nuovo valore alla variabile "name" già esistente: il tuo cognome.
  Dimostra l'impossibilità di riassegnare un valore ad una variabile dichiarata con il costrutto const.
*/

var name = 'beschi'

const name3 = 'marco'
const name3 = 'beschi' //risulta un errore in quanto il costrutto const è una costante e non può cambiare i dati

/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 6
 Esegui una sottrazione tra i numeri 4 e la variable "x" appena dichiarata (che contiene il numero 12).
*/

let y = x - 4


/* SCRIVI QUI LA TUA RISPOSTA */

/* ESERCIZIO 7
 Crea due variabili: "name1" e "name2". Assegna a name1 la stringa "john", e assegna a name2 la stringa "John" (con la J maiuscola!).
 Verifica che name1 sia diversa da name2 (suggerimento: è la stessa cosa di verificare che la loro uguaglianza sia falsa).
 EXTRA: verifica che la loro uguaglianza diventi true se entrambe vengono trasformate in lowercase (senza cambiare il valore di name2!).
*/

let name1 = 'john'
let name2 = 'John'

//console.log(name1 == name2) il risultato è false in quanto lo script è differente

if (name1 !== name2){name1=name1.toLowerCase()
  name2=name2.toLowerCase()}

console.log(name1 == name2)
/* avendo posto, se name1 è differente da name2 allora trasforma lo script in minuscolo, ora risulta vera */
