package TreeQuestion_gfg;

public class Search_inBST {
    public static Node searchBST(Node node,int val){
        if (node ==null || node.data==val){
            return node;
        }
        if(node.data>val){
            return searchBST(node.left,val);
        }
        return searchBST(node.right,val);
    }
    public static void main(String[] args) {
        Node root= new Node(4);
        root.left=new Node(2);
        root.right=new Node(7);
        root.left.left=new Node(1);
        root.left.right=new Node(3);

        int val=2;
        Node node=searchBST(root,val);
        if (node != null) {
            System.out.println("Node found with value " + node.data);
        } else {
            System.out.println("Node not found with value " + val);
        }

    }
}
