package BinarySearch.LeetCode;

public class PeakIndexInMountainArray {
    /**
     * No: 852
     * You are given an integer mountain array arr of length n
     * where the values increase to a peak element and then decrease.
     * Return the INDEX of the peak element.
     * Your task is to solve it in O(log(n)) time complexity.
     */
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 8, 7, 5, 1};
        System.out.println(peakIndexInMountainArray(arr));
        // out: 3

        int[] arr2 = { 0, 1, 0 };
        System.out.println(peakIndexInMountainArray(arr2));
        // out: 1

        int[] arr3 = { 0, 2, 1, 0 };
        System.out.println(peakIndexInMountainArray(arr3));
        // out: 1

        int[] arr4 = { 3, 4, 5, 1 };
        System.out.println(peakIndexInMountainArray(arr4));
        // out: 2
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {
            if (arr[mid] > arr[mid + 1]) {
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
