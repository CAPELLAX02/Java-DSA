package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // in: 1 2 3 4 5
        // out: 1 2 3 4 5

        // Enhanced "for" loop
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // in: 1 2 3 4 5
        // out: 1 2 3 4 5

        System.out.println();

        System.out.println(Arrays.toString(arr));
        // in: 1 2 3 4 5
        // out: [1, 2, 3, 4, 5]

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        // in: aa bb cc dd
        // out: [aa, bb, cc, dd]
    }
}
