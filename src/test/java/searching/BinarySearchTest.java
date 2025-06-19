package searching;

public class BinarySearchTest {

    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();

        int[] nums1 = {-1, 0, 3, 5, 9, 12};
        int target1 = 9;
        System.out.println("Test 1: " + solution.search(nums1, target1)); // Expected: 4

        int[] nums2 = {-1, 0, 3, 5, 9, 12};
        int target2 = 2;
        System.out.println("Test 2: " + solution.search(nums2, target2)); // Expected: -1

        int[] nums3 = {5};
        int target3 = 5;
        System.out.println("Test 3: " + solution.search(nums3, target3)); // Expected: 0

        int[] nums4 = {5};
        int target4 = -5;
        System.out.println("Test 4: " + solution.search(nums4, target4)); // Expected: -1
    }
}
