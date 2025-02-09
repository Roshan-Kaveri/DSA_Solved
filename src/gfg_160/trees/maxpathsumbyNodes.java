package gfg_160.trees;

import gfg_160.LL.easy.Nodes;

public class maxpathsumbyNodes {

    int findMaxSum(Nodes Nodes) {
        // your code goes here
        if(Nodes==null)return -10000;
        int numSumLeft = count(Nodes.left);
        int numSumRight = count(Nodes.right);
        numSumLeft = numSumLeft<0?0:numSumLeft;
        numSumRight = numSumRight<0?0:numSumRight;
        int curr = Nodes.data + numSumLeft + numSumRight;
        int leftNodes = findMaxSum(Nodes.left);
        int rightNodes = findMaxSum(Nodes.right);
        return Math.max(curr,Math.max(leftNodes,rightNodes));
    }

    public static int count(Nodes root){
        if(root==null)return -10000;
        int num = root.data;
        int left = num + count(root.left);
        int right = num + count(root.right);
        return Math.max(num,Math.max(left,right));
    }
}
