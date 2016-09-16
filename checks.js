module.exports = (function () {

    /*
        string > 3 length
        string > 15 length
        string contains a number
        string contains a upercase
        string not contains a special characters
    */

    var chain = function () {

    	this.next = null;

        this.goNext = function (str) {
            if (this.next !== null) {
                return this.next.validate(str);
            }
        };

    };

    var checkUpperBound = function () {
        this.validate = function (str) {
            return str.length > 15 ? "Max length line (above 15)" : this.goNext(str);
        };
    };

    var checkLowerBound = function () {
        this.validate = function (str) {
            return str.length < 3  ? "Min length line (Below 3)" : this.goNext(str);
        };
    };

    var checkNumber = function () {
        this.validate = function (str) {
            return str.match(/[0-9]/gi) ? this.goNext(str) : "Not contains a number";
        };
    };

    checkLowerBound.prototype = new chain();
    checkUpperBound.prototype = new chain();
    checkNumber.prototype = new chain();

    return {
        checkUpperBound: checkUpperBound,
        checkLowerBound: checkLowerBound,
        checkNumber: checkNumber
    };

})();
