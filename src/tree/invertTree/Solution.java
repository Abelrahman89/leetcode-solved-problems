package tree.invertTree;

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode result = new TreeNode(root.val);
        result.left = invertTree(root.right);
        result.val = root.val;
        result.right = invertTree(root.left);
        return result;
    }
}