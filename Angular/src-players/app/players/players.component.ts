import { Component } from '@angular/core';
import { CricketService } from '../cricket.service';
import { player } from '../player';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-players',
  templateUrl: './players.component.html',
  styleUrls: ['./players.component.css']
})
export class PlayersComponent {
  playerList : player[]=[];
  searchForm!: FormGroup;
  constructor(private cricketService : CricketService, private formBuilder: FormBuilder){

   
  }

  ngOnInit() {
    this.searchForm = this.formBuilder.group({
      start: ['', Validators.required],
      end: ['', Validators.required]
    });
  }


  getByMatches(val1:number,val2:number){

    
    this.cricketService.getByMatches(val1,val2).
    subscribe(
      (players)=>{this.playerList = players;
      console.log(players);
      });

  }

  onSubmit() {
    if (this.searchForm.invalid) {
      return;
    }

    const start = this.searchForm.value.start;
    const end = this.searchForm.value.end;

    this.getByMatches(start, end);
  }

}
