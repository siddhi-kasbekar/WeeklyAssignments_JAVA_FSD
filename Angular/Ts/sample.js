// function greet(name: string) {
//     return `Hello, ${name}!`;
// }
// let person = "Siddhi";
// console.log(greet(person));
// let v: any = true;
// v = "string"; // no error as it can be "any" type
// Math.round(v);
// console.log(v);
// const names: string[] = [];
// names.push("Sid");
// console.log(names);
// const car: { type: string, model: string, year: number } = {
//     type: "Toyota",
//     model: "Corolla",
//     year: 2009
//   };
//   console.log(car);
var demo = /** @class */ (function () {
    function demo() {
    }
    demo.prototype.f1 = function () {
        console.log("this is f1()");
    };
    return demo;
}());
var d1 = new demo();
d1.f1();
