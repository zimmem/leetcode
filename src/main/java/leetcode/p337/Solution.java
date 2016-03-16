package leetcode.p337;

import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int x) {
 * val = x; } }
 */
public class Solution {
    Map<TreeNode, Integer> steels = new HashMap<TreeNode, Integer>();
    Map<TreeNode, Integer> notSteels = new HashMap<TreeNode, Integer>();

    public int rob(TreeNode root) {
        return Math.max(steelCurrent(root), notSteelCurrent(root));
    }

    public int steelCurrent(TreeNode root) {
        if(root == null ) return 0;
        
        if(steels.get(root) !=null ){
            return steels.get(root).intValue();
        }else{
            
            int val =  notSteelCurrent(root.left) + notSteelCurrent(root.right) + root.val;
            steels.put(root, val);
            return val;
        }
    }

    public int notSteelCurrent(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        if(notSteels.get(root)!=null){
            return notSteels.get(root).intValue();
        }else{
            int val = rob(root.left) + rob(root.right);
            notSteels.put(root, val);
            return val;
        }
    }
    
    static TreeNode  root = new TreeNode(3);
    
    
    public static void main(String[] args) {
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right=new TreeNode(3);
        root.right.right=new TreeNode(1);
        Solution solution = new Solution();
        System.out.println(solution.rob(root));

        System.out.println(solution.steels.get(root.left.right));
        System.out.println(solution.notSteels.get(root.left.right));
        System.out.println(solution.steels.get(root.left));
        System.out.println(solution.notSteels.get(root.left));
        System.out.println(solution.steels.get(root.right));
        System.out.println(solution.notSteels.get(root.right));
        System.out.println(solution.steels.get(root));
        System.out.println(solution.notSteels.get(root));
        
    }

    public static class TreeNode {

        int      val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    
}
