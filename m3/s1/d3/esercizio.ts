interface ITasse {
  redditoAnnuoLordo: number;
  codredd: number;
  tasseInps: number;
  tasseIrpef: number;
}

abstract class Lavoratore implements ITasse {
  redditoAnnuoLordo: number;
  codredd: number;
  tasseInps: number;
  tasseIrpef: number;
  constructor(
    redditoAnnuoLordo: number,
    codredd: number,
    tasseInps: number,
    tasseIrpef: number
  ) {
    this.codredd = codredd;
    this.redditoAnnuoLordo = redditoAnnuoLordo;
    this.tasseInps = tasseInps;
    this.tasseIrpef = tasseIrpef;
  }

  public getUtileTasse(spesa: number): number {
    return this.redditoAnnuoLordo - spesa;
  }

  public getTasseInps(utile: number): number {
    return (utile * this.tasseInps) / 100;
  }


  public getTasseIrpef(utile: number): number {
    return (utile * this.tasseIrpef) / 100;
  }


  public getRedditoAnnuoNetto(tassaIrpef: number, tassaInps: number): number {
    return this.redditoAnnuoLordo - (tassaIrpef + tassaInps);
  }
}


class medico extends Lavoratore {
  getTasseInps(utile: number): number {
    if (this.redditoAnnuoLordo >= 30000) {
      return (utile * 21) / 100;
    } else {
      return (utile * this.tasseInps) / 100;
    }
  }

  getTasseIrpef(utile: number): number {
    if (this.redditoAnnuoLordo >= 30000) {
      return (utile * 19) / 100;
    } else {
      return (utile * this.tasseIrpef) / 100;
    }
  }
}

class operaio extends Lavoratore {
  redditoAnnuoLordo: number;
  tasseInps: number;
  tasseIrpef: number;
  codredd: number;
  constructor(
    redditoAnnuoLordo: number,
    codredd: number,
    tasseInps: number,
    tasseIrpef: number
  ) {
    super(redditoAnnuoLordo, tasseInps, tasseIrpef, codredd);
    {
      this.tasseInps = tasseInps;
      this.tasseIrpef = tasseIrpef;
      this.codredd = codredd;
      this.redditoAnnuoLordo = redditoAnnuoLordo;
    }
  }
}

let mario = new medico(12000, 1111, 13, 12);
let tasseUtilimario = mario.getUtileTasse(1250);
console.log(tasseUtilimario);
let tasseInpsmario = mario.getTasseInps(tasseUtilimario);
console.log(tasseInpsmario);
let tasseIrpefmario = mario.getTasseIrpef(tasseUtilimario);
console.log(tasseIrpefmario);
let redditoNettomario = mario.getRedditoAnnuoNetto(
  tasseInpsmario,
  tasseIrpefmario
);
console.log(redditoNettomario);


let luca = new medico(34000, 3333, 15, 13);
let tasseUtililuca = luca.getUtileTasse(7000);
console.log(tasseUtililuca);
let tasseInpsluca = luca.getTasseInps(tasseUtililuca);
console.log(tasseInpsluca);
let tasseIrpefluca = luca.getTasseIrpef(tasseUtililuca);
console.log(tasseIrpefluca);
let redditoNettoluca = luca.getRedditoAnnuoNetto(
  tasseInpsluca,
  tasseIrpefluca
);
console.log(redditoNettoluca);

let paolo = new operaio(24000, 2222, 14, 13);
let tasseUtilipaolo = paolo.getUtileTasse(2300);
console.log(tasseUtilipaolo);
let tasseInpspaolo = paolo.getTasseInps(tasseUtilipaolo);
console.log(tasseInpspaolo);
let tasseIrpefpaolo = paolo.getTasseIrpef(tasseUtilipaolo);
console.log(tasseIrpefpaolo);
let redditoNettopaolo = paolo.getRedditoAnnuoNetto(
  tasseInpspaolo,
  tasseIrpefpaolo
);
console.log(redditoNettopaolo);
export {};