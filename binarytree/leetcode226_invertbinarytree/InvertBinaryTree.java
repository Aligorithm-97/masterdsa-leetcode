package binarytree.leetcode226_invertbinarytree;
import java.util.LinkedList;
import java.util.Queue;

import static binarytree.BinaryTreeUtils.TreeNode;
public class InvertBinaryTree {

    public TreeNode invertTreeBFS(TreeNode root) {
        if (root == null) {}
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        InvertBinaryTree invertBinaryTree = new InvertBinaryTree();
    }
}
