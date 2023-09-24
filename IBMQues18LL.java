/*Remove nth node from lonked list*/

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next)
    {
        this.val = val;
        this.next = next;
    }
}
public class IBMQues18LL {
    public ListNode remove(ListNode head, int n)
    {
        if(head.next==null)
            return null;
        int size = 0;
        ListNode curr = head;
        while (curr!=null)
        {
            curr = curr.next;
            size++;
        }
        if(n==size)
            return head.next;
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 0;
        while (i<indexToSearch)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String[] args) {

    }
}
