package LinearSearch.LeetCode;

public class EvenDigits {
    /**
     * No: 1295
     * Given an array nums of integers,
     * return how many of them contain an even number of digits.
     */
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
        // out: 2

        int[] nums2 = { 0, -20, -300, 4000, 50000, 99 };
        System.out.println(findNumbers(nums2));
        // out: 3
    }

    // Main solution function
    static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    // function to check if a number contains even digits
    static boolean even(int num) {
        return digits(num) % 2 == 0;
    }

    // count number of digits in a number
    static int digits(int num) {
        if (num < 0) num *= -1;

        if (num == 0) return 1;

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

}
