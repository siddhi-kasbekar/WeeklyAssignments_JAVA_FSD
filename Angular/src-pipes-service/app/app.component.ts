import { Component } from '@angular/core';
import { UserService } from './user.service';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webApp';

  userList:User[]=[];
  constructor(private userService:UserService){

    console.log("component obj created");
    

  }

  ngOnInit():void{
    console.log("ngOnInit");
    this.getAll();
    
  }

  getAll(){
   this.userList= this.userService.getAllUsers();
  }
}
