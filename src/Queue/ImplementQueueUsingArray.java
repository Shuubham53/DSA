package Queue;

public class ImplementQueueUsingArray {
    public static class Queue{
        private int[] arr = new int[10];
        private int size = 0;
        private int front = 0;
        private int rear = 0;

        public void add(int val){
            if(rear == arr.length-1){
                System.out.println("Queue is full cannot add");
                return;
            }

            arr[rear] = val;
            rear++;
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is empty cannot remove");
                return -1;
            }
            int value = arr[front];
            front++;
            size--;
            return value;
        }
        public int peek(){
            return arr[front];
        }
        public void display(){
            for(int i=front; i<rear;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public int size(){
            return size;
        }


    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(7);
        System.out.println(queue.size());
        queue.display();
        queue.remove();
        System.out.println(queue.size());
        queue.display();
    }
}
