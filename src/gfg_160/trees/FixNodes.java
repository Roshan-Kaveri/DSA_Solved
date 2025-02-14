package gfg_160.trees;

// https://www.geeksforgeeks.org/problems/fixed-two-nodes-of-a-bst/1

public class FixNodes {
    Node prev,first,second;
    void correctBST(Node root) {
        prev=first=second=null;
        solve(root);
        int temp=first.data;
        first.data=second.data;
        second.data=temp;
    }

    void solve(Node root){
        if(root==null) return;
        solve(root.left);
        if(prev!=null){
            if(first==null){
                if(root.data<prev.data) {
                    first=prev;
                    second=root;
                }
            }else{
                if(root.data<prev.data) second=root;
            }
        }
        prev=root;
        solve(root.right);
    }
}
