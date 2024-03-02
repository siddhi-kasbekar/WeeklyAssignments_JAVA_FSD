import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { player } from './player';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CricketService {

  baseUrl = 'http://localhost:8080/player-management'

  constructor(private _http:HttpClient) { }

  getByMatches(num1 :number, num2 :number): Observable<player[]>{

  return  this._http.get<player[]>(this.baseUrl+'/getbyrange'+'/'+num1+'/'+num2);

  }

  addPlayer(player: player) :Observable<player>{
    return this._http.post<player>(this.baseUrl + '/register', player);
  }


}
