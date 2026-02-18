/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function (nums) {
  // Set to store all numbers for O(1) lookup
  const map = new Set();
  let start = 0;
  let max = 0;
  let length = 0;

  // Add all numbers to the Set
  for (let num of nums) {
    map.add(num);
  }

  // Iterate through each number in the Set
  for (let num of map) {
    // Only start counting if num is the start of a sequence
    if (!map.has(num - 1)) {
      start = num;
      length = 1;
      // Count consecutive numbers
      for (let i = num; map.has(i + 1); i++) {
        length++;
      }
      // Update max if current sequence is longer
      if (length > max) {
        max = length;
      }
    }
  }
  return max;
};
