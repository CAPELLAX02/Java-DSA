package Arrays.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 268: Missing Number
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr)); // 2

        int[] arr2 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr2)); // 8
    }

    static int missingNumber(int[] nums) {
        int length = nums.length;
        int expSum = length * (length + 1) / 2;
        int sum = 0;

        for (int num : nums)
            sum += num;

        return expSum - sum;
    }
}
