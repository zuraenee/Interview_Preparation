import java.util.Arrays;

public class RemoveElementThroughIDE {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,2,2,4,5};
        int val = 2;
        int count = 0;
        //counting how many digits are in the array that is not a duplicate
        for (int i=0; i<nums.length; i++){
            if (nums[i] != val) {
                count += 1;
            }
        }
        int[] expectedNums = new int[count];
        //trying to see if the target matches with any value in the array, if it doesnt match
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                expectedNums[j] = nums[i];
                j++;
            }
        }
        //counting how many digits are in the array
        for (int i=0; i<expectedNums.length; i++){
            if (expectedNums[i] != 0){
                count+=1;
            }
        }
        System.out.println("Before deletion : " + Arrays.toString(nums));
        System.out.println("After deletion : " + Arrays.toString(expectedNums));
        System.out.println("Number of integers left in array : " + count + ", " + Arrays.toString(expectedNums));
    }
}
