public class SecondLargest {
    static int secondLargest(int[] a) {
        if (a.length < 2) throw new IllegalArgumentException("Need at least two values");
        Integer largest = null, second = null;
        for (int x : a) {
            if (largest == null || x > largest) {
                second = largest;
                largest = x;
            } else if (x < largest && (second == null || x > second)) {
                second = x;
            }
        }
        if (second == null) throw new IllegalArgumentException("No distinct second-largest value");
        return second;
    }

    public static void main(String[] args) {
        int[] a = {14, 8, 22, 22, 17, 5};
        System.out.println("Second largest: " + secondLargest(a));
    }
}
