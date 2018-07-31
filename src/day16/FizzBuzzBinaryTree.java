package day16;

public class FizzBuzzBinaryTree {

    public static void FizzBuzzTree (TreeNode current) {


        if (current != null) {
            FizzBuzzTree(current.left);
            FizzBuzzTree(current.right);
            fizzyBoi(current.data);
        }
    }

    public static void fizzyBoi(int value) {

        if(value % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (value % 3 == 0) {
            System.out.println("Fizz");
        } else if (value % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(value);
        }
    }
}