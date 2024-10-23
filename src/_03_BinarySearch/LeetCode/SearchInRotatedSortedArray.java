package _03_BinarySearch.LeetCode;

public class SearchInRotatedSortedArray {
    /**
     * No: 33
     * There is an integer array nums sorted in ascending order (with distinct values).
     *
     * Prior to being passed to your function, nums is possibly rotated at an unknown
     * pivot index k (1 <= k < nums.length) such that the resulting array is
     * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     *
     * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
     *
     * Given the array nums after the possible rotation and an integer target,
     * return the index of target if it is in nums, or -1 if it is not in nums.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(nums, 0));
        // out: 4

        int[] nums2 = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(nums2, 3));
        // out: -1

        int[] nums3 = { 1 };
        System.out.println(search(nums3, 0));
        // out: -1

    }

    static int search(int[] nums, int target) {
        // TODO:
    }

}
