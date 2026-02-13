//By Suhail Tailor
// Checks if a string can become a palindrome by removing at most one character.
// Uses two pointers from both ends to compare characters.
// On a mismatch, tries skipping either the left or right character and checks if the rest is a palindrome.
// Returns true if the string is already a palindrome or can become one after removing one character.

class Solution {
    public boolean validPalindrome(String s) {
        int left=0;// Left pointer starts at the beginning of the string
        int right=s.length()-1;// Right pointer starts at the end of the string

        while(left<right){
            if(s.charAt(left)!= s.charAt(right)){// On mismatch, try skipping either character
              
                return isPalindrome( left + 1, right,s) || isPalindrome(left, right - 1,s);// Check if skipping left or right character results in a palindrome
            }
            left++;// Move left pointer to the right
            right--;// Move right pointer to the left

        }
        return true;// Return true if the entire string is a palindrome

    }
    public boolean isPalindrome(int left, int right, String s){// Helper function to check if a substring is a palindrome
    
        while(left<right){// Compare characters from both ends of the substring
        char leftChar=s.charAt(left);// Get character at left pointer
        char rightChar=s.charAt(right);// Get character at right pointer
            if(leftChar!=rightChar){// If characters don't match, it's not a palindrome
                return false;// Return false if a mismatch is found
            }
            else{
                left++;// Move left pointer to the right
                right--;// Move right pointer to the left
            }
        }
        return true;// Return true if the substring is a palindrome

    }
}







