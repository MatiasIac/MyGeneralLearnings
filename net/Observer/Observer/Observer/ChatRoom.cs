using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Observer.Observer
{
    public abstract class ChatRoom
    {
        private List<IUser> Users;
        private string RoomName;

        public ChatRoom(string roomName)
        {
            Users = new List<IUser>();
            this.RoomName = roomName;
        }

        public void SendMessage(IUser sender, string message)
        {
            foreach (var user in Users)
            {
                if (user != sender)
                {
                    user.Update(sender, message);
                }
            }
        }

        public void Add(IUser user)
        {
            Users.Add(user);
            user.CurrentRoom = this;
        }

        public void Remove(IUser user)
        {
            Users.Remove(user);
        }
    }
}