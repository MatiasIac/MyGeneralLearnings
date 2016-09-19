namespace Interpreter {

    export class Context {
        expression: string;
        mathResult: number;
        isEquationCorrect: boolean;
    }

    export abstract class ExpressionBase {
        constructor(protected syntax: string) { }
        abstract interpret(context: Context) : void;
    }

    export class SumExpression extends ExpressionBase {
        constructor() {
            super('+');
        }

        interpret(context: Context) : void {
            if (context.expression.indexOf(' + ') < 0) {
                throw "Incorrect syntax near +";
            }

            let data = context.expression.split(' + ');

            if (data.length !== 2) {
                throw "Right part not found";
            }

            let left = (<any>data[0]) * 1;
            let right = (<any>data[1].substr(0, data[1].indexOf(' '))) * 1;

            context.mathResult = left + right;
        }
    }

    export class EqualExpression extends ExpressionBase {
        constructor() {
            super('=');
        }

        interpret(context: Context) : void {
            if (context.expression.indexOf(' = ') < 0) {
                throw "Incorrect syntax near =";
            }

            let data = context.expression.split(' = ');

            if (data.length !== 2) {
                throw "Right part not found";
            }

            context.isEquationCorrect = context.mathResult === (<any>data[1] * 1);
        }
    }
}

let tree = Array<Interpreter.ExpressionBase>();
tree.push(new Interpreter.SumExpression());
tree.push(new Interpreter.EqualExpression());

let context = new Interpreter.Context();
context.expression = "10 + 20 = 30";

for (let element of tree) {
    element.interpret(context);
}

console.log(context.mathResult);
console.log(context.isEquationCorrect);