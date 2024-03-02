var Employee = /** @class */ (function () {
    function Employee() {
        this.eid = 0;
        this.ename = "";
        console.log("default emp constructor");
    }
    return Employee;
}());
var employee = new Employee();
employee.eid = 101;
employee.ename = "Sid";
console.log(employee);
