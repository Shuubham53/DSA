package BinarySeachTree;

public class FloorOfBST {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int helper(Node root,int x, int floor){
        if(root == null) return floor;
        if(root.val == x){
            floor = root.val;
            return floor;
        }
        if(root.val < x){
            floor = root.val;
            return helper(root.right,x,floor);
        }
        else return helper(root.left,x,floor);
    }
    public static int findFloor(Node root, int x) {
        int floor = -1;
        return helper(root,x,floor);

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
        System.out.println("Floor of BST : "+findFloor(root,5));



    }
}
