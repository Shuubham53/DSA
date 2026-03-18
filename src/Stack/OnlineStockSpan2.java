package Stack;

import java.util.Stack;

public class OnlineStockSpan2 {
    public class Pair{
        int price;
        int span;
        public Pair(int price,int span){
            this.span = span;
            this.price = price;
        }
    }
    Stack<Pair> st = new Stack<>();
    public OnlineStockSpan2() {

    }

    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek().price <= price){
            span += st.pop().span;
        }
        st.push(new Pair(price,span));
        return span;
    }

    public static void main(String[] args) {
        OnlineStockSpan2 obj = new OnlineStockSpan2();
        int s1 = obj.next(100);
        int s2 = obj.next(80);
        int s3 = obj.next(90);
        int s4 = obj.next(120);
        System.out.print(s1+" ");
        System.out.print(s2+" ");
        System.out.print(s3+" ");
        System.out.print(s4);
    }
}
