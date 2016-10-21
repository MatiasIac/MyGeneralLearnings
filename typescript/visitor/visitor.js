var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var VisitorPattern;
(function (VisitorPattern) {
    var Element = (function () {
        function Element() {
        }
        return Element;
    }());
    VisitorPattern.Element = Element;
})(VisitorPattern || (VisitorPattern = {}));
var VacationVisitor = (function () {
    function VacationVisitor() {
    }
    VacationVisitor.prototype.Visit = function (element) {
        var emp = element;
        emp.Vacations += 2;
        console.log(emp.Name + " " + emp.Vacations);
    };
    return VacationVisitor;
}());
var Employee = (function (_super) {
    __extends(Employee, _super);
    function Employee(name, vacations) {
        _super.call(this);
        this.Name = name;
        this.Vacations = vacations;
    }
    Employee.prototype.Accept = function (visitor) {
        visitor.Visit(this);
    };
    return Employee;
}(VisitorPattern.Element));
var Director = (function (_super) {
    __extends(Director, _super);
    function Director() {
        _super.call(this, "Director", 10);
    }
    return Director;
}(Employee));
var President = (function (_super) {
    __extends(President, _super);
    function President() {
        _super.call(this, "Presidente", 100);
    }
    return President;
}(Employee));
var Employees = (function () {
    function Employees() {
        this.employees = new Array();
    }
    Employees.prototype.Attach = function (employee) {
        this.employees.push(employee);
    };
    Employees.prototype.Detach = function (employee) {
    };
    Employees.prototype.Accept = function (visitor) {
        this.employees.forEach(function (element) {
            element.Accept(visitor);
        });
    };
    return Employees;
}());
var employeesBucket = new Employees();
employeesBucket.Attach(new Director());
employeesBucket.Attach(new President());
employeesBucket.Accept(new VacationVisitor());
