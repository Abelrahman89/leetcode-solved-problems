package tree.maxDepth;

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftCount = 0, rightCount = 0;
        leftCount += maxDepth(root.left) + 1;
        rightCount += maxDepth(root.right) + 1;
        return Math.max(leftCount, rightCount);


    }
}