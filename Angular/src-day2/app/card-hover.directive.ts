import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appCardHover]'
})
export class CardHoverDirective {

  constructor(private el:ElementRef) { }

}