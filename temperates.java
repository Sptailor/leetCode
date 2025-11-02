//Suhail Tailor
// Problem: Daily Temperatures
// This solution uses a monotonic stack to solve the "Daily Temperatures" problem in O(n) time.
// We maintain a stack of indices where temperatures are not yet resolved (waiting for a warmer day).
// As we iterate through the array, whenever the current temperature is warmer than the temperature
// at the index on top of the stack, we pop that index and calculate how many days it took to find
// a warmer temperature (currentIndex - prevIndex). Each index is pushed and popped at most once,
// ensuring linear time complexity.

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       
       Stack<Integer>stack=new Stack();//monotonic stack to store indices of temperatures
       int[] result = new int[temperatures.length];//result array to store days until warmer temperature

       for(int i=0;i<temperatures.length;i++){//iterate through temperatures
        while(!stack.isEmpty()&& temperatures[i] > temperatures[stack.peek()] ){//found a warmer temperature
             int prevIndex = stack.pop();
             result[prevIndex] = i - prevIndex;
        }
        stack.push(i);

       }
       return result;

        
    }
}