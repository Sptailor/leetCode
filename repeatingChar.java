
//Suhail Tailor
// Sliding window approach:
// Expand the window by moving `right` and count characters in a HashMap.
// Track the frequency of the most common character in the window (`maxCount`).
// If the window needs more than k replacements ((window size - maxCount) > k),
// shrink from the left until it's valid again.
// Keep track of the maximum valid window length (`maxLen`) and return it.

class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer>map=new HashMap<>();

    
        int left=0;
        int maxCount=0;
        int maxLen=0;


          for(int right=0;right<s.length();right++){

            char c=s.charAt(right);
             map.put(c, map.getOrDefault(c, 0) + 1);
              maxCount = Math.max(maxCount, map.get(c));

          while ((right - left + 1) - maxCount > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);


        }
     return maxLen;

    }
}