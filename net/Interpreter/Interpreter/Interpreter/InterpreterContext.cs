using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interpreter.Interpreter
{
    public class InterpreterContext
    {
        public string Expression { get; set; }

        public float mathResult { get; set; }
        public bool isEquationCorrect { get; set; }
    }
}
