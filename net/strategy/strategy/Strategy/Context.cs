using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace strategy.Strategy
{
    public class Context
    {
        private IStrategy current;

        public Context()
        {
        }

        public void SetOperation(IStrategy operation)
        {
            current = operation;
        }

        public decimal Calc(decimal val1, decimal val2)
        {
            return current.Calc(val1, val2);
        }
    }
}