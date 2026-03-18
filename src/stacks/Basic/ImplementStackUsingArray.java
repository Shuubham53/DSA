package stacks.Basic;

public class ImplementStackUsingArray {

    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int val){
            if(idx == arr.length){
                System.out.println("stack is full cannot push value");
            }
            arr[idx] = val;
            idx++;
        }
        void display(){
            for(int i = 0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
        }
        int pop(){
            if(idx == 0){
                System.out.println("stack is empty cannot pop element");
                return -1;
            }
            int top = arr[idx];
            arr[idx] = 0;
            idx--;

            return top;
        }
        int peek(){
           return arr[idx-1];
        }

        int size(){
            return idx;
        }
        int remainingCapacity(){
            if((arr.length-idx) < 0){
                System.out.println("capacity is full");
                return -1;
            }
            return arr.length-idx;
        }
        boolean isEmpty(){
            return idx == 0;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(32);
        st.push(18);
        st.push(5);
        st.display();
        System.out.println();
        st.pop();
        st.pop();
        st.display();
        System.out.println();
        System.out.println(st.isEmpty());

    }
}
