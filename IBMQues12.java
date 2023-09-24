/*
Fourth Node from end in Linked List
 */

public class IBMQues12 {
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
    public static void find(int n)
    {
        Node temp = head;
        if(length()<n) {
            System.out.println("Less than 4 nodes");
            return;
        } else {
            for (int i = 0; i < count - n; i++) // while(i<count-n+1)
                temp = temp.next;               // { Node curr = head; curr = curr.next; i++;} return curr;
        }
        System.out.println(temp.data);
    }
    public static void main(String[] args) {
        IBMQues12 ll = new IBMQues12();
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(60);
        ll.addFirst(70);
        find(2);
    }
}
