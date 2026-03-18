package Trees;

public class MaxAndMinOfTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        return Math.max(root.val, Math.max(leftMax,rightMax));
    }
    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int leftMin = min(root.left);
        int rightMin = min(root.right);
        return Math.min(root.val, Math.min(leftMin,rightMin));
    }


    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(6);
        Node d = new Node(5);
        Node e = new Node(11);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;

        System.out.println("max of tree is: "+max(root));
        System.out.println("min of tree is: "+min(root));


    }
}
