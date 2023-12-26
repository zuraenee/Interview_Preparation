public class RotateArray {
    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int lastElement = nums[nums.length-1];
            for (int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0]=lastElement;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        rotate(nums,3);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
