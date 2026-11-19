import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] values = {12, 7, 19, 4, 10};
        System.out.println("Array: " + Arrays.toString(values));
        System.out.print("Elements: ");
        for (int value : values) System.out.print(value + " ");
        System.out.println();
    }
}
