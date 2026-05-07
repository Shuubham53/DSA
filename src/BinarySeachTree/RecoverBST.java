package BinarySeachTree;

public class RecoverBST {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static Node prev;
    public static Node first = null;
    public static Node last = null;
    public static Node middle = null;

    public static void recoverBst(Node root){
        if(root == null) return;
        recoverBst(root.left);
        if(prev != null && prev.val > root.val){
            // 1st violation or 1st swapped number found
            if(first == null){
                first = prev;
                middle = root;
            }else{ // 2nd violation
                last = root;
            }
        }
        prev = root;
        recoverBst(root.right);

    }


    public static void  inorderTraversal(Node root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }


    public static void main(String[] args) {
        Node root = new Node(6);

        Node a = new Node(3);
        Node b = new Node(4); // should be 9
        Node c = new Node(1);
        Node d = new Node(9); // should be 4
        Node e = new Node(13);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.right = e;
        inorderTraversal(root);


        prev = new Node(Integer.MIN_VALUE); // we are comparing with root.val

        recoverBst(root);
        if(first != null && last != null){ //  if the swapped nodes are not  adjacent
            int temp = first.val;;
            first.val = last.val;
            last.val = temp;
        }else if(first != null && middle != null){ // if the swapped nodes are  adjacent
            int temp = first.val;;
            first.val = middle.val;
            middle.val = temp;
        }

        System.out.println();
        inorderTraversal(root);




    }
}
