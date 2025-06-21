package searching;

public class FirstBadVersionTest {

    public static void main(String[] args) {
        FirstBadVersion solution = new FirstBadVersion();

        // Test case 1
        solution.setBadVersion(4);
        System.out.println("Test 1: " + (solution.firstBadVersion(5) == 4));

        // Test case 2
        solution.setBadVersion(1);
        System.out.println("Test 2: " + (solution.firstBadVersion(1) == 1));

        // Test case 3
        solution.setBadVersion(7);
        System.out.println("Test 3: " + (solution.firstBadVersion(10) == 7));
        // Test case 4
        solution.setBadVersion(2);
        System.out.println("Test 4: " + (solution.firstBadVersion(2) == 2));
    }
}
