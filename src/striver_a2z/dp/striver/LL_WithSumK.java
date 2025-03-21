package striver_a2z.dp.striver;

import java.util.ArrayList;

class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

public class LL_WithSumK {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here

        Node left = head;
        Node right = head;
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();


        while(right.next != null)
            right = right.next;


        while(left!=null && right != null && left.data < right.data){
            if(left.data + right.data == target){
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(left.data);
                ans.add(right.data);
                answer.add(ans);
                left = left.next;
                right = right.prev;
            }else if (left.data + right.data > target){
                right = right.prev;
            }else if (left.data + right.data < target){
                left = left.next;
            }


        }


        return answer;

    }
}
