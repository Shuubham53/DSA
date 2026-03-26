package Trees;

public class SumRootToLeaf {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static int sum(Node root,int sum){
        if(root == null) return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null){
            return sum;
        }
        return sum(root.left,sum)+ sum(root.right,sum);

    }
    public static int sumNumbers(Node root){
        return sum(root,0);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);

        root.left = a;
        root.right = b;

        System.out.println("Sum of leaf to node is : "+sumNumbers(root));

    }
}
