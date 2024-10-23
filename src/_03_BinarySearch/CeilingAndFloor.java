package _03_BinarySearch;

public class CeilingAndFloor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 20, 24, 30, 31};
        // indices:  0  1  2  3   4   5   6   7   8   9  10

        System.out.println(ceiling(arr, 13)); // 4
        System.out.println(ceiling(arr, 14)); // 4
        System.out.println(ceiling(arr, 15)); // 5

        System.out.println(floor(arr, 19)); // 6
        System.out.println(floor(arr, 20)); // 7
        System.out.println(floor(arr, 21)); // 7
    }

    /*
    function to return the index of the smallest element
    that is greater than or equal to the target element
     */
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // if target is out of bounds
        if (target < arr[start] || target > arr[end]) {
            return -1;
        }

        // Classical binary search logic here, nothing more
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // return the 'start' index instead of '-1'
        return start;
    }

    /*
    function to return the index of the greatest element
    that is smaller than or equal to the target element.
     */
    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // if target is out of bounds
        if (target < arr[start] || target > arr[end]) {
            return -1;
        }

        // Classical binary search logic here, nothing more
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // return the 'end' index instead of '-1'
        return end;
    }
}
