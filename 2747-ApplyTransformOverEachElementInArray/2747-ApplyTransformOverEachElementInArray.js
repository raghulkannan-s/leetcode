// Last updated: 7/18/2025, 7:00:29 PM
/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let transformed = []
    let temp
    for (let i = 0; i<arr.length; i++){
        temp = fn(arr[i],i)
        transformed.push(temp)
    }
    return transformed
};