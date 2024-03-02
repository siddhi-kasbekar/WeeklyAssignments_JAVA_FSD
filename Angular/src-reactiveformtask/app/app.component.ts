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
      fullName : ['',[Validators.required, Validators.minLength(5),Validators.pattern('^[a-zA-Z\\s]+$')]],
      phone : ['',[Validators.required, Validators.pattern('^[0-9]{10}$')]],
      email : ['',[Validators.required,Validators.email]],
      gender:['',Validators.pattern('^(male|female|other)$')],
      username : ['',[Validators.required,Validators.minLength(10),Validators.maxLength(15),Validators.pattern('^[a-zA-Z0-9_]+$')]],
      password :['',[Validators.required,Validators.minLength(6),Validators.maxLength(20)]]
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
