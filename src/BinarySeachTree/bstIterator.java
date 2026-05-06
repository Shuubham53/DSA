package BinarySeachTree;

import java.util.Stack;

public class bstIterator {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }
    static Stack<Node> st = new Stack<>();

    static class BSTIterator{

        BSTIterator(Node root){
            pushAll(root);
        }

        static int next(){
            Node node = st.pop();
            pushAll(node.right);
            return (int)node.val;
        }

        static boolean hasNext(){
            return !st.isEmpty();
        }
        public static void  pushAll(Node node){
            while(node != null){
                st.push(node);
                node = node.left;
            }
        }
    }
}
