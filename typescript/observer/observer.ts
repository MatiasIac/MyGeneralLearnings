namespace Observer {

    export abstract class ChatRoom {
        Users: Array<Observer.IUser>;
        RoomName: string;

        constructor(roomName: string) {
            this.Users = [];
            this.RoomName = roomName;
        }

        public SendMessage(sender: IUser, message: string) : void {
            this.Users.forEach(subscriber => {
                if (subscriber !== sender) {
                    subscriber.Update(sender, message);
                }
            });
        }

        public Add(subscriber: IUser) {
            this.Users.push(subscriber);
            subscriber.CurrentRoom = this;
        }

        public Remove(subscriber: IUser) {
            
        }
    } 

    export interface IUser {
        CurrentRoom: ChatRoom;
        Name: string;
        Update(user:IUser, message:string) : void;
        Chat() : void;
    }   
}

class Room extends Observer.ChatRoom {

    constructor(roomName: string) {
        super(roomName);
    }
}

class User implements Observer.IUser {

    CurrentRoom: Observer.ChatRoom;
    Name: string;

    constructor(userId: string) {
        this.Name = userId;
    }

    public Update(user: Observer.IUser, message: string) : void {
        console.log("User " + this.Name + " get the message '" + message + "' from user '" + user.Name + "'")
    }

    public Chat() {
        this.CurrentRoom.SendMessage(this, "Hi");
    }
}

var myRoom = new Room("Chat Room 1");
var user1 = new User("User 1");
var user2 = new User("User 2");
var user3 = new User("User 3");
var user4 = new User("User 4");

myRoom.Add(user1);
myRoom.Add(user2);
myRoom.Add(user3);
myRoom.Add(user4);

user3.Chat();


var myRoom2 = new Room("Chat Room 2");
var user5 = new User("User 5");
var user6 = new User("User 6");

myRoom2.Add(user5);
myRoom2.Add(user6);

user6.Chat();