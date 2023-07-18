package hashMap;

// Iterating or looping Map Using keySet() and iterator

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapUsingKeySet {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("hari", "ramnagar");
        hashMap.put("gouri", "sonarpur");
        hashMap.put("amar", "bangladesh");

        Set<String> keySet = hashMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println("key: " + key + " value: " + hashMap.get(key));
        }
    }
}

