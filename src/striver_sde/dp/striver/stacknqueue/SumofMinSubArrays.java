package striver_sde.dp.striver.stacknqueue;

import java.util.Stack;
// revise
//https://www.geeksforgeeks.org/problems/sum-of-subarray-minimum/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class SumofMinSubArrays {

    public static int sumSubarrayMins(int[] arr) {
        int N = arr.length;
        int ans = 0;
        Stack<Integer> st = new Stack<>();
        long mod = (long)1000000007;
        st.push(-1);
        for (int i= 0; i < arr.length+1; i++){
            int currVal = (i<=arr.length-1)? arr[i] : 0;
            while(st.peek() !=-1 && currVal<arr[st.peek()]){
                int index = st.pop();
                int j = st.peek();
                int left = index - j;
                int right = i - index;
                long add = (left * right * (long)arr[index]) % mod;
                ans += add ;
                ans %= mod;
            }
            st.push(i);
        }
        return ans;
    }
}
