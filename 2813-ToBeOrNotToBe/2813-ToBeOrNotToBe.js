// Last updated: 7/18/2025, 7:00:25 PM
/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val) {
        let obj = {
        toBe: function(anotherVal){
            if(val ===  anotherVal){
                return true
            }else{
                throw new Error("Not Equal")
            }
        },
        notToBe: function(andAnotherVal){
            if(val !==  andAnotherVal){
                return true
            }else{
                throw new Error("Equal")
            }
        }
        }
    
        return obj

};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */