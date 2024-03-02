import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { 
    console.log("User service invoked");
    
  }

  users:User[]=[{"uid":10,"username":"sid","email":"sid@gmail.com","address":"kop"},
  {"uid":20,"username":"rutuja","email":"rutu@gmail.com","address":"kowad"},
  {"uid":30,"username":"isha","email":"isha@gmail.com","address":"kop"}];

  getAllUsers(){
    console.log('getAllusers() called ...');
    
    return this.users;

  }
}
