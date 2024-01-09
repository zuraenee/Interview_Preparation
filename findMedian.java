import java.util.Arrays;
import java.util.List;
import java.util.*;

public class findMedian {
    public static int findmedian(List<Integer> arr){
        Collections.sort(arr);
        int median = arr.get(arr.size()/2);
        return median;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,4,47,102,-7);
        System.out.println(findmedian(list));
    }
}
