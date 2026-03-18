package Trees;

public class SameTree {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private static boolean isSame(Node rootA, Node rootB) {
        if(rootA == null && rootB == null) return true;
        if(rootA == null || rootB == null) return false;
        if(rootA.val != rootB.val) return false;

        return isSame(rootA.left,rootB.left) && isSame(rootA.right,rootB.right);
    }

    public static void main(String[] args) {
        Node rootA = new Node(1);
        Node a1 = new Node(2);
        Node b1 = new Node(3);
        rootA.left = a1;
        rootA.right = b1;

        Node rootB = new Node(1);
        Node a2 = new Node(3);
        Node b2 = new Node(3);
        rootB.left = a2;
        rootB.right = b2;

         ;

        System.out.println((isSame(rootA,rootB)) ? "same tree" : "not same tree");






    }


}


