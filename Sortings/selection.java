// package Sortings;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int a[] = { 1, 6, 2, 4, 7, 8 };
        slectionSort(a);
    }

    static void slectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int max = 0;
            int last = a.length - i - 1;
            for (int j = 0; j < a.length - i; j++) {
                if (a[max] < a[j]) {
                    max = j;

                }

            }
            int temp = a[max];
            a[max] = a[last];
            a[last] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

}
