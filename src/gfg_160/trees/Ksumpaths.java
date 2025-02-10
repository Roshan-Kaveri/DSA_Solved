package gfg_160.trees;

import gfg_160.LL.easy.Nodes;

import java.util.ArrayList;

public class Ksumpaths {
    int count = 0;
    public int sumK(Nodes root, int k) {
        // code here
        ArrayList<Integer> path = new ArrayList<>();
        helper(root, k, path);
        return count;
    }

    void helper(Nodes root, int k, ArrayList<Integer> path){
        if(root == null ) return;

        path.add(root.data);
        int sum = 0;

        for(int i = path.size()-1; i>=0; i--){
            sum += path.get(i);
            if(sum == k) count++;
        }

        helper(root.left, k, path);
        helper(root.right, k, path);

        path.remove(path.size()-1);
    }
}
