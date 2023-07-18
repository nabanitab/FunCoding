package Linkedlist;

import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        LinkedList<String> language = new LinkedList<>();
        language.add("java");
        language.add("c");
        language.add("c+");
        language.add("angular");
        language.add(".net");
        System.out.println("LinkList: "+ language);

        String str = language.get(3); // for getting the required index value.
        System.out.println("Index number of 1 : " + str);



    }
}


