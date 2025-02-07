package gfg_160.trees;

import gfg_160.LL.easy.Nodes;

import java.util.ArrayList;

public class InorderTraversal {
    // https://www.geeksforgeeks.org/problems/inorder-traversal/1

    ArrayList<Integer> inOrder(Nodes root) {
        // Code
        ArrayList<Integer> arr = new ArrayList<Integer>();
        helper(root,arr);
        return arr;
    }

    void helper(Nodes root, ArrayList<Integer> arr){
        if(root==null){
            return ;
        }
        helper(root.left, arr);
        arr.add(root.data);
        helper(root.right, arr);
    }
}
