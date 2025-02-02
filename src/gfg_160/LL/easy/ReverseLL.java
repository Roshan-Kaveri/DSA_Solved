package gfg_160.LL.easy;

import org.w3c.dom.Node;

public class ReverseLL {
    //Function to reverse a linked list.
    Nodes reverseList(Nodes head)
    {
        if(head == null || head.next == null){
            return head;
        }
        Nodes prev = null;
        Nodes current = head;
        Nodes next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
