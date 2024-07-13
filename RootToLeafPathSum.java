package TreeQuestion_gfg;

public class RootToLeafPathSum {
    public static boolean hasPath(Node root, int target){
        if (root==null){
            return false;
        }
        if (root.left==null && root.right==null){
            return target==root.data;
        }
        target -=root.data;
        return hasPath(root.left,target) || hasPath(root.right,target);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
//        root.right = new Node(3);
        System.out.println(hasPath(root,3));
    }
}
