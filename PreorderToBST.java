package TreeQuestion_gfg;

// GFG : https://www.geeksforgeeks.org/problems/preorder-to-postorder4423/1
// Question :  Preorder to BST

public class PreorderToBST {
    public static Node constructBST(int[] preorder){
        return bst(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public static Node bst(int[] pre,int bound,int[] a){
        if(a[0]==pre.length || pre[a[0]]> bound){
            return null;
        }
        Node root= new Node(pre[a[0]++]);
        root.left=bst(pre,root.data,a);
        root.right=bst(pre,bound,a);
        return root;
    }
    public static void printPreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
    public static void main(String[] args) {
        int[] arr = {40, 30, 35, 80, 100};
        Node root = constructBST(arr);
        printPreOrder(root);

    }
}
