using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainConsole.Chain
{
    public class ByOneCapital : ChainBase
    {

        public override void Process(string data)
        {
            for (var i = 0 ; i < data.Length; i++)
            {
                if (char.IsUpper(data[i]))
                {
                    base.MoveOn(data);
                    return;
                }
            }

            throw new Exception("No capital letters");            
        }
    }
}
