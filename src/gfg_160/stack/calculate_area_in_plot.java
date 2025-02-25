package gfg_160.stack;

import java.util.Stack;

public class calculate_area_in_plot {
    //https://www.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/1
    public static int getMaxArea(int arr[]) {
        // your code here
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < n) {
            if (stack.isEmpty() || arr[i] >= arr[stack.peek()]) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, arr[top] * width);
            }
        }


        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, arr[top] * width);
        }

        return maxArea;
    }

}
