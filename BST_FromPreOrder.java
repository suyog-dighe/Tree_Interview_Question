package TreeQuestion_gfg;
import java.util.Stack;

//GFG :  https://www.geeksforgeeks.org/problems/preorder-traversal-and-bst4006/1
// Question : Preorder Traversal and BST
// Check  Can Construct Binary Search Tree From PreOrder Traversal if Yes return 1 if No return 0

public class BST_FromPreOrder {
    public static int canRepresentBST(int arr[], int N) {
        int min = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            if (arr[i] < min) {
                return 0;
            }
            while (!stack.isEmpty() && stack.peek() < arr[i]) {
                min = stack.pop();
            }
            stack.push(arr[i]);
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4};
        int n=3;
        int[] arr2={2,3,1};
        System.out.println(canRepresentBST(arr2,n));
    }
}
