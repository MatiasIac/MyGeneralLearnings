namespace VisitorPattern {

    export abstract class Element {

        abstract Accept(visitor: Visitor) : void;
    }

    export interface Visitor {
        Visit(element : Element) : void;
    }
}

//Visitors
class VacationVisitor implements VisitorPattern.Visitor {

    public Visit(element : VisitorPattern.Element) : void {
        var emp = (<Employee>element);
        emp.Vacations += 2;

        console.log(emp.Name + " " + emp.Vacations);
    }
}
//

//Visitables
class Employee extends VisitorPattern.Element {

    public Name : string;
    public Vacations : number;

    constructor(name : string, vacations : number) {
        super();
        this.Name = name;
        this.Vacations = vacations;
    }
 
    public Accept(visitor : VisitorPattern.Visitor) : void {
      visitor.Visit(this);
    }
}

class Director extends Employee {

    constructor() {
        super("Director", 10);
    }
}

class President extends Employee {

    constructor() {
        super("Presidente", 100);
    }
}

class Employees {
    private employees : Array<Employee> = new Array<Employee>();
 
    public Attach(employee: Employee) : void {
        this.employees.push(employee);
    }
 
    public Detach(employee: Employee) : void {
        //this.employees.pop();
    }
 
    public Accept(visitor : VisitorPattern.Visitor) : void {
        this.employees.forEach(element => {
            element.Accept(visitor);
        });
    }
}
//**************

var employeesBucket = new Employees();
employeesBucket.Attach(new Director());
employeesBucket.Attach(new President());

employeesBucket.Accept(new VacationVisitor());
