module.exports = (function () {

    var observer = function () {
        this.observerList = [];
    };

    observer.prototype.add = function (obj) {
        this.observerList.push(obj);
    };

    observer.prototype.log = function () {
        console.log(this.observerList);
    };

    var observe = new observer();

    return {
        observe: observe
    };

})();
