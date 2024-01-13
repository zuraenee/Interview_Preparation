import java.util.Arrays;

public class SearchingAlgorithm {
    public static void LinearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                System.out.println("we found target in array");
            }
        }
    }
    public static void BinarySearch(int[] arr, int target){
        //more efficient if list is sorted
        int low = 0;
        int high = arr.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            int midElement = arr[mid];
            if (midElement == target){
                System.out.println("we found target in array");
                return;
            }
            else if (midElement < target){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        System.out.println("no target found");
    }

    public static void main(String[] args) {
        int[] array = {3,1,6,2,0,1,9};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        LinearSearch(array,3);
        BinarySearch(array,6);
    }
}
