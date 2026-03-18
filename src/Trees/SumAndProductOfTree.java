package Trees;

public class SumAndProductOfTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static int product(Node root){
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
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

        System.out.println("sum of tree is: "+sum(root));
        System.out.println("product of tree is: "+product(root));


    }
}
