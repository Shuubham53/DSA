package Trees;

public class InvertTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }

    public static Node invertTree(Node root){
        if(root == null) return null;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }



    public static void main(String[] args) {
        Node root = new Node(4);
        Node a = new Node(2);
        Node b = new Node(7);
        Node c = new Node(1);
        Node d = new Node(3);
        Node e = new Node(6);
        Node f = new Node(9);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;

        invertTree(root);


    }
}
