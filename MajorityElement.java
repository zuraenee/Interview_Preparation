import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        Map<Integer, Integer> map = new HashMap<>();
       
//      for (int i = 0; i < nums.length; i++) {
//              //put each element into the hashmap, but if it is already a key in map (getOrDefault), then they put element as key, if not returns 0
//              map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); //add 1 to element counter, because we've encountered the element again, so we need to update its frequency coun
//       }
      
         //going through element in the array
        for (int i : nums) {
            //put each element into the hashmap, but if it is already a key in map (getOrDefault), then they put element as key, if not returns 0
            map.put(i, map.getOrDefault(i, 0) + 1); //add 1 to element counter, because we've encountered the element again, so we need to update its frequency coun

        }
        int majorityElement =0;
        int majorityElementCount = 0;
        //In Java, when you iterate over a Map using a for-each loop, you get a set of Map.Entry objects, where each entry represents a key-value pair in the map.
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) { //is a for-each loop that iterates over each entry in the set of entrie
            int counter = entry.getValue();
            if (counter > majorityElementCount){
                majorityElementCount = counter;
                majorityElement = entry.getKey();
            }
        }
        System.out.println(majorityElement);
        System.out.println(majorityElementCount);
    }
}
