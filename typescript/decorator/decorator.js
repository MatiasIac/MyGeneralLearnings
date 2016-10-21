var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var DecoratorPattern;
(function (DecoratorPattern) {
    var Component = (function () {
        function Component() {
        }
        return Component;
    }());
    DecoratorPattern.Component = Component;
    var Decorator = (function (_super) {
        __extends(Decorator, _super);
        function Decorator() {
            _super.apply(this, arguments);
            this.component = null;
        }
        Decorator.prototype.SetComponent = function (component) {
            this.component = component;
        };
        Decorator.prototype.Operation = function () {
            if (this.component !== null) {
                this.component.Operation();
            }
        };
        return Decorator;
    }(Component));
    DecoratorPattern.Decorator = Decorator;
    var ConcreteComponent = (function (_super) {
        __extends(ConcreteComponent, _super);
        function ConcreteComponent() {
            _super.apply(this, arguments);
        }
        ConcreteComponent.prototype.Operation = function () {
            console.log("Concrete operation called");
        };
        return ConcreteComponent;
    }(Component));
    DecoratorPattern.ConcreteComponent = ConcreteComponent;
    var ConcreteDecorator1 = (function (_super) {
        __extends(ConcreteDecorator1, _super);
        function ConcreteDecorator1() {
            _super.apply(this, arguments);
        }
        ConcreteDecorator1.prototype.Operation = function () {
            _super.prototype.Operation.call(this);
            console.log("Decorator 1");
        };
        return ConcreteDecorator1;
    }(Decorator));
    DecoratorPattern.ConcreteDecorator1 = ConcreteDecorator1;
    var ConcreteDecorator2 = (function (_super) {
        __extends(ConcreteDecorator2, _super);
        function ConcreteDecorator2() {
            _super.apply(this, arguments);
        }
        ConcreteDecorator2.prototype.Operation = function () {
            _super.prototype.Operation.call(this);
            console.log("Decorator 2");
        };
        return ConcreteDecorator2;
    }(Decorator));
    DecoratorPattern.ConcreteDecorator2 = ConcreteDecorator2;
})(DecoratorPattern || (DecoratorPattern = {}));
var comp = new DecoratorPattern.ConcreteComponent();
var dec = new DecoratorPattern.ConcreteDecorator1();
var dec2 = new DecoratorPattern.ConcreteDecorator2();
dec.SetComponent(comp);
dec2.SetComponent(dec);
dec2.Operation();
