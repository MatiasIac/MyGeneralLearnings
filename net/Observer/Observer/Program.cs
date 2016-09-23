using Observer.Observer;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer
{
    class Program
    {
        static void Main(string[] args)
        {
            var room = new Room1();

            var user1 = new User("User 1");
            var user2 = new User("User 2");
            var user3 = new User("User 3");
            var user4 = new User("User 4");

            room.Add(user1);
            room.Add(user2);
            room.Add(user3);
            room.Add(user4);

            user2.Chat();

            Console.ReadLine();
        }
    }
}
