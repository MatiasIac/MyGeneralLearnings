using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer.Observer
{
    public class User : IUser
    {
        public string Name { get; set; }

        public ChatRoom CurrentRoom { get; set; }

        public User(string name)
        {
            this.Name = name;
        }

        public void Update(IUser user, string message)
        {
            Console.WriteLine(String.Format("User {0} get message '{1}' from user '{2}'",
                this.Name, message, user.Name));
        }

        public void Chat()
        {
            CurrentRoom.SendMessage(this, "Hola");
        }
    }
}
