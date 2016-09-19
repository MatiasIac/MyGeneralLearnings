using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter.Interpreter
{
    public abstract class ExpressionBase
    {
        public string Syntax { get; set; }

        public abstract void Interpret(InterpreterContext context);
    }
}