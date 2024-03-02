import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { product } from './product';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  baseUrl = 'http://localhost:3000/products/';

  constructor(private _http:HttpClient) { }


  getAll():Observable<product[]>{
   return  this._http.get<product[]>(this.baseUrl);
    
  }


  addProduct(product:product){
    this._http.post<product>(this.baseUrl,product)
    .subscribe((response)=>{console.log("added",response);
    })

  }

  deleteProductById(id : number){
    this._http.delete<product>(this.baseUrl+id)
    .subscribe( (data) => { console.log(id +"record deleted");}, err => { console.log(err)});

  }

  updateProduct(product:product,id:number){
      this._http.put<product>(this.baseUrl+id,product)
    .subscribe((response)=>{console.log("updated",response);
    })
  }

  getByProductName(pname:string):Observable<product[]>{
    const params = { name: pname };
    return this._http.get<product[]>(this.baseUrl, { params });     
  }

  
}
