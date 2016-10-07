using FactoryMethod.Factory;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactoryMethod
{
    class Program
    {
        static void Main(string[] args)
        {
            var factory = new Factory.Factory();
            
            var circle = factory.Create<Circle>();
            circle.Draw();

            var triangle = factory.Create<Triangle>();
            triangle.Draw();

            Console.ReadLine();
        }
    }
}