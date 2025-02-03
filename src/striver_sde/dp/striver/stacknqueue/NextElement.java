package striver_sde.dp.striver.stacknqueue;

import java.util.ArrayList;
import java.util.Stack;


//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class NextElement {

    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            result.add(-1);
        }

        for (int i = n - 1; i >= 0; i--) {

            while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                stk.pop();
            }


            if (!stk.isEmpty()) {
                result.set(i, stk.peek());
            }

            stk.push(arr[i]);
        }

        return result;
    }

}
