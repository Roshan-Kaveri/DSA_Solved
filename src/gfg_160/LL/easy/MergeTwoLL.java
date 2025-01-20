package gfg_160.LL.easy;

public class MergeTwoLL {


    //Function to merge two sorted linked list.
    Nodes sortedMerge(Nodes a, Nodes b) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if(a == null) return b;
        if(b== null) return a ;

        Nodes head = null ;
        Nodes tail = null ;

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
