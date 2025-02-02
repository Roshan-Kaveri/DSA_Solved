package gfg_160.trees;

import gfg_160.LL.easy.Nodes;

public class height_of_tree {
    int height(Nodes node) {
        // code here
        if(node== null)
        {
            return -1;
        }
        return (1 + Math.max(height(node.left),height(node.right)));
    }
}
