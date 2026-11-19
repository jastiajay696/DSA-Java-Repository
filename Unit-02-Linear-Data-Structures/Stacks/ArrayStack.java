import java.util.Arrays;

public class ArrayStack {
    private final int[] data;
    private int top = -1;

    ArrayStack(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("Capacity must be positive");
        data = new int[capacity];
    }
    void push(int value) {
        if (top == data.length - 1) throw new IllegalStateException("Stack overflow");
        data[++top] = value;
    }
    int pop() {
        if (top == -1) throw new IllegalStateException("Stack underflow");
        return data[top--];
    }
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10); stack.push(20); stack.push(30);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Remaining: " + Arrays.toString(Arrays.copyOf(stack.data, stack.top + 1)));
    }
}
