package Trees;

public class FlattenBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public void flatten(Node root){
        if(root == null) return;
        Node curr = root;
        while (curr != null){
            if(curr.left != null){
                Node temp = curr.left;
                while(temp.right != null) temp = temp.right;
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;


    }
}
