package TreeQuestion_gfg;

// GFG : https://www.geeksforgeeks.org/problems/check-if-subtree/1
//Question :  Check if Subtree or not

public class CheckSubTree {
    public static boolean isSubtree(Node T, Node S) {
        if (S == null || check(T, S)) {
            return true;
        }
        if (T == null) {
            return false;
        }
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
    private static boolean check(Node T, Node S) {
        if (T == null && S == null) {
            return true;
        }
        if (T == null || S == null) {
            return false;
        }
        return (T.data == S.data) && check(T.left, S.left) && check(T.right, S.right);
    }
        public static void main(String[] args) {
            // Example 1
            Node T1 = new Node(1);
            T1.left = new Node(2);
            T1.right = new Node(3);
            T1.right.left = new Node(4);

            Node S1 = new Node(3);
            S1.left = new Node(4);

            System.out.println(isSubtree(T1, S1) ? 1 : 0); // Output: true (1)

            // Example 2
            Node T2 = new Node(26);
            T2.left = new Node(10);
            T2.left.left = new Node(20);
            T2.left.right = new Node(30);
            T2.left.left.left = new Node(40);
            T2.left.left.right = new Node(60);

            Node S2 = new Node(26);
            S2.left = new Node(10);
            S2.left.left = new Node(20);
            S2.left.right = new Node(30);
            S2.left.left.left = new Node(40);
            S2.left.left.right = new Node(60);

            System.out.println(isSubtree(T2, S2) ? 1 : 0);
        }
}
