package gfg_160.trees;

import gfg_160.LL.easy.Nodes;

import java.util.ArrayList;

public class traverse_tree_boundary {

    ArrayList<Integer> boundaryTraversal(Nodes Nodes) {
        // code here
        ArrayList<Integer> ans = new ArrayList();
        if(Nodes.left!=null || Nodes.right!=null){
            ans.add(Nodes.data);
        }
        leftNodess(Nodes.left, ans);
        addLeaves(Nodes, ans);
        rightRevNodess(Nodes.right, ans);
        return ans;
    }
    void leftNodess(Nodes Nodes, ArrayList<Integer> ans){
        if(Nodes == null)
            return;
        if(Nodes.left!=null){
            ans.add(Nodes.data);
            leftNodess(Nodes.left, ans);
        } else if(Nodes.right!=null){
            ans.add(Nodes.data);
            leftNodess(Nodes.right, ans);
        }
    }
    void addLeaves(Nodes Nodes, ArrayList<Integer> ans){
        if(Nodes == null)
            return;
        addLeaves(Nodes.left, ans);
        if(Nodes.left==null && Nodes.right == null){
            ans.add(Nodes.data);
        }
        addLeaves(Nodes.right, ans);
    }
    void rightRevNodess(Nodes Nodes, ArrayList<Integer> ans){
        if(Nodes == null)
            return;
        if(Nodes.right!=null){

            rightRevNodess(Nodes.right, ans);
            ans.add(Nodes.data);
        } else if(Nodes.left!=null){
            rightRevNodess(Nodes.left, ans);
            ans.add(Nodes.data);
        }
    }
}
