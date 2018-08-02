package day18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumValueTest {

    @Test
    void findMaxInTree() {
        BinaryTree tree = new BinaryTree();
        tree.add(21);
        tree.add(12);
        tree.add(56);
        tree.add(10);
        tree.add(1);
        tree.add(3);
        tree.add(75);
        tree.add(5);

        assertEquals(75, MaximumValue.findMaxInTree(tree.root));

    }

    @Test
    void findMaxInTreeEmpty() {
        BinaryTree tree = new BinaryTree();


        assertEquals(0, MaximumValue.findMaxInTree(tree.root));

    }

    @Test
    void findMaxInTree2() {
        BinaryTree tree = new BinaryTree();
        tree.add(21);
        tree.add(2345);
        tree.add(34);
        tree.add(999);
        tree.add(3);
        tree.add(3);
        tree.add(76);
        tree.add(6);

        assertEquals(2345, MaximumValue.findMaxInTree(tree.root));

    }
}