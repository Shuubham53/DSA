package BinarySeachTree;

public class ConvertToGreaterTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void reverseInorder(Node root,int[] sum){
        if(root == null) return;
        reverseInorder(root.right,sum);
        root.val = root.val + sum[0];
        sum[0] = root.val;
        reverseInorder(root.left,sum);
    }
    public static Node convertBST(Node root) {
        int[] sum = new int[1];
        reverseInorder(root,sum);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(9);
        Node d = new Node(14);


        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
       convertBST(root);



    }
}
