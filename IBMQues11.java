/*
Length of Linked List
 */

public class IBMQues11 {
    class Node{
        int data;
        Node next;
    }
    Node head;
    Node tail;
    int count=0;
    int size;
    public void addFirst(int item)
    {
        Node nn = new Node();
        nn.data = item;
        nn.next = head;
        head = nn;
    }
    /*public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size = this.size + 1;
        } else {
            nn.next = this.head;
            this.head = nn;
            this.size = this.size + 1;
        }
    }*/
    public int length()
    {
        Node temp = head;
        while(temp!=null)
        {
            count+=1;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        IBMQues11 ll = new IBMQues11();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        System.out.println(ll.length());
    }
}
