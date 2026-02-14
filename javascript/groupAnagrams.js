/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    const map=new Map();
    const result=[];


    for(const str of strs){
        const sorted=str.split('').sort().join('');
        if(!map.has(sorted)){
            map.set(sorted,[str]);
        }
        else{
            map.get(sorted).push(str);
        }
    }

};