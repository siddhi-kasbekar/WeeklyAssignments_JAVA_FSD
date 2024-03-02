import { Component } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webApp';


  registerForm!:FormGroup;
  submitted = false;


  constructor(private formBuilder:FormBuilder){

  }

  ngOnInit(){
    this.registerForm= this.formBuilder.group({
      firstName : ['',[Validators.required, Validators.minLength(5)]],
      lastName : ['',[Validators.required, Validators.pattern('[A-Za-z]')]],
      email : ['',[Validators.required,Validators.email]],
      password : ['',[Validators.required,Validators.minLength(6),Validators.maxLength(10)]]

    });
  }


  get f(){
    return this.registerForm.controls;
  }

  onSubmit(){
    this.submitted = true;
    if(this.registerForm.invalid){
      return
    }
    alert('SUCCESS!! :-)')
  }

}
