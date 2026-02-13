/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {

if(s.length != t.length){
    return false;
}
const map={};

  for(let char of s){
    map[char]=(map[char]||0)+1;
  }

};