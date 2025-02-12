package Arrays.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 1365: How Many Numbers Are Smaller Than the Current Number
 *
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 */
public class SmallerNumbersThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums1 = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums1))); // [4,0,1,1,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(nums1))); // [4,0,1,1,3]

        int[] nums2 = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums2))); // [2,1,0,3]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(nums2))); // [2,1,0,3]

        int[] nums3 = {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums3))); // [0,0,0,0]
        System.out.println(Arrays.toString(smallerNumbersThanCurrent2(nums3))); // [0,0,0,0]

    }

    // with O(n^2) time complexity
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            res[i] = count;
        }

        return res;
    }

    // with O(n log(n)) time complexity
    static int[] smallerNumbersThanCurrent2(int[] nums) {
        int len = nums.length;
        int[] sorted = Arrays.copyOf(nums, len);
        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            map.putIfAbsent(sorted[i], i);
        }

        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = map.get(nums[i]);
        }

        return result;
    }
}
