package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int ans = linearSearch(nums, 19);
        System.out.println(ans); // 5 (found at 5th index)
        int ans2 = linearSearch(nums, 25);
        System.out.println(ans2); // -1 (not found)
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target) {
                return index;
            }
        }

        return -1;
    }
}
