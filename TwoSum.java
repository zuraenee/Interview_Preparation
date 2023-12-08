class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1, num2;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                num1 = nums[i];
                num2 = nums[j];
                if (num1 + num2 == target){
                    return new int[]{i, j};
                }
            }

        }
        return new int[]{};
    }
}
