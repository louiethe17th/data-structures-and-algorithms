package day18;

public class MaximumValue {


    public static int findMaxInTree(TreeNode node){

        int res;
        int left, right;
        int max = 0;

        if(node != null){
            res = node.data;

            left = findMaxInTree(node.left);
            right = findMaxInTree(node.right);

            if(left > right){
                max = left;
            } else{
                max = right;
            }

            if(res > max){
                max = res;
            }


        }

        return max;


    }



}
