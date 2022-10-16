package tree.diameterOfBinaryTree;

class Solution {
    int result = -1;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return result;
    }

    public int dfs(TreeNode root) {
        if (root == null) return -1;
        int leftCount = 0, rightCount = 0;
        leftCount += dfs(root.left) + 1;
        rightCount += dfs(root.right) + 1;
        result = Math.max(result, (leftCount + rightCount));
        return Math.max(leftCount, rightCount);
    }

}
