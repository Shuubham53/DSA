package Stack;

public class DesignStackWithIncrementOp {
    private int[] stack;
    private int index = -1;


    public DesignStackWithIncrementOp(int maxSize) {
        stack = new int[maxSize];
    }

    public void push(int x) {
        if(index >= stack.length-1) return;
        else{
            index++;
            stack[index] = x;
        }
    }

    public int pop() {
        if(index >= 0){
            int num = stack[index];
            stack[index] = 0;
            index--;
            return num;
        }
        return -1;
    }

    public void increment(int k, int val) {
        int limit = Math.min(k,index+1);
        for(int i=0; i<limit; i++){
            stack[i] += val;
        }
    }
    public static void main(String[] args) {
        DesignStackWithIncrementOp obj = new DesignStackWithIncrementOp(3);
        obj.push(10);
        obj.push(20);
        obj.increment(1,120);
        obj.increment(2,220);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }
}
