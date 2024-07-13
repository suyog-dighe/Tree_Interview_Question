package TreeQuestion_gfg;
import java.util.ArrayList;
import java.util.List;
//GFG :  https://www.geeksforgeeks.org/problems/preorder-traversal-iterative/1
//Question : Preorder traversal (Iterative)
// PreOrder means Root Node--> Left--> Right
public class PreOrder {
    public static List<Integer> preOrderTraversal(Node root){
        List<Integer> list= new ArrayList<>();
        preorder(root,list);
        return list;
    }
    public static void preorder( Node node,List<Integer> list){
        if (node==null){
            return;
        }
        //using recursion call
        list.add(node.data);
        preorder(node.left,list);
        preorder(node.right,list);
    }
    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        List<Integer> list=preOrderTraversal(root);
        System.out.println(list);

    }
}
