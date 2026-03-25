package Trees;

public class LowestCommonAncestor {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

   public static Node lowestCommonAncestor(Node root,Node p,Node q){

        if(root == null) return null;
        if(root == p || root == q) return root;

        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);

        if(left == null) return right;
        else if(right == null) return left;
        else return root;
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

        System.out.println("Lowest common Ancestor: "+lowestCommonAncestor(root,a,d).val);


    }
}
