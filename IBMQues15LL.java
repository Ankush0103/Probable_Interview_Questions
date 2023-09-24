/*
Mid element of Linked List
 */
public class IBMQues15LL {
    class Node
    {
        int data;
        Node next;
    }
    public static Node head;
    Node tail;
    public static int size;
    public static int count = 0;
    public void addFirst(int item)
    {
        Node nn = new Node();
        nn.data = item;
        nn.next = head;
        head = nn;
    }
    public static int length()
    {
        Node temp = head;
        while (temp!=null)
        {
            count+=1;
            temp = temp.next;
        }
        return count;
    }
    public static void findmid()
    {
        Node temp = head;
        for (int i = 0; i < (count-1)/2; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        IBMQues15LL ll = new IBMQues15LL();
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(60);
        ll.addFirst(70);
        System.out.println(length()); // to implement count for findmid function

        findmid();
    }
}
