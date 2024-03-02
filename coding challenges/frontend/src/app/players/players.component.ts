import { Component } from '@angular/core';
import { CricketService } from '../cricket.service';
import { player } from '../player';
import { AbstractControl, FormBuilder, FormGroup, ValidationErrors, Validators } from '@angular/forms';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent {
  playerList : player[]=[];
  searchForm!: FormGroup;
  constructor(private cricketService : CricketService){
   
    
   
  }

 
  
  


  getByMatches(data:any) {
    if (data.invalid) {
      return;
    }
  
    const start = data.value.start;
    const end = data.value.end;
  
    this.cricketService.getByMatches(start, end)
      .subscribe(
        (players) => {
          this.playerList = players;
          console.log(players);
        },
        (error) => {
          console.error(error);
        }
      );
  }
  



}
