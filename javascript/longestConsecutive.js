/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {

    const map= new Set();

    for( let num of nums){
        map.add(num);
        if(map.has(num-1)){
            start=num;
        }
    }

};