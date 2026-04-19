package BinarySeachTree;

import Trees.PreInPostTraversal;

import java.util.ArrayList;

public class DeleteNode {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public Node deleteNode(Node root, int key) {
        if(root == null) return null;
        if(root.val > key){
            root.left = deleteNode(root.left,key);
        }
        else if(root.val < key){
            root.right = deleteNode(root.right,key);
        }
        else{
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            Node successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right,successor.val);

        }
        return root;
    }

    public Node findMin(Node node){
        while(node.left != null){
            node = node.left;
        }
        return node;
    }
    public static void  preorderTraversal(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(6);
        Node a = new Node(2);
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(9);


        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
       DeleteNode obj = new DeleteNode();
       obj.deleteNode(root,8);
       preorderTraversal(root);

    }
}
