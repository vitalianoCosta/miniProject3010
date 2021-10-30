import { Animal } from './model/animal.model';
import { Injectable } from '@angular/core';
import { HttpClient, HttpParams} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AnimalService {

  private getAnimalUrl: string; 
  private postAnimalUrl: string;

  constructor(private http: HttpClient) { 
    this.getAnimalUrl = "http://localhost:8300/animal-adoption/available"; 
    this.postAnimalUrl = "http://localhost:8300/animal-adoption";
  }
  
  public findAll(): Observable<Animal[]> {
    return this.http.get<Animal[]>(this.getAnimalUrl);
  }

  public addAdopter(petId:number): Observable<any> {
    const headers = { 'content-type': 'application/json'}  
    const body=JSON.stringify({name, petId});
    console.log(body)
    return this.http.post(this.postAnimalUrl, {"name": "bob", "petId": petId})
  }

}
