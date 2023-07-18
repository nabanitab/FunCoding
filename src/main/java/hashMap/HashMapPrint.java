package hashMap;

import java.util.HashMap;

public class HashMapPrint {

    public static void main(String[] args) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("nabanita", 37);
        hashMap.put("susmita", 20);
        hashMap.put("tuhin", 50);

        System.out.println("name of perticipent" + hashMap);

        System.out.println("rank" + hashMap.keySet());
    }
}
