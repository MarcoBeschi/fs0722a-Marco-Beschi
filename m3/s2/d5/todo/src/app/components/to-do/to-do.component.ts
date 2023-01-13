import { Component, OnInit } from '@angular/core';
import { List } from 'src/app/interfaces/list';
import { TodosService } from 'src/app/service/todos.service';

@Component({
  selector: 'app-to-do',
  templateUrl: './to-do.component.html',
  styleUrls: ['./to-do.component.scss'],
})
export class ToDoComponent implements OnInit {
  lista: List[] = [];

  constructor(private todoSrv: TodosService) {}

  ngOnInit(): void {}

  aggiungi(ogg: string) {
    setTimeout(() => {
      if (ogg !== '') {
        let x = this.todoSrv.add(ogg);
        this.lista.push({
          id: this.lista.length,
          title: x,
          completed: false,
        });
      }
    }, 2000);
  }

  completato(id: number) {
    setTimeout(() => {
      this.lista[id].completed = true;
      this.lista = this.lista.filter((ogg) => ogg.id !== id);
      this.todoSrv.change(id);
    }, 2000);
  }
}
