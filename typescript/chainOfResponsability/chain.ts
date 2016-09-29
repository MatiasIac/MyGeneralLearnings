namespace ChainOfResponsability {

    export abstract class Chain {
        
        NextElement: Chain;

        constructor(nextElement: Chain) {
            this.NextElement = nextElement;
        }

        abstract Process(data: string) : void;

        public Next(data: string) : void {
            if (this.NextElement !== null) {
                this.NextElement.Process(data);
            }
        }
    }
}

class Validator1 extends ChainOfResponsability.Chain {

    public Process(data: string) : void {
        if (data.length < 5) {
            console.log("Is too short");
            return;
        }

        super.Next(data);
    }
}

class Validator2 extends ChainOfResponsability.Chain {

    public Process(data: string) : void {
        if (data.length > 10) {
            console.log("Is too long");
            return;
        }

        super.Next(data);
    }
}

var v = new Validator1(new Validator2(null));
v.Process("try!");