var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var Interpreter;
(function (Interpreter) {
    var Context = (function () {
        function Context() {
        }
        return Context;
    }());
    Interpreter.Context = Context;
    var ExpressionBase = (function () {
        function ExpressionBase(syntax) {
            this.syntax = syntax;
        }
        return ExpressionBase;
    }());
    Interpreter.ExpressionBase = ExpressionBase;
    var SumExpression = (function (_super) {
        __extends(SumExpression, _super);
        function SumExpression() {
            _super.call(this, '+');
        }
        SumExpression.prototype.interpret = function (context) {
            if (context.expression.indexOf(' + ') < 0) {
                throw "Incorrect syntax near +";
            }
            var data = context.expression.split(' + ');
            if (data.length !== 2) {
                throw "Right part not found";
            }
            var left = data[0] * 1;
            var right = data[1].substr(0, data[1].indexOf(' ')) * 1;
            context.mathResult = left + right;
        };
        return SumExpression;
    }(ExpressionBase));
    Interpreter.SumExpression = SumExpression;
    var EqualExpression = (function (_super) {
        __extends(EqualExpression, _super);
        function EqualExpression() {
            _super.call(this, '=');
        }
        EqualExpression.prototype.interpret = function (context) {
            if (context.expression.indexOf(' = ') < 0) {
                throw "Incorrect syntax near =";
            }
            var data = context.expression.split(' = ');
            if (data.length !== 2) {
                throw "Right part not found";
            }
            context.isEquationCorrect = context.mathResult === (data[1] * 1);
        };
        return EqualExpression;
    }(ExpressionBase));
    Interpreter.EqualExpression = EqualExpression;
})(Interpreter || (Interpreter = {}));
var tree = Array();
tree.push(new Interpreter.SumExpression());
tree.push(new Interpreter.EqualExpression());
var context = new Interpreter.Context();
context.expression = "10 + 20 = 30";
for (var _i = 0, tree_1 = tree; _i < tree_1.length; _i++) {
    var element = tree_1[_i];
    element.interpret(context);
}
console.log(context.mathResult);
console.log(context.isEquationCorrect);
