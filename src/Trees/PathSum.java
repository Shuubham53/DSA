package Trees;

public class PathSum {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static boolean pathSum(Node root,int targetSum){
        if(root == null) return false;
        targetSum = targetSum - root.val;
        if(root.left == null && root.right == null){
            if(targetSum == 0) return true;
        }
        return pathSum(root.left,targetSum) || pathSum(root.right,targetSum);

    }



    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(2);
        Node e = new Node(0);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        System.out.println(pathSum(root, 9));


    }
}
