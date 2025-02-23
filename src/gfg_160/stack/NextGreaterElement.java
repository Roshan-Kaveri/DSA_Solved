package gfg_160.stack;

import java.util.ArrayList;
import java.util.Stack;

public class NextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                list.add(0,stack.peek());
            }else{
                list.add(0,-1);
            }
            stack.add(arr[i]);
        }
        return list;
    }
}
