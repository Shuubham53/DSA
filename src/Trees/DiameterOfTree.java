package Trees;

public class DiameterOfTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int ans = 0;
    public static int diameterTree(Node root){
        if(root == null) return 0;
        int leftHeight = diameterTree(root.left);
        int rightHeight = diameterTree(root.right);
        ans = Math.max(ans,leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        diameterTree(root);
        System.out.println("diameter of a tree: "+ans);


    }
}
