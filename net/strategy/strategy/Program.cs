using strategy.Strategy;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace strategy
{
    class Program
    {
        static void Main(string[] args)
        {
            var context = new Context();

            context.SetOperation(new Addition());
            Console.WriteLine(context.Calc(10, 20));

            context.SetOperation(new Substraction());
            Console.WriteLine(context.Calc(10, 20));

            context.SetOperation(new Division());
            Console.WriteLine(context.Calc(15, 10));

            Console.ReadLine();
        }
    }
}