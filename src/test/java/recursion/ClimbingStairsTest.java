package recursion;

public class ClimbingStairsTest {
    public static void main(String[] args) {
        ClimbingStairs solution = new ClimbingStairs();

        System.out.println("n = 2: " + solution.climbStairs(2));
        System.out.println("n = 3: " + solution.climbStairs(3));
        System.out.println("n = 5: " + solution.climbStairs(5));
        System.out.println("n = 45: " + solution.climbStairs(45));
    }
}
