  import java.util.HashSet;

public class longestSubstring {
    /**
     * LeetCode #3: Longest Substring Without Repeating Characters
     * Uses sliding window technique to find the longest substring without duplicates.
     * @param s the input string
     * @return length of the longest substring without repeating characters
     */
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        HashSet<Character>set=new HashSet<>();
        int longest=0;

        for(int right=left;right<s.length();right++)
        {
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));

            longest=Math.max((right-left)+1,longest);
        }
        return longest;
    }
}