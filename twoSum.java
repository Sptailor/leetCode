
// LeetCode: Two Sum
// This solution uses a HashMap to store visited numbers and their indices.
// For each number, it calculates the complement (target - current number)
// and checks if the complement is already in the map. If found, returns the
// pair of indices; otherwise, stores the current number in the map.
// Time Complexity: O(n), Space Complexity: O(n).

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();      
       
        for(int i=0;i<nums.length;i++){ 
            int complement=target-nums[i];
            if(!map.containsKey(complement)){
                  map.put(nums[i],i);
            }
            else{
                return new int [] {map.get(complement),i};
            }
        }
        return new int []{0,0};
        
    }
}
