
// Checks if a string can become a palindrome by removing at most one character.
// Uses two pointers from both ends to compare characters.
// On a mismatch, tries skipping either the left or right character and checks if the rest is a palindrome.
// Returns true if the string is already a palindrome or can become one after removing one character.

class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        
        while(left<right){
            if(s.charAt(left)!= s.charAt(right)){
              
                return isPalindrome( left + 1, right,s) || isPalindrome(left, right - 1,s);
            }
            left++;
            right--;

        }
        return true;

    }
    public boolean isPalindrome(int left, int right, String s){
    
        while(left<right){
        char leftChar=s.charAt(left);
        char rightChar=s.charAt(right);
            if(leftChar!=rightChar){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;

    }
}







