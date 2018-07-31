package day16;

import day16.TreeNode;

public  class FizzBuzzBinaryTree {

    TreeNode root = null;

    public static String FizzBuzzTree (TreeNode current) {


        while (current != null) {
            //Move left if there is a node
            if(current.left != null) {
                FizzBuzzTree(current.left);
            }
            //mode right if there is a node
            if (current.right != null) {
                FizzBuzzTree(current.right);
            }
            //checks to see if value is fizz or buzz or fizzbuzz
            fizzyBoi(current.data);
        }
        return null;
    }

    public static void fizzyBoi(int value) {

        if(value % 3 == 0 && value % 5 == 0) {
            System.out.println(value + " FizzBuzz");
        } else if (value % 3 == 0) {
            System.out.println(value + " Fizz");
        } else if (value % 5 == 0) {
            System.out.println(value + " Buzz");
        }
    }
}