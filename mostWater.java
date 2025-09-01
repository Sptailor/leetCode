//Suhail Tailor
// Finds the maximum water container area in an array of heights.
// Uses the two-pointer approach, starting at both ends of the array.
// Moves the pointer with the smaller height inward each step.
// Returns the largest area calculated between any two lines.

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;

        while(left<right){
            int leftBar=height[left];
            int rightBar=height[right];
            int currArea=0;

           if(leftBar>rightBar){
            currArea=rightBar *(right-left);
            right--;

           }else{
             currArea=leftBar *(right-left);
             left++;
           }
           maxArea=Math.max(maxArea,currArea);
        }
        return maxArea;

    }
}