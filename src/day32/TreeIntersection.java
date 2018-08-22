package day32;

import day16.TreeNode;

import java.util.*;
  //*******************************************\\
 //**WORKED WITH BRANDO BOI ON THIS WHITEBOARD**\\
//***********************************************\\
public class TreeIntersection {

    public static Set findMatches(TreeNode treeA, TreeNode treeB) {
        Set<Integer> sA = new HashSet<>();
        Set<Integer> sB = new HashSet<>();
        depthFirstSearch(sA, treeA);
        depthFirstSearch(sB, treeB);

        System.out.println("Tree A: " + sA);
        System.out.println("Tree B: " + sB);
        sA.retainAll(sB);
        return sA;
    }

    private static Set depthFirstSearch(Set set, TreeNode current) {
        if (current == null) {
            return set;
        }
        depthFirstSearch(set, current.left);
        set.add(current.data);
        depthFirstSearch(set, current.right);

        return set;
    }
}