import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webApp';

  username:string="siddhi";

  addressJson={'city':'Kop','state':'maharshtra','country':'india'}
}
