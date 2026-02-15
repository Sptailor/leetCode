/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {

    const map={};
    const result=[];

    for(const num of nums){
        map[num]=(map[num]||0)+1;
    }
    const buckets=Array(nums.length+1).fill().map(()=>[]);

    for(const num in map){
        const freq = map[num];
        buckets[freq].push(Number(num));

    }

};