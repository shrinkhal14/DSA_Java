package HashMaps;

import java.util.HashMap;
public class CharFreq {
    public static void main(String[] args) {
        String st = "abcdefghijklaab";
        HashMap<Character, Integer> maps = new HashMap<>();
        for(char i:st.toCharArray()){
          if(maps.containsKey(i)){
            maps.put(i,1+maps.get(i));
          }
          else{
            maps.put(i,1);
          }
        }
        System.out.println(maps.get('j'));
    }
}
