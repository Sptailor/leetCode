
// This solution performs a modified binary search on a rotated sorted array.
// At each step, we determine which half (left or right) is sorted, then check 
// if the target lies within that half. If it does, we adjust the search bounds 
// to that half; otherwise, we search the other half. This guarantees O(log n) time.


class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]==target)return mid;

            else if(nums[left]<=nums[mid]){
             if(nums[left]<=target && target<=nums[mid]){
                right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else if(nums[mid]<=nums[right]){
                if(nums[mid]<=target && target<=nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }



        }
        return -1;

}
}











