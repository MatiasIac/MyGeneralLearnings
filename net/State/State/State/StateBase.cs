using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace State.State
{
    abstract class StateBase
    {
        public abstract void Handle(Context context);

        public abstract void DoSomething();
    }
}