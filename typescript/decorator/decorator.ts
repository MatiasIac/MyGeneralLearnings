namespace DecoratorPattern {

    export abstract class Component {
        abstract Operation() : void;
    }

    export abstract class Decorator extends Component {
        private component : Component = null;

        public SetComponent(component : Component) : void {
            this.component = component;
        }

        public Operation() : void {
            if (this.component !== null) {
                this.component.Operation();
            }
        }
    }

    export class ConcreteComponent extends Component {

        public Operation() : void {
            console.log("Concrete operation called");
        }
    }

    export class ConcreteDecorator1 extends Decorator {
        
        public Operation() : void {
            super.Operation();
            console.log("Decorator 1");
        }
    }

    export class ConcreteDecorator2 extends Decorator {
        
        public Operation() : void {
            super.Operation();
            console.log("Decorator 2");
        }
    }
}

var comp = new DecoratorPattern.ConcreteComponent();
var dec = new DecoratorPattern.ConcreteDecorator1();
var dec2 = new DecoratorPattern.ConcreteDecorator2();

dec.SetComponent(comp);
dec2.SetComponent(dec);

dec2.Operation();