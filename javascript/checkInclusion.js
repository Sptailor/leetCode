/**
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
var checkInclusion = function(s1, s2) {

    if (s1.length > s2.length) return false;

    const map1 = new Map();

    for (let char of s1) {
        map1.set(char, (map1.get(char) || 0) + 1);
    }

    let left = 0;
    let windowMap = new Map();

    for (let right = 0; right < s2.length; right++) {

        let currChar = s2[right];
        windowMap.set(currChar, (windowMap.get(currChar) || 0) + 1);

        if ((right - left + 1) > s1.length) {
            let leftChar = s2[left];

            windowMap.set(leftChar, windowMap.get(leftChar) - 1);
        }
    }






};
