package gfg_160.trees;

import java.util.ArrayList;

public class kth_small_in_bst {

    // https://www.geeksforgeeks.org/problems/find-k-th-smallest-element-in-bst/1

    public static ArrayList<Integer> inorder(Node root){
        ArrayList<Integer> a=new ArrayList<>();
        inorderhelper(root,a);
        return a;

    }
    public static void inorderhelper(Node root, ArrayList<Integer> a){
        if(root==null) return;
        inorderhelper(root.left,a);
        a.add(root.data);
        inorderhelper(root.right,a);
    }
    public int kthSmallest(Node root, int k) {
        // Write your code here

        ArrayList<Integer> a=inorder(root);
        if(root==null || k>a.size())return -1;
        return(a.get(k-1));

    }
}
