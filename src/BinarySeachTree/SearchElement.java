package BinarySeachTree;

public class SearchElement {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static boolean search(Node root, int key) {
        if(root == null) return false;
        if(root.val == key) return true;
        if(root.val < key){
            return search(root.right,key);
        }else{
           return search(root.left,key);
        }

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
        System.out.println(search(root,val) ? "FOUND" : "NOT FOUND");


    }
}
