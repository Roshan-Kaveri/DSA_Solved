package striver_sde.dp.striver.backtracking;

import java.util.List;

public class M_graph_colouring {
    boolean graphColoring(int v, List<int[]> edges, int m) {
        // code here
        int[] color = new int[v];
        int n = edges.size();
        if(colors(0,v,edges,m,n,color)) return true;
        return false;

    }


    boolean colors(int node, int v, List<int[]> edges, int m, int n, int[] color){
        if (node == v) return true;
        for(int i = 1 ; i <= m ; i++){
            if(isSafe(i,edges,node,color)){
                color[node] = i;
                if(colors(node + 1,v,edges,m,n,color)) return true;
                color[node] = 0;
            }
        }
        return false;
    }

    boolean isSafe(int col , List<int[]> edges, int node, int[] color ){
        for (int[] edge : edges) {
            if ((edge[0] == node && color[edge[1]] == col) ||
                    (edge[1] == node && color[edge[0]] == col)) {
                return false;
            }
        }
        return true;

    }
}
