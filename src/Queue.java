public class Queue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int  size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(long j){
        rear++;
        queArray[rear] =j;

    }
}
