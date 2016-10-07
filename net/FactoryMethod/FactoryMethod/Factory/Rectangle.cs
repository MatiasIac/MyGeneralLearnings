using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryMethod.Factory
{
    public class Rectangle : DrawingType
    {
        public override void Draw()
        {
            Console.WriteLine("Rectangle");
        }
    }
}