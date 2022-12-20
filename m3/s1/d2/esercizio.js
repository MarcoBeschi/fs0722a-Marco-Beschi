var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var BankAccount = /** @class */ (function () {
    function BankAccount(contoIniziale) {
        this.contoIniziale = contoIniziale;
    }
    BankAccount.prototype.oneDeposit = function (i) {
        var nuovoImporto = this.contoIniziale + i;
        console.log('After this deposit your new balance is: ' + nuovoImporto);
        this.contoIniziale = nuovoImporto;
    };
    BankAccount.prototype.oneWithDraw = function (i) {
        var nuovoImporto = this.contoIniziale - i;
        console.log('After this withdraw your new balance is: ' + nuovoImporto);
        this.contoIniziale = nuovoImporto;
    };
    BankAccount.prototype.twoDeposit = function (i) {
        var nuovoImporto = (this.contoIniziale + i) - 1.5;
        console.log('After this deposit(unknown ATM) your new balance is: ' + nuovoImporto);
        this.contoIniziale = nuovoImporto;
    };
    BankAccount.prototype.twoWithDraw = function (i) {
        var nuovoImporto = (this.contoIniziale - i) - 1.5;
        console.log('After this withdraw(unknown ATM) your new balance is: ' + nuovoImporto);
        this.contoIniziale = nuovoImporto;
    };
    return BankAccount;
}());
var AdultsAccount = /** @class */ (function (_super) {
    __extends(AdultsAccount, _super);
    function AdultsAccount() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    AdultsAccount.prototype.addInterest = function () {
        var balance = (this.contoIniziale * 0.1);
        var nuovoImporto = this.contoIniziale - balance;
        console.log('New balance after interest withdrew: ' + nuovoImporto);
        this.contoIniziale = nuovoImporto;
    };
    return AdultsAccount;
}(BankAccount));
var MotherAccount = new AdultsAccount(10000);
var SonAccount = new BankAccount(1000);
console.log(MotherAccount.contoIniziale);
console.log(SonAccount.contoIniziale);
//deposito 1
MotherAccount.oneDeposit(1000);
SonAccount.oneDeposit(50);
//prelievo 1
MotherAccount.oneWithDraw(400);
SonAccount.oneWithDraw(70);
//deposito 2
MotherAccount.twoDeposit(700);
SonAccount.twoDeposit(30);
//prelievo 2
MotherAccount.twoWithDraw(250);
SonAccount.twoWithDraw(150);
//interessi
MotherAccount.addInterest();
