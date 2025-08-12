// LeetCode: Valid Palindrome
// This solution uses two pointers starting from the beginning and end of the string.
// It skips non-alphanumeric characters and compares characters case-insensitively.
// If any mismatch is found, it returns false; otherwise, true when pointers cross.
// Time Complexity: O(n), Space Complexity: O(1).

class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<=right){
            char leftChar=s.charAt(left);
             char rightChar=s.charAt(right);

             if(!Character.isLetterOrDigit(leftChar)){
                left++;
                continue;

             }
             else if(!Character.isLetterOrDigit(rightChar)){
                right--;
                continue;

             }
             if(Character.toLowerCase(leftChar)!=Character.toLowerCase(rightChar)){
               return false;

             }
            left++;
            right--;

        } return true;
    }
}