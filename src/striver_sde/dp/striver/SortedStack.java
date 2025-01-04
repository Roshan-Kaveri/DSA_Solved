package striver_sde.dp.striver;

//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;

class SortedStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Stack<Integer> s = new Stack<>();
            int n = sc.nextInt();
            while (n-- > 0) s.push(sc.nextInt());
            Solution_SS g = new Solution_SS();
            Stack<Integer> a = g.sort(s);
            while (!a.empty()) {
                System.out.print(a.peek() + " ");
                a.pop();
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/
class Solution_SS {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        Stack<Integer> tempStack = new Stack<>();


        while (!s.isEmpty()) {
            int current = s.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                s.push(tempStack.pop());
            }

            tempStack.push(current);
        }
        return tempStack;


    }


}