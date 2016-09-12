using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainConsole.Chain
{
    public class ByLong : ChainBase
    {

        public override void Process(string data)
        {
            if (data.Length < 4)
                throw new Exception("To short");

            base.MoveOn(data);
        }
    }
}
