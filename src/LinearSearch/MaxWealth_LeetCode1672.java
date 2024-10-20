package LinearSearch;

public class MaxWealth_LeetCode1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println(maximumWealth(accounts));
        // out: 6
    }

    static int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

        /* "for" loops can be enhanced as below since
           did not need to use indexed that much


        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

         */
    }
}
