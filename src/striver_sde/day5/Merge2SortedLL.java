package striver_sde.day5;

import gfg_160.trees.Node;

public class Merge2SortedLL {

    Node sortedMerge(Node a, Node b) {

        if(a == null) return b;
        if(b== null) return a ;

        Node head = null ;
        Node tail = null ;

        if(a.data <= b.data){
            head = tail = a ; a = a.next;
        }else{
            head = tail = b; b = b.next;
        }

        while(a != null && b!= null){
            if(a.data <= b.data){
                tail.next = a; tail = a; a = a.next;
            }else{
                tail.next = b; tail =b ; b = b.next;
            }
        }
        if(a == null){
            tail.next = b;
        }else{
            tail.next = a;
        }
        return head ;
    }


}
