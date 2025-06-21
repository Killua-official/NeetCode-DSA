package trees;

public class SearchBSTTest {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)
                ),
                new TreeNode(7)
        );

        SearchBST solution = new SearchBST();

        TreeNode result = solution.searchBST(root, 2);
        if (result != null && result.val == 2) {
            System.out.println("Test 1 passed");
        } else {
            System.out.println("Test 1 failed");
        }

        TreeNode result2 = solution.searchBST(root, 5);
        if (result2 == null) {
            System.out.println("Test 2 passed");
        } else {
            System.out.println("Test 2 failed");
        }
    }
}

