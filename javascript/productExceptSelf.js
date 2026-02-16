/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {

const prefix=Array(nums.length).fill(1);
const post=Array(nums.length).fill(1);

const product=[];

let total=1;

for(let i=0;i<nums.length;i++){
    total=total*nums[i];
    prefix[i]=total;
}
total=1;
for(let i=nums.length-1;i>0;i--){
    total=total*nums[i];
    post[i]=total;
}

};