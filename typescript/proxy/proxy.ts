namespace ProxyPattern {

    export abstract class Subject {
        abstract Request() : void;
    }

}

class ASubject extends ProxyPattern.Subject {
    public Request() : void {
        console.log("Hello from proxy");
    }
}

class Proxy extends ProxyPattern.Subject {

    private ConcreteSubject: ProxyPattern.Subject = null;

    public Request() : void {
        if (this.ConcreteSubject === null) {
            this.ConcreteSubject = new ASubject(); 
        }

        this.ConcreteSubject.Request();
    }
}

var myProxy = new Proxy();
myProxy.Request();