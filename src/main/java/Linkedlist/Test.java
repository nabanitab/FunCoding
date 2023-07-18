package Linkedlist;

public class Test {

    public class LinkedList {
       private Node head;

        class Node {
            int data;
            Node next;
            Node(int d)
            {
                data = d;
                next = null;
            }
        }

        public void main(String[] args)
        {
            LinkedList llist = new LinkedList();

            llist.head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);

            llist.head.next = second; // Link first node with

            second.next = third;
        }

    }

}
