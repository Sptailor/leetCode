//By suhail Tailor

// Checks if an array contains any duplicate elements using a HashSet.
// Returns true upon finding a duplicate, otherwise false.
// Runs in O(n) time and O(n) space.

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer>set=new HashSet<>();

        for(int num:nums){

            if(set.contains(num)){

                return true;

            }

            set.add(num);

        }

        return false;
        
    }
}