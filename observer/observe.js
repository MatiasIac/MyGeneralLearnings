module.exports = (function () {

    var _ = require('underscore');

    var observer = function () {
        this.observerList = [];
    };

    observer.prototype = {
        add: function (obj) {
            this.observerList.push(obj);
            console.log(this.observerList);
        },
        delete: function (obj) {
            this.observerList = _.without(
                this.observerList,
                this.find(obj)
            );
        },
        find: function (obj) {
            return _.findWhere(
                this.observerList,
                obj
            );
        },
        log: function () {
            console.log(this.observerList);
        }
    };

    var observe = new observer();

    return {
        observe: observe
    };

})();
