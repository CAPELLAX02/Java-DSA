package CycleSort.LeetCode;

/**
 * LeetCode 268: Missing Number
 */
public class MissingNumber {
    /**
     *  Given an array "nums" containing "n" distinct numbers in the range [0, n],
     *  return the only number that is missing from the array.
     *  NOTE: Try to solve it using O(1) space complexity, and "O(n) TIME COMPLEXITY".
     */
    public static void main(String[] args) {
        int[] nums = { 6, 8, 4, 2, 1, 3, 7, 0 };
        // Sorted nums: [0 1 2 3 4 6 7 8] thus the answer should be 5.

        System.out.println(missingNumber(nums)); // 5

        int[] nums2 = { 5, 1, 3, 0, 4 };
        System.out.println(missingNumber(nums2)); // 2
    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
}
