package arrayLevelA;

 //Given an element write a program to check if element(value) exists in ArrayList?

//for remove we should call remove method

import java.util.ArrayList;

public class CheckExistingNumber {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList <Integer> ();

        al.add(7);
        al.add(10);
        al.add(23);
        al.add(78);
        al.add(79);
        al.add(56);
        al.add(67);
        al.add(28);

        if (al.contains(23)){
            System.out.println("number found : 23");
        }else {
            System.out.println("number not found : 23");
        }

    }
}
