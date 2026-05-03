package BinarySeachTree;

public class RangeSum {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int rangeSumBST(Node root, int low, int high) {
        if(root == null) return 0;
        int sum = 0;
        if(root.val >= low && root.val <= high){
            sum += root.val;
        }
        if(root.val > low){
            sum += rangeSumBST(root.left,low ,high);
        }
        if(root.val < high){
            sum += rangeSumBST(root.right,low ,high);
        }
        return sum;
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
        System.out.println( rangeSumBST(root,3,10));




    }
}
