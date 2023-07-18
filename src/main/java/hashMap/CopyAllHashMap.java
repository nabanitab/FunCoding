package hashMap;

import java.util.HashMap;

public class CopyAllHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer>hashMap = new HashMap<>();
        hashMap.put("susmita",23);
        hashMap.put("sona",23);
        hashMap.put("sonai",45);

        //System.out.println(hashMap);

        HashMap<String,Integer>integerHashMap = new HashMap<>();
        integerHashMap.putAll(hashMap);
        System.out.println(integerHashMap);
    }

}

//int a++ = 100;
//System.out.println(a++);







