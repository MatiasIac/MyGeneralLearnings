var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var Observer;
(function (Observer) {
    var ChatRoom = (function () {
        function ChatRoom(roomName) {
            this.Users = [];
            this.RoomName = roomName;
        }
        ChatRoom.prototype.SendMessage = function (sender, message) {
            this.Users.forEach(function (subscriber) {
                if (subscriber !== sender) {
                    subscriber.Update(sender, message);
                }
            });
        };
        ChatRoom.prototype.Add = function (subscriber) {
            this.Users.push(subscriber);
            subscriber.CurrentRoom = this;
        };
        ChatRoom.prototype.Remove = function (subscriber) {
        };
        return ChatRoom;
    }());
    Observer.ChatRoom = ChatRoom;
})(Observer || (Observer = {}));
var Room = (function (_super) {
    __extends(Room, _super);
    function Room(roomName) {
        _super.call(this, roomName);
    }
    return Room;
}(Observer.ChatRoom));
var User = (function () {
    function User(userId) {
        this.Name = userId;
    }
    User.prototype.Update = function (user, message) {
        console.log("User " + this.Name + " get the message '" + message + "' from user '" + user.Name + "'");
    };
    User.prototype.Chat = function () {
        this.CurrentRoom.SendMessage(this, "Hi");
    };
    return User;
}());
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
