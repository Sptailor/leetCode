/**
 * @param {string} s1
 * @param {string} s2
 * @return {boolean}
 */
var checkInclusion = function(s1, s2) {

    if (s1.length > s2.length) return false;

    const s1Map = new Map();

    for (let char of s1) {
        map1.set(char, (map1.get(char) || 0) + 1);
    }

    let left = 0;
    let windowMap = new Map();

    for (let right = 0; right < s2.length; right++) {

        let rightChar = s2[right];
        windowMap.set(rightChar, (windowMap.get(rightChar) || 0) + 1);

        if ((right - left) + 1 > s1.length) {
            let leftChar = s2[left];

            windowMap.set(leftChar, windowMap.get(leftChar) - 1);

            if (windowMap.get(leftChar) === 0) {
                windowMap.delete(leftChar);
            }

            left++;
        }

        if ((right - left) + 1 === s1.length) {
            if (mapsAreEqual(s1Map, windowMap)) return true;
        }
    }

    return false;
};

function mapsAreEqual(m1, m2) {
    if (m1.size !== m2.size) return false;

    for (let [key, val] of m1) {
        if (m2.get(key) !== val) return false;
    }

    return true;
}
