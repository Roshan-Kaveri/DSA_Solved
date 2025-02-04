package gfg_160.trees;

import gfg_160.LL.easy.Nodes;

public class diameter {

    // // https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1

    int ans;
    int diameter(Nodes root) {
        ans=0;
        solve(root);
        return ans;
    }
    int solve(Nodes root){
        if(root==null)  return 0;
        int left = solve(root.left);
        int right = solve(root.right);
        ans = Math.max(ans, left+right);
        return 1+Math.max(left,right);
    }

}
