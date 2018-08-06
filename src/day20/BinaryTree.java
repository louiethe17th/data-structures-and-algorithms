package day20;


import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    protected TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void add(int value) {
        if (this.root == null) {
            this.root = new TreeNode(value);
            return;
        }

        this.add(value, this.root);
    }

    private void add(int value, TreeNode current) {
        if (current.left == null && value <= current.data) {
            current.left = new TreeNode(value);
            return;
        }

        if (current.right == null && value > current.data) {
            current.right = new TreeNode(value);
            return;
        }

        if (value <= current.data) {
            add(value, current.left);
        } else if (value > current.data) {
            add(value, current.right);
        }
    }

    public int min() {
        TreeNode current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;

    }

    public int max() {
        TreeNode current = this.root;
        while (current.right != null) {

            current = current.right;
        }
        return current.data;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    private StringBuilder preOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        builder.append(current.data + "");
        preOrder(builder, current.left);
        preOrder(builder, current.right);

        return builder;
    }

    private StringBuilder inOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }

    private StringBuilder postOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        preOrder(builder, current.left);
        preOrder(builder, current.right);
        builder.append(current.data + " ");

        return builder;
    }

    public boolean contains(int value) {
        return this.contains(value, this.root);
    }

    private boolean contains(int value, TreeNode node) {
        if (node == null) {
            return false;
        }

        if (node.data == value) {
            return true;
        }

        boolean wasOnLeft = contains(value, node.left);
        boolean wasOnRight = contains(value, node.right);
        return wasOnLeft || wasOnRight;
    }

    public int size(TreeNode node) {
        int totalNodes = 0;

        if (node == null) {
            return 0;
        } else {
            totalNodes = (size(node.left) + 1 + size(node.right));
        }
        return totalNodes;
    }

    public boolean isIdentical(TreeNode inputNode) {
        if (this.root == null && inputNode == null) {
            return true;
        }
        if (this.root == null || inputNode == null) {
            return false;
        }

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(this.root);
        queue2.add(inputNode);

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode n1 = queue1.remove();
            TreeNode n2 = queue2.remove();

            if (n1.data != n2.data) {
                return false;
            }
            if (n1.left != null && n2.left != null) {
                queue1.add(n1.left);
                queue2.add(n2.left);

            } else if (n1.left == null || n2.left == null) {
                return false;
            }
            if (n1.right != null && n2.right != null) {
                queue1.add(n1.right);
                queue2.add(n2.right);

            } else if (n1.right == null || n2.right == null) {
                return false;
            }

        }

        return true;

    }

}



