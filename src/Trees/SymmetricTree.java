package Trees;

public class SymmetricTree {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private static boolean isSymmetric(Node rootA, Node rootB) {
        if(rootA == null && rootB == null) return true;
        if(rootA == null || rootB == null) return false;
        if(rootA.val != rootB.val) return false;

        return isSymmetric(rootA.left,rootB.right) && isSymmetric(rootA.right,rootB.left);
    }

    public static void main(String[] args) {
        Node rootA = new Node(1);
        Node a1 = new Node(2);
        Node b1 = new Node(3);
        Node c1 = new Node(4);
        rootA.left = a1;
        rootA.right = b1;
        b1.left = c1;

        Node rootB = new Node(1);
        Node a2 = new Node(2);
        Node b2 = new Node(3);
        Node c2 = new Node(4);
        rootB.left = b2;
        rootB.right = a2;
        b2.right = c2;

        System.out.println((isSymmetric(rootA,rootB)) ? "same tree" : "not same tree");






    }


}


