package CycleSort;

/**
 * This sort method is a pattern for some questions.
 * It's frequently used when 1...n or 0...n elements are given unsorted
 *
 * Contrary to bubble, selection, or insertion sorts (these are O(n^2) in worst case),
 * cycle sort's worst case time complexity is O(n).
 */
public class CycleSortBasics {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };
        cycleSort(arr);
        printArray(arr); // 1 2 3 4 5
    }

    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                // Swap the elements
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
