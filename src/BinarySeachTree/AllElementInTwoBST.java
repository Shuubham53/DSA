package BinarySeachTree;

import Trees.PreInPostTraversal;

import java.util.ArrayList;
import java.util.List;

public class AllElementInTwoBST {

    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    public  static List<Integer> merge(List<Integer> list1 , List<Integer> list2){
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i <= list1.size()-1 && j <= list2.size()-1){
            if(list1.get(i) < list2.get(j)){
                ans.add(list1.get(i));
                i++;
            }else{
                ans.add(list2.get(j));
                j++;
            }
        }
        if (i == list1.size() && j <= list2.size()-1) {
            while(j <= list2.size()-1){
                ans.add(list2.get(j));
                j++;
            }
        } else if (i <= list1.size()-1 && j == list2.size()) {
            while(i <= list1.size()-1){
                ans.add(list1.get(i));
                i++;
            }
        }
        return ans;
    }
    public static void inorder(Node root , List<Integer> list){
        if(root == null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);

    }

    public static List<Integer> getAllElements(Node root1, Node root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inorder(root1,list1);
        inorder(root2,list2);
        List<Integer> ans = merge(list1,list2);
        return ans;
    }



    public static void main(String[] args) {
        Node rootA = new Node(2);
        Node a1 = new Node(1);
        Node b1 = new Node(3);
        Node c1 = new Node(4);
        rootA.left = a1;
        rootA.right = b1;
        b1.right = c1;

        Node rootB = new Node(2);
        Node a2 = new Node(1);
        Node b2 = new Node(3);
        Node c2 = new Node(4);
        rootB.left = a2;
        rootB.right = b2;
        b2.right = c2;
        List<Integer> ans = getAllElements(rootA,rootB);
        System.out.println(ans);








    }


}


