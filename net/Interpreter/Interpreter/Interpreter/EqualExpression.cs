using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter.Interpreter
{
    public class EqualExpression : ExpressionBase
    {
        public EqualExpression()
        {
            base.Syntax = "=";
        }

        public override void Interpret(InterpreterContext context)
        {
            if (!context.Expression.Contains(" = "))
                throw new Exception("Incorrect syntax near =");

            var data = context.Expression
                .Split(new string[] { " = " }, 
                    StringSplitOptions.RemoveEmptyEntries);

            if (data.Length != 2)
                throw new Exception("Right part not found");

            context.isEquationCorrect = context.mathResult == float.Parse(data[1]);
        }
    }
}
