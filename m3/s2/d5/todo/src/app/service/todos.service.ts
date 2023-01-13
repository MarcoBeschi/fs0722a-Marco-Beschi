import { Injectable } from '@angular/core';
import { List } from '../interfaces/list';

@Injectable({
  providedIn: 'root'
})
export class TodosService {

  list:List[]=[]

  constructor() { }

  add(ogg:string){
      this.list.push({ id: this.list.length, title: ogg, completed: false });
      console.log(this.list)
      return ogg
  }


  change(id: number) {
      this.list[id].completed = true;
      console.log(this.list[id])
  }

  remove(id:number){
      this.list = this.list.filter(ogg => ogg.id!==id)
    }
}
