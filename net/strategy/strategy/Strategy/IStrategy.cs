using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace strategy.Strategy
{
    public interface IStrategy
    {
        decimal Calc(decimal val1, decimal val2);
    }
}