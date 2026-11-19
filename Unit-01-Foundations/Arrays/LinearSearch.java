public class LinearSearch {
    static int search(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {8, 3, 12, 5, 9};
        int target = 12;
        int index = search(values, target);
        System.out.println(index == -1 ? "Not found" : "Found at index " + index);
    }
}
