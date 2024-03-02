const af = ()=>{
    console.log("arrow function");
}
af();


function add(a,b=5){ //default arg 
    return a+b;
}

console.log(add(3));

function fun1(name,city,...a1){ //spread or rest operator a1[] - for overloading - it should be in the last 
    console.log("fun1 executed");
    console.log(name);
    console.log(city);
    console.log(a1[0]);

}
fun1("siddhi","kop",3,4);

//destructuring
const obj = {first:"siddhi",last:"kasbekar"}
const{first:f,last:l}=obj;
console.log(f);
console.log(l);