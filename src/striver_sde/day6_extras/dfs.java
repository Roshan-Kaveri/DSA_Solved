package striver_sde.day6_extras;

import java.util.ArrayList;

public class dfs {

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int V = adj.size();
        boolean b[] = new boolean[V];
        ArrayList<Integer> ls = new ArrayList<>();

        dfshelper(0,b,ls,adj);
        return ls;


    }

    public void dfshelper(int t, boolean b[], ArrayList<Integer> ls, ArrayList<ArrayList<Integer>> adj){
        b[t] = true;
        ls.add(t);

        for(int it : adj.get(t)){
            if(!b[it]){
                dfshelper(it,b,ls,adj);
            }
        }
    }

}
