import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { product } from '../product';


@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent {

  constructor(private productService : ProductService){

  }

  updateFormData(data:product,id:number){
    this.productService.updateProduct(data,id );

  }

}
