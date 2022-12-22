var CapiAbbigliamento = /** @class */ (function () {
    function CapiAbbigliamento(id, codprod, collezione, capo, modello, quantita, colore, prezzoivaesclusa, prezzoivainclusa, disponibile, saldo) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantita = quantita;
        this.colore = colore;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.prezzoivainclusa = prezzoivainclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    CapiAbbigliamento.prototype.getSaldoCapo = function () {
        var saldo = (this.prezzoivainclusa * this.saldo) / 100;
        this.prezzoivainclusa = Math.round((this.prezzoivainclusa - saldo) * 100) / 100;
        return this.prezzoivainclusa;
    };
    CapiAbbigliamento.prototype.getAcquistoCapo = function () {
        console.log("Il prezzo finale è : " + this.prezzoivainclusa + "€");
        console.log("---------------------")
        return this.prezzoivainclusa;
    };
    return CapiAbbigliamento;
}());
var CapiAbbigliamento = /** @class */ (function () {
    function CapiAbbigliamento(id, codprod, collezione, capo, modello, quantita, colore, prezzoivaesclusa, prezzoivainclusa, disponibile, saldo) {
        this.id = id;
        this.codprod = codprod;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantita = quantita;
        this.colore = colore;
        this.prezzoivaesclusa = prezzoivaesclusa;
        this.prezzoivainclusa = prezzoivainclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
    }
    CapiAbbigliamento.prototype.getSaldoCapo = function () {
        var saldo = (this.prezzoivainclusa * this.saldo) / 100;
        this.prezzoivainclusa = Math.round((this.prezzoivainclusa - saldo) * 100) / 100;
        return this.prezzoivainclusa;
    };
    CapiAbbigliamento.prototype.getAcquistoCapo = function () {
        console.log("Il prezzo finale è : " + this.prezzoivainclusa + "€");
        console.log("---------------------")
        return this.prezzoivainclusa;
    };
    return CapiAbbigliamento;
}());


async function fetchAPI() {
    const response = await fetch(`https://mocki.io/v1/765b2daf-41d5-4e94-a0d5-abd918f57b8f`);
    return response.json();
}

fetchAPI().then((array) => {
    for(oggetto of array) {
        var x = new CapiAbbigliamento(oggetto.id, oggetto.codprod, oggetto.collezione, oggetto.capo, oggetto.modello, oggetto.quantita, oggetto.colore, oggetto.prezzoivaesclusa, oggetto.prezzoivainclusa, oggetto.disponibile, oggetto.saldo);
        console.log(x);
        x.getSaldoCapo();
        x.getAcquistoCapo();
    }
});