using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryMethod.Factory
{
    public class Factory
    {
        public DrawingType Create<T>()
            where T : DrawingType, new()
        {
            return new T();
        }
    }
}