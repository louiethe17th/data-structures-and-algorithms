package day19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void isIdentical() {
        BinaryTree tree1 = new BinaryTree();
        tree1.add(21);
        tree1.add(12);
        tree1.add(56);
        tree1.add(10);
        tree1.add(1);
        tree1.add(3);
        tree1.add(75);
        tree1.add(5);

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
        System.out.println(tree1.toString());

        boolean results = tree.isIdentical(tree1.root);

        assertEquals(true, results);


    }

    @Test
    void isIdenticalEmpty() {
        BinaryTree tree1 = new BinaryTree();


        BinaryTree tree = new BinaryTree();



        boolean results = tree.isIdentical(tree1.root);

        assertEquals(true, results);


    }

    @Test
    void isIdenticalEmptyOneEmpty() {
        BinaryTree tree1 = new BinaryTree();


        BinaryTree tree = new BinaryTree();
        tree.add(21);
        tree.add(12);
        tree.add(56);
        tree.add(10);


        boolean results = tree.isIdentical(tree1.root);

        assertEquals(false, results);


    }


}