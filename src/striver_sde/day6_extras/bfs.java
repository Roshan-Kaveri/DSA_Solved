package striver_sde.day6_extras;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {

    public ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean b[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();


        b[0] = true;
        q.add(0);

        while(!q.isEmpty()){
            int node = q.poll();
            arr.add(node);


            for(int it : adj.get(node)){
                if(!b[it]){
                    b[it] = true;
                    q.add(it);
                }
            }
        }
        return arr;
    }

}
