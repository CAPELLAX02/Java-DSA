package _01_Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr)); // out: [1, 2, 3, 4, 5]
        swap(arr,0, 2); // should swap the 1st and 3rd elements
        System.out.println(Arrays.toString(arr)); // out: [3, 2, 1, 4, 5]
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
