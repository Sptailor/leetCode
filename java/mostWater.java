//Suhail Tailor
// Finds the maximum water container area in an array of heights.
// Uses the two-pointer approach, starting at both ends of the array.
// Moves the pointer with the smaller height inward each step.
// Returns the largest area calculated between any two lines.

class Solution {
    public int maxArea(int[] height) {// Function to calculate the maximum area of water container
        int left=0;// Left pointer starts at the beginning of the array
        int right=height.length-1;// Right pointer starts at the end of the array
        int maxArea=0;// Variable to keep track of the maximum area found

        while(left<right){
            int leftBar=height[left];// Height of the left bar
            int rightBar=height[right];// Height of the right bar
            int currArea=0;// Variable to store the current area

           if(leftBar>rightBar){// Move the right pointer if the right bar is shorter
            currArea=rightBar *(right-left);// Calculate area using the shorter bar
            right--;

           }else{
             currArea=leftBar *(right-left);// Calculate area using the shorter bar
             left++;
           }
           maxArea=Math.max(maxArea,currArea);// Update maxArea if the current area is larger
        }
        return maxArea;// Return the maximum area found

    }
}