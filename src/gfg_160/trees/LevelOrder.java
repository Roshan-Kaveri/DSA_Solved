package gfg_160.trees;

import gfg_160.LL.easy.Nodes;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {

    public ArrayList<ArrayList<Integer>> levelOrder(Nodes root) {
        // Your code here
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        if(root==null) return list;
        Queue<Nodes> q =new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer>ll=new ArrayList<>();
            for(int i=0;i<size;i++){
                Nodes curr= q.remove();
                ll.add(curr.data);
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            list.add(ll);
        }
        return list;
    }
}
