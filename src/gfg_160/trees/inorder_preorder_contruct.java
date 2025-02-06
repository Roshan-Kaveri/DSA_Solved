package gfg_160.trees;

import gfg_160.LL.easy.Nodes;

public class inorder_preorder_contruct {
    // https://www.geeksforgeeks.org/problems/construct-tree-1/1
    public static int rootInInorder(int i, int j, int value, int [] inorder){
        for(int k = i; k<= j; k++){
            if(inorder[k] == value) return k;
        }
        return i;
    }

    public static Nodes constructBinaryTree(int [] inorder, int preorder[], int i1, int j1, int i2, int j2){
        if(i2 > j2) return null;
        Nodes root = new Nodes(preorder[i2]);
        int index = rootInInorder(i1, j1, preorder[i2], inorder);
        root.left = constructBinaryTree(inorder, preorder, i1, index - 1, i2 + 1, i2 + index - i1);
        root.right = constructBinaryTree(inorder, preorder, index + 1, j1, i2 + index - i1 + 1, j2);
        return root;
    }

    public static Nodes buildTree(int inorder[], int preorder[]) {
        int n = inorder.length;
        return constructBinaryTree(inorder, preorder, 0, n - 1, 0, n - 1);
    }
}
