import java.util.Stack;

public class temperatures {
    
// This solution uses a monotonic stack to solve the "Daily Temperatures" problem in O(n) time.
// We maintain a stack of indices where temperatures are not yet resolved (waiting for a warmer day).
// As we iterate through the array, whenever the current temperature is warmer than the temperature
// at the index on top of the stack, we pop that index and calculate how many days it took to find
// a warmer temperature (currentIndex - prevIndex). Each index is pushed and popped at most once,
// ensuring linear time complexity.

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

       Stack<Integer> stack = new Stack<>();
       int[] result = new int[temperatures.length];

       for(int i=0;i<temperatures.length;i++){
        while(!stack.isEmpty()&& temperatures[i] > temperatures[stack.peek()] ){
             int prevIndex = stack.pop();
             result[prevIndex] = i - prevIndex;
        }
        stack.push(i);

       }
       return result;

        
    }
}
}
