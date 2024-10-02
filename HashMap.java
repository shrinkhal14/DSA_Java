package HashMaps;

import java.util.HashMap;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        //declaration
        HashMap<String,Integer> map = new HashMap<>();

        //insert
        map.put("India",1000);
        map.put("China",5000);
        map.put("US",50);
        System.out.println(map);

        //get
        System.out.println(map.get("India"));

        //containskey
        System.out.println(map.containsKey("India"));

        //iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for(String k:keys){
            System.out.println("key: " + k + " value: "+ map.get(k));
        }
    }
}
