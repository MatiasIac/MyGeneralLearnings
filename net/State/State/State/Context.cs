using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace State.State
{
    class Context
    {

        public Context(StateBase state)
        {
            State = state;
        }

        public StateBase State { get; set; }

        public void Request()
        {
            State.Handle(this);
        }
    }
}