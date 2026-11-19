import java.util.Arrays;

public class MergeSort {
    static void sort(int[] a, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sort(a, left, mid);
        sort(a, mid + 1, right);
        merge(a, left, mid, right);
    }
    static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right)
            temp[k++] = a[i] <= a[j] ? a[i++] : a[j++];
        while (i <= mid) temp[k++] = a[i++];
        while (j <= right) temp[k++] = a[j++];
        System.arraycopy(temp, 0, a, left, temp.length);
    }
    public static void main(String[] args) {
        int[] a = {9, 4, 7, 3, 10, 5};
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
