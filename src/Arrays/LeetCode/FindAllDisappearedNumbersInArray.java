package Arrays.LeetCode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * LeetCode 448: Find All Numbers Disappeared in an Array
 */
public class FindAllDisappearedNumbersInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums)); // [5,6]
        System.out.println(findDisappearedNumbers2(nums)); // [5,6]
        System.out.println(findDisappearedNumbers3(nums)); // [5,6]

        int[] nums2 = {1,1};
        System.out.println(findDisappearedNumbers(nums2)); // [2]
        System.out.println(findDisappearedNumbers2(nums2)); // [2]
        System.out.println(findDisappearedNumbers3(nums2)); // [2]

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int len = nums.length;
        for (int i = 1; i <= len; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }

    // Second solution using Java 8+ Stream API over collections framework
    static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = Arrays.stream(nums)
                                 // primitive <--> Wrapper conversion needed
                                 .boxed()
                                 .collect(Collectors.toSet());

        int len = nums.length;
        for (int i = 1; i <= len; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }

    // Best approach using index manipulation
    static List<Integer> findDisappearedNumbers3(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
}
