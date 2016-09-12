using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainConsole.Chain
{
    public class ByShort : ChainBase
    {
        public override void Process(string data)
        {
            if (data.Length > 15)
                throw new Exception("To long");

            base.MoveOn(data);
        }
    }
}