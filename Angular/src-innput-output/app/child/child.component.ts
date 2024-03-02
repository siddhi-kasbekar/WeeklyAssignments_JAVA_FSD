import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  @Input()
  demoInput : string = '';

  @Output()
  myEventEmitter : EventEmitter<string> = new EventEmitter();


  myOutput:string='hello parent!!'

  ngOnInit(){
    console.log('child received data--'+this.demoInput);
    
  }

  sendChildData(){
    this.myEventEmitter.emit(this.myOutput);
  }
}
