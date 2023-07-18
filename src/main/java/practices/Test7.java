package practices;

import java.util.HashMap;
import java.util.LinkedList;

public class Test7 {
    public static void main(String[] args) {
        HashMap<String,Integer>salary = new HashMap<>();

        salary.put("rina",300000);
        salary.put("hina",500000);
        salary.put("asif",3800000);
        salary.put("mou",460000);
        salary.put("mani",600000);


      /*  LinkedList<Integer> addList = new LinkedList<>();
        addList.add(12);
        addList.add(34);
        addList.add(7);*/


        System.out.println("HashMap : "+ salary);
    }
}
