//Suhail Tailor

import java.util.HashSet;

/**
 * Uses a HashSet to find the longest streak of consecutive numbers.
 * Only starts counting when a number is the beginning of a sequence,
 * then expands forward to count its length. 
 * Runs in O(n) time.
 */

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet();//set to store unique numbers
        int longest=0;//variable to track longest streak
        for(int num:nums){//populate set with unique numbers
            set.add(num);//add to set
        }
        for(int num: set){//loop over set
            if(!set.contains(num-1)){//only start counting if num is the start of a sequence
                int curr=num;
                int streak=1;
                while(set.contains(curr+1)){//expand forward to count length of sequence
                    streak++;
                    curr++;
                }
                longest=Math.max(longest,streak);
            }
        }
        return longest;
    }
}