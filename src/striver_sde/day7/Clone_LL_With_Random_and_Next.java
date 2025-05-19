package striver_sde.day7;

import striver_sde.utils.Node;

import java.util.HashMap;

public class Clone_LL_With_Random_and_Next {

    public Node copyRandomList(Node head) {
        Node temp = head;
        
        
        HashMap<Node, Node> map = new HashMap<>();

        
        
        while (temp != null) {
            
            
            Node newNode = new Node(temp.val);
            
            
            map.put(temp, newNode);
            
            temp = temp.next;
        }

        temp = head;
        
        
        while (temp != null) {
            
            
            Node copyNode = map.get(temp);
            
            
            
            copyNode.next = map.get(temp.next);
            
            
            
            copyNode.random = map.get(temp.random);
            
            temp = temp.next;
        }

        
        
        return map.get(head);
    }

}
