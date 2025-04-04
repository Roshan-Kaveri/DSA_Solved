package gfg_160.LL.easy;



import gfg_160.trees.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_K_Sorted_LL {


        // Function to merge K sorted linked list.
        Node mergeKLists(List<Node> arr) {
            // Add your code here.
            List<Node> list=new ArrayList<>();
            for(Node node:arr){
                Node curr=node;
                while(curr!=null){
                    list.add(curr);
                    curr=curr.next;
                }
            }
            Collections.sort(list,(a, b)->a.data-b.data);
            for(int i=1;i<list.size();i++){
                list.get(i-1).next=list.get(i);
            }
            return list.get(0);
        }


}
