package TreeQuestion_gfg;

import java.util.ArrayList;

public class Ancestors_in_BT {
    public static ArrayList<Integer> ancestors(Node root,int target){
        ArrayList<Integer> list= new ArrayList<>();
        find(root,target,list);
        return list;
    }
    public static boolean find(Node node,int target,ArrayList<Integer> list){
        if (node==null){
            return false;
        }
        if (node.data==target){
            return true;
        }
        if (find(node.left,target,list) || find(node.right,target,list)){
            list.add(node.data);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        root.left.left.left = new Node(7); // Node 7 as per the example

        int target = 7;
        ArrayList<Integer> ancestors = ancestors(root, target);
        System.out.println(ancestors);
    }
}
