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
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (int key : map.keySet()) {
        if (map.get(key) > targetCount) {
        return key;
         }
         }
return -1;
    
}}