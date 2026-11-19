public class CircularQueue {
    private final int[] data;
    private int front = 0, rear = 0, size = 0;

    CircularQueue(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        data = new int[capacity];
    }
    void offer(int value) {
        if (size == data.length) throw new IllegalStateException("Queue is full");
        data[rear] = value;
        rear = (rear + 1) % data.length;
        size++;
    }
    int poll() {
        if (size == 0) throw new IllegalStateException("Queue is empty");
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.offer(4); q.offer(8); q.offer(12);
        System.out.println(q.poll());
        q.offer(16);
        System.out.println(q.poll() + ", " + q.poll() + ", " + q.poll());
    }
}
