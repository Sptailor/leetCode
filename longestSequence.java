//Suhail Tailor
/**
 * Uses a HashSet to find the longest streak of consecutive numbers.
 * Only starts counting when a number is the beginning of a sequence,
 * then expands forward to count its length. 
 * Runs in O(n) time.
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet();
        int longest=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num: set){
            if(!set.contains(num-1)){
                int curr=num;
                int streak=1;
                while(set.contains(curr+1)){
                    streak++;
                    curr++;
                }
                longest=Math.max(longest,streak);
            }
        }
        return longest;
    }
}