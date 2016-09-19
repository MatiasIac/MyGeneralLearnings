using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter.Interpreter
{
    public class SumExpression : ExpressionBase
    {
        public SumExpression()
        {
            base.Syntax = "+";
        }

        public override void Interpret(InterpreterContext context)
        {
            if (!context.Expression.Contains(" + "))
                throw new Exception("Incorrect syntax near +");

            var data = context.Expression
                .Split(new string[] { " + " },
                    StringSplitOptions.RemoveEmptyEntries);

            if (data.Length != 2)
                throw new Exception("Right part not found");

            var left = float.Parse(data[0]);
            var right = float.Parse(data[1].Substring(0, data[1].IndexOf(' ')));

            context.mathResult = left + right;
        }
    }
}