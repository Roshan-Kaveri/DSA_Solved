package striver_sde.day6;

import striver_sde.utils.Node;

public class ReverseKGroupedLL {

    static Node reverseLinkedList(Node head) {

        Node temp = head;


        Node prev = null;


        while(temp != null){

            Node front = temp.next;


            temp.next = prev;

            prev = temp;


            temp = front;
        }

        return prev;

    }

    static Node getKthNode(Node temp, int k) {

        k -= 1;


        while (temp != null && k > 0) {
            k--;

            temp = temp.next;
        }

        return temp;
    }



    public static Node kReverse(Node head, int k) {
        // Write your code here.
        Node temp = head;


        Node prevLast = null;

        while (temp != null) {

            Node kThNode = getKthNode(temp, k);


            if (kThNode == null) {


                if (prevLast != null) {
                    prevLast.next = temp;
                }

                break;
            }


            Node nextNode = kThNode.next;


            kThNode.next = null;


            reverseLinkedList(temp);


            if (temp == head) {
                head = kThNode;
            } else {
                prevLast.next = kThNode;
            }

            prevLast = temp;

            temp = nextNode;
        }

        return head;
    }
}
