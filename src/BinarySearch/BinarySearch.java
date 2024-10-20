package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        // Array should be sorted to perform binary search
        int[] arr = {-15, -8, 2, 3, 5, 10, 12, 19, 22, 39, 44, 51};

        System.out.println(binarySearch(arr, 5)); // out: 4
        System.out.println(binarySearch(arr, 24)); // out: -1 (DNE)
        System.out.println(binarySearch(arr, 44)); // out: 10
    }

    // function to return the index of the target element if exists
    static int binarySearch(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;

        while (startIndex <= endIndex) {
            // find the middle element
            int midIndex = startIndex + (endIndex - startIndex) / 2;

            if (target < arr[midIndex]) {
                endIndex = midIndex - 1;
            } else if (target > arr[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                return midIndex;
            }
        }

        // return -1 if the target element DNE
        return -1;
    }
}
