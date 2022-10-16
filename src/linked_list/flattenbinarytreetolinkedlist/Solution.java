package linked_list.flattenbinarytreetolinkedlist;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static TreeNode previous = null;

    public static void main(String[] args) {


        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(5);
        head.left.left = new TreeNode(3);
        head.left.right = new TreeNode(4);
        head.right.right = new TreeNode(6);
        print(head);
      //  flatten(head);
        //print(head);
    }


    //////////////////////
    //o(n),O(1)
    public void flatten(TreeNode root) {
        // Handle the null scenario
        if (root == null) {
            return;
        }
        TreeNode node = root;
        while (node != null) {

            // If the node has a left child
            if (node.left != null) {
                // Find the rightmost node
                TreeNode rightmost = node.left;
                while (rightmost.right != null) {
                    rightmost = rightmost.right;
                }

                // rewire the connections
                rightmost.right = node.right;
                node.right = node.left;
                node.left = null;
            }
            // move on to the right side of the tree

            node = node.right;
        }
    }
    /// //o(n),O(n) because of recursion
    public static void flatten2(TreeNode root) {
        if (root == null)
            return;
        flatten2(root.right);
        flatten2(root.left);
        root.right = previous;
        root.left = null;
        previous = root;

    }

    static void print(TreeNode root) {
        if (root == null)
            return;
        print(root.left);//after using flatten() in
                       // left will return because left is null

        print(root.right);
        System.out.println(root.val);
    }
}
