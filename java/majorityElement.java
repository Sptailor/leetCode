//Suhail Tailor
// Counts the frequency of each element using a HashMap.
// Finds and returns the element that appears more than n/2 times.
// Runs in O(n) time and O(n) space.

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int targetCount=nums.length/2;// Calculate the threshold for majority

        HashMap<Integer,Integer>map=new HashMap<>();// Map to store frequency of each element

        for(int num: nums){// Populate the frequency map
            map.put(num,map.getOrDefault(num,0)+1);// Increment count for each occurrence
        }

        for (int key : map.keySet()) {// Check for the majority element
        if (map.get(key) > targetCount) {// If count exceeds n/2, return the element
        return key;// Return the majority element
         }
         }
return -1;// Return -1 if no majority element is found (theoretically unreachable)
    
}}