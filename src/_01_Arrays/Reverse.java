package _01_Arrays;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 9 };
        printArray(nums); // out: [1, 3, 5, 7, 9]
        reverse(nums);
        printArray(nums); // out: [9, 7, 5, 3, 1]
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
