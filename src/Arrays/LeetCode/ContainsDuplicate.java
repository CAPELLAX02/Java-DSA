package Arrays.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * LeetCode 217: Contains Duplicate
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums1)); // true
        System.out.println(containsDuplicate2(nums1)); // true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums2)); // false
        System.out.println(containsDuplicate2(nums2)); // false

        int[] nums3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums3)); // true
        System.out.println(containsDuplicate2(nums3)); // true
    }

    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums)
            set.add(num);

        return set.size() != nums.length;
    }

    static boolean containsDuplicate2(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            if (freq.containsKey(num) && freq.get(num) >= 1) {
                return true;
            }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return false;
    }
}
