import java.util.Stack;

public class temperatures {
    
// This solution uses a monotonic stack to solve the "Daily Temperatures" problem in O(n) time.
// We maintain a stack of indices where temperatures are not yet resolved (waiting for a warmer day).
// As we iterate through the array, whenever the current temperature is warmer than the temperature
// at the index on top of the stack, we pop that index and calculate how many days it took to find
// a warmer temperature (currentIndex - prevIndex). Each index is pushed and popped at most once,
// ensuring linear time complexity.
//Suhail Tailor



    public int[] dailyTemperatures(int[] temperatures) {

       Stack<Integer> stack = new Stack<>();// stack to store indices of temperatures
       int[] result = new int[temperatures.length];// result array initialized to 0 by default

       for(int i=0;i<temperatures.length;i++){// iterate through each temperature
        while(!stack.isEmpty()&& temperatures[i] > temperatures[stack.peek()] ){// check for warmer temperature
             int prevIndex = stack.pop();// pop the index from stack
             result[prevIndex] = i - prevIndex;// calculate the number of days to wait
        }
        stack.push(i);// push current index onto stack

       }
       return result;// return the result array

        
    }
}

