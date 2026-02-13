

// This solution uses a stack to validate balanced parentheses.
// Every time an opening bracket is found, it is pushed onto the stack.
// For each closing bracket, we check if it matches the top of the stack.
// If it matches, we pop it; otherwise the string is invalid.
// At the end, the stack must be empty for the string to be valid.

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack <Character>stack=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='['||c=='('||c=='{'){
                stack.push(c);

            }
            else if(!stack.isEmpty()){
              if ((c == ')' && stack.peek() == '(') ||
               (c == ']' && stack.peek() == '[') ||
               (c == '}' && stack.peek() == '{')) {
               stack.pop();
            } else {
              return false;
}

            }
            else{
                return false;
            }
        }
        return stack.isEmpty();

}
}






