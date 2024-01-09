import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class minmaxsum {
    public static void minmaxsum(List<Integer> arr){
        int minsum =0;
        int maxsum=0;
        Collections.sort(arr);
        int totalSize = arr.size();
        for (int i=0; i<totalSize-1; i++){
            minsum += arr.get(i);
        }
        for (int i=1; i<totalSize; i++){
            maxsum += arr.get(i);
        }
        System.out.print(minsum);
        System.out.print(" ");
        System.out.print(maxsum);


    }
    public static void minmaxsum2(List<Integer> arr){
        int sum =0;
        Collections.sort(arr);
        int totalSize = arr.size();
        for (int i=0; i<totalSize; i++){
            sum += arr.get(i);
        }
        int min = sum - arr.get(totalSize-1);
        int max =  sum - arr.get(0);
        System.out.print(min +" " + max);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(256741038, 623958417, 467905213,714532089, 938071625);
        minmaxsum(list);
        System.out.println();
        minmaxsum(list2);
        System.out.println();
        minmaxsum2(list);
        System.out.println();
        minmaxsum2(list2);
    }
}
