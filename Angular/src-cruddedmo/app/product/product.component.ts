import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { product } from '../product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  productList : product[] = [];

  productListByName : product[] = [];



  constructor(private productService:ProductService){

  }

  getAllProducts(){
    this.productService.getAll().subscribe(
      (products)=>{this.productList = products;
      console.log(products);
      });

  }

  getByName(pname: string) {
    this.productService.getByProductName(pname).subscribe(
      (products) => {
        this.productListByName = products;
        console.log(products);
      }
    );
  }


  

  deleteById(id:number){


    this.productService.deleteProductById(id);

  }

}
