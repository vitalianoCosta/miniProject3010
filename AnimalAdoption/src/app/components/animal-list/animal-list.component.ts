import { AnimalService } from './../../animal.service';
import { Animal } from './../../model/animal.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'animal-list',
  templateUrl: './animal-list.component.html',
  styleUrls: ['./animal-list.component.css']
})
export class AnimalListComponent implements OnInit {

  public animals:Animal[];

  constructor(private animalService:AnimalService) {
    this.animals = [];
   }

  ngOnInit(): void {
    this.animalService.findAll().subscribe(data =>{
      this.animals = data;
    });
  }

  addAdopter(i:number){
    this.animalService.addAdopter(i);
    this.animalService.findAll().subscribe(data =>{
      this.animals = data;
    });
  }

}

