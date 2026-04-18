package BinarySeachTree;

public class LowestCommonAncestor {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static Node lowestCommonAncestor(Node root,Node p, Node q) {
        while(root != null){
            if(p.val < root.val && q.val < root.val){
                root = root.left;
            }
            else if(p.val > root.val && q.val > root.val){
                root = root.right;
            }
            else return root;
        }
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(9);


        Node p = c;
        Node q = d;

        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;

        System.out.println("lowest common ancestor in bst: "+lowestCommonAncestor(root,p,q).val);



    }
}
