using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace State.State
{

    class ConcreteB : StateBase
    {
        public override void DoSomething()
        {
            Console.WriteLine("Concrete B");
        }

        public override void Handle(Context context)
        {
            context.State = new ConcreteA();
        }
    }
}