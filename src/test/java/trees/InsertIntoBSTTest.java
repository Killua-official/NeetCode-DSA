package trees;

public class InsertIntoBSTTest {
    public static void main(String[] args) {
        InsertIntoBST solution = new InsertIntoBST();

        // Test 1: Insert 6 into [5,3,9,1,4,null,null,null,null,null]
        TreeNode root1 = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(1),
                        new TreeNode(4)
                ),
                new TreeNode(9)
        );
        TreeNode result1 = solution.insertIntoBST(root1, 6);
        System.out.println("Test 1 passed: " + (find(result1, 6) != null));

        // Test 2: Insert 9 into [5,3,6,null,4,null,10,null,null,7]
        TreeNode root2 = new TreeNode(5,
                new TreeNode(3,
                        null,
                        new TreeNode(4)
                ),
                new TreeNode(6,
                        null,
                        new TreeNode(10,
                                new TreeNode(7),
                                null
                        )
                )
        );
        TreeNode result2 = solution.insertIntoBST(root2, 9);
        System.out.println("Test 2 passed: " + (find(result2, 9) != null));
    }

    private static TreeNode find(TreeNode root, int val) {
        while (root != null) {
            if (val == root.val) return root;
            root = val < root.val ? root.left : root.right;
        }
        return null;
    }
}

