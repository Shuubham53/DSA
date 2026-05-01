package BinarySeachTree;

public class MinDifferenceBetweenNodes {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public static void traversal(Node root,int[] min ,Node[] prev){
        if(root == null) return;
        traversal(root.left,min,prev);
        if(prev[0] == null) prev[0] = root;
        else if(prev[0] != null){
            int diff = Math.abs(root.val - prev[0].val);
            min[0] = Math.min(diff,min[0]);
        }
        prev[0] = root;
        traversal(root.right,min,prev);
    }
    public static int minDiffInBST(Node root) {
        int[] min = new int[1];
        min[0] = Integer.MAX_VALUE;
        Node[] prev = new Node[1];
        traversal(root,min,prev);
        return min[0];
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        Node a = new Node(2);
        Node b = new Node(10);
        Node c = new Node(9);
        Node d = new Node(14);


        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        System.out.println("minimum difference between nodes are : "+ minDiffInBST(root));




    }
}
