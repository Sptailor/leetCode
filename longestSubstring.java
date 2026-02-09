  import java.util.HashSet;

public class longestSubstring {
    /**
     * LeetCode #3: Longest Substring Without Repeating Characters
     * Uses sliding window technique to find the longest substring without duplicates.
     * @param s the input string
     * @return length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        // Left pointer of the sliding window
        int left=0;
        // Set to track characters in current window
        HashSet<Character>set=new HashSet<>();
        // Track the maximum length found
        int longest=0;

        // Expand window by moving right pointer
        for(int right=left;right<s.length();right++)
        {
            // Shrink window from left until no duplicate exists
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            // Add current character to the window
            set.add(s.charAt(right));

            // Update max length if current window is larger
            longest=Math.max((right-left)+1,longest);
        }
        return longest;
    }
}