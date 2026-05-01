package Trees;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }


    public static List<Integer> inorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
        Node curr = root;

        while(curr != null){
            if(curr.left != null){
                Node pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                }else if(pred.right == curr){
                    list.add(curr.val);
                    pred.right = null;
                    curr = curr.right;
                }
            }else{
                list.add(curr.val);
                curr = curr.right;
            }
        }
        return list;
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

        inorderTraversal(root);





    }
}
