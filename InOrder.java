package TreeQuestion_gfg;
import java.util.ArrayList;
// GFG : https://www.geeksforgeeks.org/problems/inorder-traversal-iterative/1
// Question : Inorder Traversal (Iterative)
// Inorder Means :-  Left --> Root Node --> Right
class Node{
    int data;
    Node left,right;
    Node(int item){
        this.data=item;
        left=right=null;
    }
}
public class InOrder {
    public static ArrayList<Integer> InOrderTraversal(Node root){
        ArrayList<Integer> list=new ArrayList<>();
        inorder(root,list);
        return list;
    }
    private static void inorder(Node node, ArrayList<Integer> list){
        if (node==null){
            return;
        }
        inorder(node.left,list);
        list.add(node.data);
        inorder(node.right,list);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        ArrayList<Integer> result = InOrderTraversal(root);
        System.out.println(result);
    }
}
