package gfg_160.LL.easy;

public class FindHeadLoop {
    public static Nodes findFirstNodes(Nodes head) {
        // code here
        if(head == null || head.next == null)
        {
            return null;
        }
        Nodes slow = head;
        Nodes fast = head;

        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == null)
            {
                return null;
            }
            if(slow == fast)
            {
                Nodes h = head;
                while(h != fast)
                {
                    fast = fast.next;
                    h = h.next;
                }
                return h;
            }
        }
        return null;
    }
}
