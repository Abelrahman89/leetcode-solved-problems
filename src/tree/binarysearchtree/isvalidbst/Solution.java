package tree.binarysearchtree.isvalidbst;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);
        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(TreeNode root) {
       return isValid(root,null,null);

    }

    private static boolean isValid(TreeNode root, Integer low, Integer high) {
        if(root==null)
            return true;
        if((low!=null && low>=root.val) ||(high !=null && high<=root.val))
                return false;
        return isValid(root.left,low, root.val)&& isValid(root.right,root.val,high);

    }

    public static boolean isValidBSTold(TreeNode root) {
        if (root == null)
            return true;

        if ((root.left != null && root.left.val >= root.val) || (root.right != null && root.right.val <= root.val))
            return false;
        TreeNode left = root.left;
        TreeNode right = root.right;
        return isValidBST(left) && isValidBST(right);

    }
}
