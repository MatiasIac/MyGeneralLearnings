using State.State;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace State
{
    class Program
    {
        static void Main(string[] args)
        {

            var state = new Context(new ConcreteA());
            state.State.DoSomething();

            state.Request();
            state.State.DoSomething();

            state.Request();
            state.State.DoSomething();

            state.Request();
            state.State.DoSomething();

            Console.ReadLine();
        }
    }
}
