//by Suhail Tailor

import java.util.Stack;

/**
 * MinStack implementation using two stacks.
 * - mainStack stores all values.
 * - minStack stores the minimum values at each step.
 * 
 * When pushing, if the value is smaller or equal to the current minimum, 
 * it is also pushed onto minStack.
 * When popping, if the popped value equals the current minimum, it is popped 
 * from minStack as well.
 * 
 * This allows retrieving the minimum element in O(1) time.
 */


class MinStack {
     private   Stack <Integer>mainStack=new Stack<>();
     private   Stack <Integer>minStack=new Stack<>();
    public MinStack() {
       
       mainStack=new Stack();//stack to store all values
       minStack=new Stack();//stack to store minimum values

    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty()||minStack.peek()>val){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(!mainStack.isEmpty()){
            if(mainStack.pop()==minStack.peek()){
                minStack.pop();
            }
        }
    }
    
    public int top() {
       
      return  mainStack.peek();
    }
    
    public int getMin() {
        
            return minStack.peek();
         
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */