package day20;

public class FlipBinaryTree {

    public static TreeNode flipTree(TreeNode node) {

        if (node != null) {
            TreeNode tempNode = node.left;
            node.left = node.right;
            node.right = tempNode;

            if (node.left != null) {
                flipTree(node.left);
            }
            if (node.right != null) {
                flipTree(node.right);
            }
        }

        return node;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(21);
        tree.add(12);
        tree.add(56);
        tree.add(10);
        tree.add(1);
        tree.add(3);
        tree.add(75);
        tree.add(5);

        System.out.println(tree.toString());
        flipTree(tree.root);
        System.out.println(tree.toString());

    }
}
