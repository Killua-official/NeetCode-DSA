package sorting;

import java.util.Arrays;

public class SortColorsTest {

    public static void main(String[] args) {
        SortColors solution = new SortColors();

        int[] nums1 = {2, 0, 2, 1, 1, 0};
        solution.sortColors(nums1);
        System.out.println("Test 1: " + Arrays.toString(nums1)); // [0, 0, 1, 1, 2, 2]

        int[] nums2 = {2, 0, 1};
        solution.sortColors(nums2);
        System.out.println("Test 2: " + Arrays.toString(nums2)); // [0, 1, 2]

        int[] nums3 = {0};
        solution.sortColors(nums3);
        System.out.println("Test 3: " + Arrays.toString(nums3)); // [0]

        int[] nums4 = {1};
        solution.sortColors(nums4);
        System.out.println("Test 4: " + Arrays.toString(nums4)); // [1]
    }
}
