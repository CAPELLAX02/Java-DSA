package _02_LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, 17, 20, 8, 11, 32, 33, 29, 15, 16};

        int ans = linearSearch(arr, 11, 3, 9);
        System.out.println(ans); // 5

        int ans2 = linearSearch(arr, 18, 2, 10);
        System.out.println(ans2); // -1
    }

    static int linearSearch(
            int[] arr,
            int target,
            int start,
            int end
    ) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
