using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace strategy.Strategy
{
    public class Substraction : IStrategy
    {
        public decimal Calc(decimal val1, decimal val2)
        {
            return val1 - val2;
        }
    }
}