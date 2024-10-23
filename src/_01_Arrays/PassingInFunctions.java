package _01_Arrays;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums)); // out: [3, 4, 5, 6, 7]
        change(nums);
        System.out.println(Arrays.toString(nums)); // out: [99, 4, 5, 6, 7]
    }

    static void change(int[] arr) {
        arr[0] = 99;
    }
}
