import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CricketService } from '../cricket.service';
import { player } from '../player';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})
export class AddPlayerComponent {
  addPlayerForm!: FormGroup;
  submitted = false;

  constructor(private formBuilder: FormBuilder,private cricketService :CricketService) { }

  ngOnInit() {
    this.addPlayerForm = this.formBuilder.group({
      playerName: ['', [Validators.required, Validators.minLength(5)]],
      jerseyNumber: ['', [Validators.required]],
      role: ['', [Validators.required]],
      totalMatches: ['', [Validators.required]],
      teamName: ['', [Validators.required]],
      countryName: ['', [Validators.required]],
      description: ['']
    });
  }

  get f() {
    return this.addPlayerForm.controls;
  }

  onSubmit(data:player) {
    this.submitted = true;
    if (this.addPlayerForm.invalid) {
      return;
    }
    this.cricketService.addPlayer(data)
    .subscribe(
      (player)=>{console.log('Added player is: '+ player);}
      );
    
  }

}
