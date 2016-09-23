using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer.Observer
{
    public interface IUser
    {
        ChatRoom CurrentRoom { get; set; }

        string Name { get; set; }

        void Update(IUser user, string message);

        void Chat();
    }
}