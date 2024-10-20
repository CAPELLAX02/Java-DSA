package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrAsc = { 2, 5, 9, 12, 26, 66, 89, 99 };
        int[] arrDsc = { 99, 89, 66, 26, 12, 9, 5, 2 };

        System.out.println(orderAgnosticBS(arrAsc, 66)); // out: 5
        System.out.println(orderAgnosticBS(arrDsc, 66)); // out: 2
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending order
//        boolean isAsc;
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }

        // isAsc logic shorthand:
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        // return -1 if the target element DNE
        return -1;
    }
}
