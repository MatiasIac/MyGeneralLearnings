using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace State.State
{

    class ConcreteA : StateBase
    {
        public override void DoSomething()
        {
            Console.WriteLine("Concrete A");
        }

        public override void Handle(Context context)
        {
            context.State = new ConcreteB();
        }
    }

}