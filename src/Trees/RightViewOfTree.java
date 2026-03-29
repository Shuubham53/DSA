package Trees;

import java.util.ArrayList;
import java.util.List;

public class RightViewOfTree {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    public static void rightView(Node root,List<Integer> ans,int level){
        if(root == null) return;

        if(ans.size() == level){
            ans.add(root.val);
        }
        rightView(root.right, ans, level+1);
        rightView(root.left, ans, level+1);
    }


    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(6);
        Node d = new Node(5);
        Node e = new Node(11);
        Node f = new Node(8);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;
        d.left = f;

        List<Integer> ans = new ArrayList<>();
        rightView(root,ans,0);
        System.out.println(ans);


    }
}
