import java.util.*;
import java.util.Map.Entry;

public class lonelyintegerHashMap {
    public static int lonelyinteger(List<Integer> a){
        HashMap<Integer, Integer> hash = new HashMap<>();
        int lonely = 0;
        //wont work if its combinated
        //putting keys into the hashmap
        for (int i = 0; i < a.size(); i++) {
            hash.put(a.get(i),lonely);
        }
        //putting the values into the hashmap
        for (int i = 0; i < a.size(); i++) {
            if (hash.containsKey(a.get(i))){
                hash.put(a.get(i), hash.getOrDefault(a.get(i),0)+1);
                //If the key already exists in the map, it updates the value; otherwise, it adds a new entry to the map with the key and the incremented value.
            }
        }
        //finding the key with value using ENTRY
        for (Entry<Integer, Integer> entry : hash.entrySet()){
            if (entry.getValue() == 1){
                lonely = entry.getKey();
            }
        }
        //finding the key with value manually
        for (int key : hash.keySet()){ //doesnt matter if its Integer or int, usually follow list type, in this case Integer
            if (hash.get(key) == 1){
                lonely = key;
            }
        }

       System.out.println(hash);

        return lonely;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7,2,2,3,3,4,4,5,4,5);
        System.out.println(lonelyinteger(list));
    }
}
