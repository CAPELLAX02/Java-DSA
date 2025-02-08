package CycleSort.LeetCode;

import java.util.List;

/**
 * LeetCode 448: Find All Numbers Disappeared in an Array
 */
public class FindDisappearedNumbers {
    /**
     *  Given an array nums of n integers where nums[i] is in the range [1...n],
     *  return an array of all the integers in the range [1...n] that do not appear in nums.
     */
    public static void main(String[] args) {
        int[] nums = { 4,3,2,7,8,2,3,1 };
        System.out.println(findDisappearedNumbers(nums)); // 5, 6

        int[] nums2 = { 1,1 };
        System.out.println(findDisappearedNumbers(nums2)); // 2
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        // TODO
        return List.of();
    }
}
