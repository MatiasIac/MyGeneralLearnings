var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var ChainOfResponsability;
(function (ChainOfResponsability) {
    var Chain = (function () {
        function Chain(nextElement) {
            this.NextElement = nextElement;
        }
        Chain.prototype.Next = function (data) {
            if (this.NextElement !== null) {
                this.NextElement.Process(data);
            }
        };
        return Chain;
    }());
    ChainOfResponsability.Chain = Chain;
})(ChainOfResponsability || (ChainOfResponsability = {}));
var Validator1 = (function (_super) {
    __extends(Validator1, _super);
    function Validator1() {
        _super.apply(this, arguments);
    }
    Validator1.prototype.Process = function (data) {
        if (data.length < 5) {
            console.log("Is too short");
            return;
        }
        _super.prototype.Next.call(this, data);
    };
    return Validator1;
}(ChainOfResponsability.Chain));
var Validator2 = (function (_super) {
    __extends(Validator2, _super);
    function Validator2() {
        _super.apply(this, arguments);
    }
    Validator2.prototype.Process = function (data) {
        if (data.length > 10) {
            console.log("Is too long");
            return;
        }
        _super.prototype.Next.call(this, data);
    };
    return Validator2;
}(ChainOfResponsability.Chain));
var v = new Validator1(new Validator2(null));
v.Process("try!");
