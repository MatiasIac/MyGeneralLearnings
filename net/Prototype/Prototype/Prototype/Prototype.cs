using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prototype.Prototype
{
    public abstract class Prototype
    {
        public Prototype()
        { }

        public abstract Prototype Clone();
    }
}