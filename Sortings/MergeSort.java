
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = { 7, 8, 2, 5, 6, 1 };

        mergesort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void mergesort(int[] a, int s, int e) {
        if (s < e) {
            int m = s + (e - s) / 2;
            mergesort(a, s, m);
            mergesort(a, m + 1, e);
            merge(a, s, m, e);
        }
    }

    static void merge(int[] a, int s, int m, int e) {
        int[] temp = new int[e - s + 1];
        int i = s;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= e) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= m) {
            temp[k++] = a[i++];
        }
        while (j <= e) {
            temp[k++] = a[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            a[s + l] = temp[l];
        }c
    }
}
