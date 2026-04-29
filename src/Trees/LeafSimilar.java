package Trees;

import java.util.ArrayList;

public class LeafSimilar {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void preorder(Node root,ArrayList<Integer> arr){
        if(root == null) return;
        if(root.left == null && root.right == null) arr.add(root.val);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }

    private static boolean isLeafSimilar(Node rootA, Node rootB) {
        ArrayList<Integer> tree1 = new ArrayList<>();
        ArrayList<Integer> tree2 = new ArrayList<>();
        preorder(rootA,tree1);
        preorder(rootB,tree2);
        if(tree1.size() != tree2.size())return false;
        for(int i=0; i<tree1.size();i++){
            if(!tree1.get(i).equals(tree2.get(i))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Node rootA = new Node(1);
        Node a1 = new Node(2);
        Node b1 = new Node(3);
        rootA.left = a1;
        rootA.right = b1;

        Node rootB = new Node(2);
        Node a2 = new Node(2);
        Node b2 = new Node(3);
        rootB.left = a2;
        rootB.right = b2;

         ;

        System.out.println((isLeafSimilar(rootA,rootB)) ? "similar leaf" : "not similar leaf");






    }


}


