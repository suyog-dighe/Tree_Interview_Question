package TreeQuestion_gfg;

import java.util.ArrayList;
import java.util.List;

// GFG : https://www.geeksforgeeks.org/problems/postorder-traversal-iterative/1
//Question : Postorder Traversal (Iterative)
// Post Order Means Left-> Right-> Root node
public class PostOrder {
    public static List<Integer> postOrderTraversal(Node root){
        List<Integer> result= new ArrayList<>();
        postorder(root,result);
        return result;
    }
    public static void postorder(Node node, List<Integer> result){
        if (node==null){
            return;
        }
        postorder(node.left,result);
        postorder(node.right,result);
        result.add(node.data);
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        List<Integer> list= postOrderTraversal(root);
        System.out.println(list);
    }
}
