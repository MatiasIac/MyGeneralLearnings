var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var ProxyPattern;
(function (ProxyPattern) {
    var Subject = (function () {
        function Subject() {
        }
        return Subject;
    }());
    ProxyPattern.Subject = Subject;
})(ProxyPattern || (ProxyPattern = {}));
var ASubject = (function (_super) {
    __extends(ASubject, _super);
    function ASubject() {
        _super.apply(this, arguments);
    }
    ASubject.prototype.Request = function () {
        console.log("Hello from proxy");
    };
    return ASubject;
}(ProxyPattern.Subject));
var Proxy = (function (_super) {
    __extends(Proxy, _super);
    function Proxy() {
        _super.apply(this, arguments);
        this.ConcreteSubject = null;
    }
    Proxy.prototype.Request = function () {
        if (this.ConcreteSubject === null) {
            this.ConcreteSubject = new ASubject();
        }
        this.ConcreteSubject.Request();
    };
    return Proxy;
}(ProxyPattern.Subject));
var myProxy = new Proxy();
myProxy.Request();
