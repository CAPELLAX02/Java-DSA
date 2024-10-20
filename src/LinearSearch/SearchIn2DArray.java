package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int[] ans = search(arr, 99);
        System.out.println(Arrays.toString(ans));
        // out: [2, 1] (found at (2,1) coordinate)

        int[] ans2 = search(arr, 2);
        System.out.println(Arrays.toString(ans2));
        // out: [-1, -1] (not found)

        System.out.println(max(arr));
        // out: 99
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int max(int[][] arr) {
        int maxValue = Integer.MIN_VALUE; // it could also be arr[0][0]
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > maxValue) {
                    maxValue = arr[row][col];
                }
            }
        }
        return maxValue;
    }
}
