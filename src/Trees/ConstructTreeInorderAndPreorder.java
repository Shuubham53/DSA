package Trees;


import javax.swing.tree.TreeNode;
import java.util.*;

import Trees.LevelOrderTraversal;

public class ConstructTreeInorderAndPreorder {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    static Map<Integer,Integer> map = new HashMap<>();

    public static Node buildPath(int[] preorder,int preLo,int preHi,int[] inorder,int inLO,int inHi){
        if(preLo > preHi) return null;
        Node root = new Node(preorder[preLo]);
        int indexH = map.get(preorder[preLo]);
        int leftSize = indexH-inLO;
        root.left = buildPath(preorder,preLo+1,preLo+leftSize,inorder,inLO,indexH-1);
        root.right = buildPath(preorder,preLo+leftSize+1,preHi,inorder,indexH+1,inHi);
        return root;
    }
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        int n = inorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        Node root = buildPath(preorder, 0, n - 1, inorder, 0, n - 1);
    }
}