class CapiAbbigliamento {
    id: number;
    codprod: number;
    collezione: string;
    capo: string;
    modello: number;
    quantita: number;
    colore: string;
    prezzoivaesclusa: number;
    prezzoivainclusa: number;
    disponibile: string;
    saldo: number;

    constructor(id: number, codprod: number, collezione: string, capo: string, modello: number, quantita: number, colore: string, prezzoivaesclusa: number, prezzoivainclusa: number, disponibile: string, saldo: number) {
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

    getSaldoCapo(): number {
        var sconto = (this.prezzoivainclusa * this.saldo) / 100;
        this.prezzoivainclusa = Math.round((this.prezzoivainclusa - sconto) * 100) / 100;
        return this.prezzoivainclusa;
    }
    getAcquistoCapo(): number {
        console.log("Il prezzo finale è : " + this.prezzoivainclusa + "€");
        console.log("-----------------------")
        return this.prezzoivainclusa;
    }
}
