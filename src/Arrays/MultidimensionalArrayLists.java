package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultidimensionalArrayLists {
    public static void main(String[] args) {

        // Define
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        /*
         If we do not initialize the arraylist with arraylists,
         meaning if we do not fill the arraylist with some arraylists in it,
         we'll get a 'what arraylist of the arraylists are you talking about?'-like error.
         */

        Scanner in = new Scanner(System.in);

        // Manipulations
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);
        // out: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

    }
}
