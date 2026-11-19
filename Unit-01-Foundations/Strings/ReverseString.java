public class ReverseString {
    static String reverse(String input) {
        char[] chars = input.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverse("DataStructures"));
    }
}
