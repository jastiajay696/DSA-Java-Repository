public class StringPalindrome {
    static boolean isPalindrome(String text) {
        String s = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "Never odd or even";
        System.out.println(input + " -> " + isPalindrome(input));
    }
}
