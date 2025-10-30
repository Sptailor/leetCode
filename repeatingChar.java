
//Suhail Tailor
// Sliding window approach:
// Expand the window by moving `right` and count characters in a HashMap.
// Track the frequency of the most common character in the window (`maxCount`).
// If the window needs more than k replacements ((window size - maxCount) > k),
// shrink from the left until it's valid again.
// Keep track of the maximum valid window length (`maxLen`) and return it.

import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer>map=new HashMap<>();//map to store char counts

    
        int left=0;//left pointer
        int maxCount=0;//max frequency of a single char in current window
        int maxLen=0;//max length of valid window


          for(int right=0;right<s.length();right++){

            char c=s.charAt(right);//current char at right pointer
             map.put(c, map.getOrDefault(c, 0) + 1);//increment count of char c
              maxCount = Math.max(maxCount, map.get(c));//update maxCount


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