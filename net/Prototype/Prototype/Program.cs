using Prototype.Prototype;
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prototype
{
    class Program
    {
        static void Main(string[] args)
        {
            var color1 = new ClonableColor();
            color1.ThisColor = Color.FromArgb(100, 100, 100);
            
            var color2 = color1.Clone() as ClonableColor;

            Console.WriteLine("Data from cloned: " + color2.ThisColor.ToString());

            color2.ThisColor = Color.FloralWhite;

            Console.ReadLine();
        }
    }
}
