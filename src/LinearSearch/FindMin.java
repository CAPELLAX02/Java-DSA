package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, -13, 2, 13, 20};
        int ans = min(arr);
        System.out.println(ans); // -13
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
