package trees;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        TreeNode cur = root;
        while (true) {
            if (val > cur.val) {
                if (cur.right == null) {
                    cur.right = new TreeNode(val);
                    return root;
                }
                cur = cur.right;
            } else {
                if (cur.left == null) {
                    cur.left = new TreeNode(val);
                    return root;
                }
                cur = cur.left;
            }
        }
    }
}

