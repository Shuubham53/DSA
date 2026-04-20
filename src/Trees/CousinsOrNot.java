package Trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CousinsOrNot {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static boolean isCousins(Node root,int x,int y){
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelSize = q.size();
            Node parentX = null, parentY = null;
            while(levelSize != 0){
                Node curr = q.remove();
                if(curr.left != null){
                    if(curr.left.val == x) parentX = curr;
                    if(curr.left.val == y) parentY = curr;
                    q.add(curr.left);
                }
                if(curr.right != null){
                    if(curr.right.val == x) parentX = curr;
                    if(curr.right.val == y) parentY = curr;
                    q.add(curr.right);
                }
                levelSize--;
            }
            if(parentX != null && parentY != null){
                return parentX != parentY;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        int x = 5;
        int y = 6;

        System.out.println(isCousins(root,x,y) ? "They are Cousins" : "They are Not Cousins");




    }
}
