package _03_BinarySearch.LeetCode;

public class FindPeakElement {
    /**
     * No: 162
     * A peak element is an element that is strictly greater than its neighbors.
     * Given an integer array "nums", find a peak element, and return its index.
     * If the array contains multiple peaks, return the index to any of the peaks.
     * You may imagine that nums[-1] = nums[n] = -oo.
     * You must write an algorithm that run in O(log n) time.
     */
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 8, 7, 5, 1};
        System.out.println(peakIndexInMountainArray(nums));
        // out: 3

        int[] nums2 = { 0, 1, 0 };
        System.out.println(peakIndexInMountainArray(nums2));
        // out: 1

        int[] nums3 = { 0, 2, 1, 0 };
        System.out.println(peakIndexInMountainArray(nums3));
        // out: 1

        int[] nums4 = { 3, 4, 5, 1 };
        System.out.println(peakIndexInMountainArray(nums4));
        // out: 2
    }

    static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
        int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // we are in decreasing part of the array
                end = mid;
            } else {
                // we are in ascending part of the array
                start = mid + 1;
            }
        }
        // in the end, 'start' equals 'end' and pointing to the largest number
        return start;
    }

}
