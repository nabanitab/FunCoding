package Linkedlist;

import java.util.LinkedList;

public class Test3 {
    public static void main(String[] args) {
        LinkedList<String> language = new LinkedList<>();
        language.add("java");
        language.add("c");
        language.add("c+");
        language.add("angular");
        language.add(".net");
        System.out.println("LinkList: "+ language);

        String str = language.remove(2);
        System.out.println(str);
    }
}
