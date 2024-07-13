package TreeQuestion_gfg;
// GFG : https://www.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1
// Question : Maximum sum of Non-adjacent nodes


import java.util.*;
public class MaximumSumof_Non_adjacent_nodes {
   public static int getMaxSum(Node root){
        int[] result= getHelper(root);
        return Math.max(result[0],result[1]);
    }
    public static int[] getHelper(Node node){
       if (node==null){
           return new int[]{0,0};
       }
       int[] left=getHelper(node.left);
       int[] right=getHelper(node.right);

       int i=node.data+left[1]+right[1];
       int e=Math.max(left[0],left[1])+Math.max(right[0],right[1]);

       return new int[]{i,e};
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.right.left=new Node(5);
        root.right.right=new Node(6);
        int node=getMaxSum(root);
        System.out.println(node);


    }
}
