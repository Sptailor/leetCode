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
     private   Stack <Integer>mainStack=new Stack<>();//stack to store all values
     private   Stack <Integer>minStack=new Stack<>();//stack to store minimum values
    public MinStack() {
       
       mainStack=new Stack();//stack to store all values
       minStack=new Stack();//stack to store minimum values

    }
    
    public void push(int val) {
        mainStack.push(val);//push value to main stack
        if(minStack.isEmpty()||minStack.peek()>val){//if min stack is empty or top of min stack is greater than val
            minStack.push(val);//push val to min stack
        }
    }
    
    public void pop() {
        if(!mainStack.isEmpty()){//if main stack is not empty
            if(mainStack.pop()==minStack.peek()){//if popped value is equal to top of min stack
                minStack.pop();//pop from min stack
            }
        }
    }
    
    public int top() {
       
      return  mainStack.peek();//return top of main stack
    }
    
    public int getMin() {

            return minStack.peek();//return top of min stack
         
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