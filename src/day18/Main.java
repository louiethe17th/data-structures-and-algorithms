package day18;


public class Main {

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


        MaximumValue.findMaxInTree(tree.root);

    }

}
