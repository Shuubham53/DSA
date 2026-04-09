package BinarySeachTree;

public class CeilOfBST {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int helper(Node root,int x, int ceil){
        if(root == null) return ceil;
        if(root.val == x){
            ceil = root.val;
            return ceil;
        }
        if(root.val > x){
            ceil = root.val;
            return helper(root.left,x,ceil);
        }
        else return helper(root.right,x,ceil);
    }
    public static int findFloor(Node root, int x) {
        int ceil = -1;
        return helper(root,x,ceil);

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
        System.out.println("Ceil of BST : "+findFloor(root,11));



    }
}
