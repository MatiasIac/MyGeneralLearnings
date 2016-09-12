using ChainConsole.Chain;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ChainConsole
{
    class Program
    {
        static void Main(string[] args)
        {

            try
            {
                var a = new ByShort();
                var b = new ByLong();
                var c = new ByOneCapital();
                a.Next = c;
                c.Next = b;

                a.Process("Estaaaa!");

                new ByShort
                {
                    Next = new ByLong
                    {
                        Next = new ByOneCapital()
                    }
                }.Process("test");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

            Console.ReadLine();
        }
    }
}