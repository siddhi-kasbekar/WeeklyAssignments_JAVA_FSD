class Employee{

    eid: number = 0;
    ename:string="";




    constructor(){
        console.log("default emp constructor");
        
    }


}
const employee = new Employee();
employee.eid=101;
employee.ename="Sid";
console.log(employee);
