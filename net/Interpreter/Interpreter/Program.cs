using Interpreter.Interpreter;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter
{
    class Program
    {
        static void Main(string[] args)
        {
            var tree = new List<ExpressionBase>();
            tree.Add(new SumExpression());
            tree.Add(new EqualExpression());

            var context = new InterpreterContext
            {
                Expression = "10 + 20 = 30"
            };

            foreach (var expression in tree)
            {
                expression.Interpret(context);
            }

            Console.WriteLine(context.mathResult);
            Console.WriteLine(context.isEquationCorrect);

            Console.ReadLine();
        }
    }
}