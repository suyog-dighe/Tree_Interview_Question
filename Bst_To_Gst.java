package BinarySearchTree;

/*
//Binary Search tree to greater sum tree

//Leetcode :1038. Binary Search Tree to Greater Sum Tree
//  https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/

//LeetCode : 538. Convert BST to Greater Tree
// https://leetcode.com/problems/convert-bst-to-greater-tree/description/
 */

import java.util.LinkedList;
import java.util.Queue;

 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Bst_To_Gst {
    public static int sum = 0;

    // Method to convert BST to Greater Sum Tree
    public static TreeNode convertBST(TreeNode root){
        reverseInOrder(root);
        return root;
    }

    // Helper method for reverse in-order traversal
    public static void reverseInOrder(TreeNode node){
        if (node == null) {
            return;
        }
        reverseInOrder(node.right);
        sum += node.val;
        node.val = sum;
        reverseInOrder(node.left);
    }

    // Method to build the tree from input string
    public static TreeNode buildTree(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }

        String[] values = input.split(",");
        if (values.length == 0 || values[0].equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < values.length) {
            TreeNode current = queue.poll();

            if (!values[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(values[i]));
                queue.add(current.left);
            }
            i++;

            if (i < values.length && !values[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(values[i]));
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    // Main method for testing
    public static void main(String[] args) {
        String input = "4,1,6,0,2,5,7,null,null,null,3,null,null,null,8";
        TreeNode root = buildTree(input);
        root = convertBST(root);

        // Print the tree in level order to verify the result
        printLevelOrder(root);
    }

    // Helper method to print the tree in level order (for testing)
    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                System.out.print(node.val + " ");
                queue.add(node.left);
                queue.add(node.right);
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();
    }
}
