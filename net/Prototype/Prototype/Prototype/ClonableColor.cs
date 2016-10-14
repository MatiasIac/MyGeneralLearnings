using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prototype.Prototype
{
    public class ClonableColor : Prototype
    {
        public Color ThisColor { get; set; }

        public override Prototype Clone()
        {
            return this.MemberwiseClone() as ClonableColor;
        }

    }
}