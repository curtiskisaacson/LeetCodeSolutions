//Solution to LeetCode 232
//Build Queue on Stack
import java.io.*;
import java.util.*; 
class MyQueue {

    Stack<Integer> front = null;
    Stack<Integer> back = null;
    /** Initialize your data structure here. */
    public MyQueue() {
        front = new Stack<Integer>();
        back = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        moveAllToFront();
        front.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        moveAllToBack();
        return back.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        moveAllToBack();
        return back.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return ( front.empty() && back.empty()  );
    }
    
    private void moveAllToBack(){
        
        while (this.front.size()>0){
        int temp = front.pop();
        back.push(temp);
        }
    }
    
    private void moveAllToFront(){
        
        while(this.back.size()>0){
        int temp = back.pop();
        front.push(temp);
        }
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
