package _01_Arrays;

import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        // Quick note: This declaration is valid
        int[][] arr2d = {
                {1, 2, 3},    // arr2d[0]
                {4, 5},       // arr2d[1]
                {6, 7, 8, 9}  // arr2d[2]
        };

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the array (3x2) elements");

        int[][] arr = new int[3][2];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // in: 1 2 3 4 5 6 7 8

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        /*
            out:  1 2
                  3 4
                  5 6
         */

        System.out.println();

        // Example to output an irregular multidimensional array
        int[][] myArr = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        for (int row = 0; row < myArr.length; row++) {
            for (int col = 0; col < myArr[row].length; col++) {
                System.out.print(myArr[row][col] + " ");
            }
            System.out.println();
        }
        /*
             out:  1 2 3
                   4 5
                   6 7 8 9
         */
    }
}
