import java.util.HashMap;
import java.util.Map;

public class HashMapFrequency {
    public static void main(String[] args) {
        int[] values = {2, 3, 2, 5, 3, 2};
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int value : values)
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        System.out.println(frequency);
    }
}
