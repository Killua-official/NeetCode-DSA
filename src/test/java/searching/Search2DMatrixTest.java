package searching;

public class Search2DMatrixTest {

    public static void main(String[] args) {
        Search2DMatrix solution = new Search2DMatrix();

        int[][] matrix1 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target1 = 3;
        System.out.println("Test 1: " + solution.searchMatrix(matrix1, target1)); // true

        int[][] matrix2 = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target2 = 13;
        System.out.println("Test 2: " + solution.searchMatrix(matrix2, target2)); // false

        int[][] matrix3 = {
                {1}
        };
        int target3 = 1;
        System.out.println("Test 3: " + solution.searchMatrix(matrix3, target3)); // true

        int[][] matrix4 = {
                {1},
                {3}
        };
        int target4 = 3;
        System.out.println("Test 4: " + solution.searchMatrix(matrix4, target4)); // true
    }
}
