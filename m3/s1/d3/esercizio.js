"use strict";
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
exports.__esModule = true;
var Lavoratore = /** @class */ (function () {
    function Lavoratore(redditoAnnuoLordo, codredd, tasseInps, tasseIrpef) {
        this.codredd = codredd;
        this.redditoAnnuoLordo = redditoAnnuoLordo;
        this.tasseInps = tasseInps;
        this.tasseIrpef = tasseIrpef;
    }
    Lavoratore.prototype.getUtileTasse = function (spesa) {
        return this.redditoAnnuoLordo - spesa;
    };
    Lavoratore.prototype.getTasseInps = function (utile) {
        return (utile * this.tasseInps) / 100;
    };
    Lavoratore.prototype.getTasseIrpef = function (utile) {
        return (utile * this.tasseIrpef) / 100;
    };
    Lavoratore.prototype.getRedditoAnnuoNetto = function (tassaIrpef, tassaInps) {
        return this.redditoAnnuoLordo - (tassaIrpef + tassaInps);
    };
    return Lavoratore;
}());
var medico = /** @class */ (function (_super) {
    __extends(medico, _super);
    function medico() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    medico.prototype.getTasseInps = function (utile) {
        if (this.redditoAnnuoLordo >= 30000) {
            return (utile * 21) / 100;
        }
        else {
            return (utile * this.tasseInps) / 100;
        }
    };
    medico.prototype.getTasseIrpef = function (utile) {
        if (this.redditoAnnuoLordo >= 30000) {
            return (utile * 19) / 100;
        }
        else {
            return (utile * this.tasseIrpef) / 100;
        }
    };
    return medico;
}(Lavoratore));
var operaio = /** @class */ (function (_super) {
    __extends(operaio, _super);
    function operaio(redditoAnnuoLordo, codredd, tasseInps, tasseIrpef) {
        var _this = _super.call(this, redditoAnnuoLordo, tasseInps, tasseIrpef, codredd) || this;
        {
            _this.tasseInps = tasseInps;
            _this.tasseIrpef = tasseIrpef;
            _this.codredd = codredd;
            _this.redditoAnnuoLordo = redditoAnnuoLordo;
        }
        return _this;
    }
    return operaio;
}(Lavoratore));
var mario = new medico(12000, 1111, 13, 12);
var tasseUtilimario = mario.getUtileTasse(1250);
console.log(tasseUtilimario);
var tasseInpsmario = mario.getTasseInps(tasseUtilimario);
console.log(tasseInpsmario);
var tasseIrpefmario = mario.getTasseIrpef(tasseUtilimario);
console.log(tasseIrpefmario);
var redditoNettomario = mario.getRedditoAnnuoNetto(tasseInpsmario, tasseIrpefmario);
console.log(redditoNettomario);
var luca = new medico(34000, 3333, 15, 13);
var tasseUtililuca = luca.getUtileTasse(7000);
console.log(tasseUtililuca);
var tasseInpsluca = luca.getTasseInps(tasseUtililuca);
console.log(tasseInpsluca);
var tasseIrpefluca = luca.getTasseIrpef(tasseUtililuca);
console.log(tasseIrpefluca);
var redditoNettoluca = luca.getRedditoAnnuoNetto(tasseInpsluca, tasseIrpefluca);
console.log(redditoNettoluca);
var paolo = new operaio(24000, 2222, 14, 13);
var tasseUtilipaolo = paolo.getUtileTasse(2300);
console.log(tasseUtilipaolo);
var tasseInpspaolo = paolo.getTasseInps(tasseUtilipaolo);
console.log(tasseInpspaolo);
var tasseIrpefpaolo = paolo.getTasseIrpef(tasseUtilipaolo);
console.log(tasseIrpefpaolo);
var redditoNettopaolo = paolo.getRedditoAnnuoNetto(tasseInpspaolo, tasseIrpefpaolo);
console.log(redditoNettopaolo);
