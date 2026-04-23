package BinarySeachTree;

public class InsertElement {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public void helper(Node root,int val){
        if(root == null) return;
        if(root.val < val){
            if(root.right == null) root.right = new Node(val);
            else helper(root.right,val);
        }else{
            if(root.left == null) root.left = new Node(val);
            else helper(root.left,val);
        }

    }
    public Node insertIntoBST(Node root, int val) {
        if(root == null) return new Node(val);
        helper(root,val);
        return root;
    }


    public static void main(String[] args) {
        Node root = new Node(6);
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(9);
        int val = 7;

        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;


    }
}
