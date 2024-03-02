import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webApp';

  childDataReceived='';
  parentData :string = 'Hi this is from parent'

  getChildData(data:any){
    console.log(data);
    this.childDataReceived=data;
    

  }
}
