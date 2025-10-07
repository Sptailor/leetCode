//by Suhail Tailor
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
            char leftChar=s.charAt(left);// Get character at left pointer
             char rightChar=s.charAt(right);// Get character at right pointer

             if(!Character.isLetterOrDigit(leftChar)){// Skip non-alphanumeric characters on the left
                left++;// Move left pointer to the right
                continue;

             }
             else if(!Character.isLetterOrDigit(rightChar)){// Skip non-alphanumeric characters on the right
                right--;// Move right pointer to the left
                continue;

             }
             if(Character.toLowerCase(leftChar)!=Character.toLowerCase(rightChar)){// Compare characters case-insensitively
               return false;// Return false if they don't match

             }
            left++;// Move left pointer to the right
            right--;// Move right pointer to the left

        } return true;
    }
}