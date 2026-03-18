package Trees;

public class PreInPostTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void  preorderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void  inorderTraversal(Node root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }
    public static void  postorderTraversal(Node root){
        if(root == null) return;
        inorderTraversal(root.left);
        inorderTraversal(root.right);
        System.out.print(root.val+" ");
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
        System.out.print("pre order: ");
        preorderTraversal(root);
        System.out.println();
        System.out.print("in order: ");
        inorderTraversal(root);
        System.out.println();
        System.out.print("post order: ");
        postorderTraversal(root);






    }
}
