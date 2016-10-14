using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace strategy.Strategy
{
    public class Division : IStrategy
    {
        public decimal Calc(decimal val1, decimal val2)
        {
            if (val2 == 0) return 0;

            return val1 / val2;
        }
    }
}