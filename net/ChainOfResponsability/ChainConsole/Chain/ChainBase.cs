using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainConsole.Chain
{
    public abstract class ChainBase
    {
        private bool HasNext
        {
            get
            {
                return Next != null;
            }
        }

        public ChainBase Next { get; set; }

        internal void MoveOn(string data)
        {
            if (HasNext)
                Next.Process(data);
        }

        public abstract void Process(string data);
    }
}