package LinkedList;

/**
 * LeetCode 202: Happy Number (It's a hidden circular linked list question asked in Google)
 */
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(12)); // false
        System.out.println(isHappy(19)); // true
        System.out.println(isHappy(2));  // false
    }

    static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfDigitSquares(slow);
            fast = sumOfDigitSquares(sumOfDigitSquares(fast));
        } while (slow != fast);

        return slow == 1;
    }

    private static int sumOfDigitSquares(int num) {
        int ans = 0;
        while (num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        return ans;
    }
}
