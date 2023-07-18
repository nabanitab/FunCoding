package Linkedlist;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList<String> subject = new LinkedList<>();  //for adding the element in linkedList
        subject.add("Bengali");
        subject.add("English");
        subject.add("Math");
        subject.add("science");
        System.out.println("LinkList : " + subject);

        subject.add(1,"Geography");     // for update or added new  the linkedList
        System.out.println("UpdatedLinkedList : " + subject);

        subject.add(1,"Sanskrit");    // for changing the index element.
        System.out.println("changeElement of index 1 : "+ subject);
    }
}
