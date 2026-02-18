/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function (nums) {
  const map = new Set();
  let start = 0;
  let max = 0;
  let length = 0;

  for (let num of nums) {
    map.add(num);
  }
  for (let num of map) {
    if (!map.has(num - 1)) {
      start = num;
      length = 1;
      for (let i = num; map.has(i + 1); i++) {
        length++;
      }
      if (length > max) {
        max = length;
      }
    }
  }
  return max;
};
