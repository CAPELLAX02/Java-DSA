package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListBasics {
    public static void main(String[] args) {

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list); // out: [1, 2, 3]

        System.out.println(list.get(0)); // out: 1
        System.out.println(list.get(1)); // out: 2
        System.out.println(list.get(2)); // out: 3

        list.remove(0);

        System.out.println(list); // out: [2, 3]

        list.clear();

        System.out.println(list); // out: []

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list); // out: [10, 20, 30]

        System.out.println(list.contains(20)); // out: true
        System.out.println(list.contains(25)); // out: false

        list.set(0, 99);
        System.out.println(list); // out: [99, 20, 30]

        System.out.println(list.isEmpty()); // out: false

        list.clear();

        System.out.println(list.isEmpty()); // out: true

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        System.out.println(list);
        // in:   1 2 3 4 5
        // out:  [1, 2, 3, 4, 5]

        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list2.add(in2.nextInt());
        }
        // And ofc we can use enhanced for loop in an ArrayList
        for (Integer integer : list2) {
            System.out.print(integer + "\t");
        }
        // in:   1 2 3 4 5
        // out:  1   2   3   4   5
    }
}
