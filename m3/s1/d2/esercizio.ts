class BankAccount { 
    contoIniziale:number;
    constructor(contoIniziale:number){ 
        this.contoIniziale=contoIniziale;
    }
    oneDeposit(i:number){ 
        let nuovoImporto = this.contoIniziale + i;
        console.log('After this deposit your new balance is: '+nuovoImporto)
        this.contoIniziale = nuovoImporto
    }
    oneWithDraw(i:number){ 
        let nuovoImporto = this.contoIniziale - i;
        console.log('After this withdraw your new balance is: '+nuovoImporto)
        this.contoIniziale = nuovoImporto
    }
    twoDeposit(i:number){ 
        let nuovoImporto = (this.contoIniziale + i)-1.5;
        console.log('After this deposit(unknown ATM) your new balance is: '+nuovoImporto)
        this.contoIniziale = nuovoImporto
    }
    twoWithDraw(i:number){ 
        let nuovoImporto = (this.contoIniziale - i)-1.5;
        console.log('After this withdraw(unknown ATM) your new balance is: '+nuovoImporto)
        this.contoIniziale = nuovoImporto
    }
}

class AdultsAccount extends BankAccount{
    addInterest(){ 
        let balance = (this.contoIniziale * 0.1);
        let nuovoImporto = this.contoIniziale - balance;
        console.log('New balance after interest withdrew: '+nuovoImporto)
        this.contoIniziale = nuovoImporto
    }
}

let MotherAccount = new AdultsAccount(10000) 
let SonAccount = new BankAccount(1000) 
console.log(MotherAccount.contoIniziale)
console.log(SonAccount.contoIniziale)
//deposito 1
MotherAccount.oneDeposit(1000) 
SonAccount.oneDeposit(50) 
//prelievo 1
MotherAccount.oneWithDraw(400) 
SonAccount.oneWithDraw(70) 
//deposito 2
MotherAccount.twoDeposit(700) 
SonAccount.twoDeposit(30) 
//prelievo 2
MotherAccount.twoWithDraw(250) 
SonAccount.twoWithDraw(150) 
//interessi
MotherAccount.addInterest()