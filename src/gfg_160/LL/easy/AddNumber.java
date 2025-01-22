package gfg_160.LL.easy;

public class AddNumber {
    static Nodes addTwoLists(Nodes num1, Nodes num2) {
        Nodes a = reverseList(num1);
        Nodes b = reverseList(num2);
        Nodes c = null;
        Nodes p = null;
        int carry = 0;

        while (a != null || b != null) {
            int sum = carry;

            if (a != null) {
                sum += a.data;
                a = a.next;
            }

            if (b != null) {
                sum += b.data;
                b = b.next;
            }

            carry = sum / 10;
            int digit = sum % 10;


            Nodes newNodes = new Nodes(digit);


            if (c == null) {
                c = newNodes;
                p = c;
            } else {
                p.next = newNodes;
                p = p.next;
            }
        }


        if (carry > 0) {
            p.next = new Nodes(carry);
        }


        c = reverseList(c);

        while(c != null){
            if(c.data == 0){
                c = c.next;
            }else{
                break;
            }
        }
        if(c== null){
            return new Nodes(0);
        }

        return c;
    }
    static Nodes reverseList(Nodes head)
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
