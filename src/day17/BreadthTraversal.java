package day17;


import java.util.LinkedList;
import java.util.Queue;

public class BreadthTraversal {

    public static void breadthTraversal(TreeNode root){
        Queue<TreeNode> queueTreeNode = new LinkedList<TreeNode>();
        if(root == null){
            System.out.println("Tree empty");
            return;
        }

        queueTreeNode.add(root);
        while(!queueTreeNode.isEmpty()){
            TreeNode n = (TreeNode) queueTreeNode.remove();
            System.out.print(" " + n.data);
            if (n.left != null){
                queueTreeNode.add(n.left);
            }
            if(n.right != null){
                queueTreeNode.add(n.right);
            }

        }


    }

}
