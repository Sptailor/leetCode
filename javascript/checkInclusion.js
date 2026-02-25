/**
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
var checkInclusion = function(s1, s2) {

    if (s1.length > s2.length) return false;

    const map1 = new Map();

    for (let char of s1) {
        map1.set(char,(map1.get(char)||0)+1);
    }

    let left=0;
    let map2=map1;

    for(let right=0;(right-left)<s1.length;right++){
        let currChar=s2[right];

    }






};
