package day16;

import day16.TreeNode;

public  class FizzBuzzBinaryTree {


    public static String FizzBuzzTree (TreeNode current) {


        if (current != null) {
            FizzBuzzTree(current.left);
            FizzBuzzTree(current.right);
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