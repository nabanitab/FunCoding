package hashMap;

//Iterating or looping Map Using keySet() and foreach loop

import java.util.HashMap;

public class HashMapUsingForEach {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("ram", "India");
        hashMap.put("john", "UK");
        hashMap.put("arina", "Usa");
        hashMap.put("rahim", "Bangladesh");

        System.out.println("Printing hashMap using iterator / for each");

        for (String key : hashMap.keySet()) {
            System.out.println("HashMap : " + key + "Value : " + hashMap.get(key));
        }
    }
}
