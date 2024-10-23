package _03_BinarySearch.LeetCode;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    /*
     * No: 34
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending
     * position of a given target value. If target is not found in the array, return [-1, -1].
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };

        System.out.println(Arrays.toString(searchRange(arr, 8)));
        // out: [3, 4]

        System.out.println(Arrays.toString(searchRange(arr, 6)));
        // out: [-1, -1]
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    // function to return the index of the target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        if (target < nums[start] || target > nums[end]) {
            return ans;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
