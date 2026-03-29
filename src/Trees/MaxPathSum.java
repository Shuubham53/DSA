package Trees;

public class MaxPathSum {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int ans = 0;
    public static int MaxPathSum(Node root){
        if(root == null) return 0;
        int leftMax = MaxPathSum(root.left);
        int rightMax = MaxPathSum(root.right);
        ans = Math.max(ans,leftMax+rightMax+root.val);
        return Math.max(leftMax,rightMax)+root.val;
    }

    public static void main(String[] args) {
        Node root = new Node(0);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        root.left = a;


        root.right = b;
        a.left = c;
        a.right = d;
        MaxPathSum(root);
        System.out.println("max path of a tree: "+ans);


    }
}
