import { Injectable } from '@angular/core';
import { Todo } from './todo.interface';


@Injectable({
  providedIn: 'root'
})
export class TodosService {

  constructor() { }

  todo: Todo[] = []

  getTodo(){

  }

  editTodo(id:number){

  }

  addTodo(){

  }
}
