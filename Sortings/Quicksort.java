// package Sortings;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {

        int a[] = { 7, 6, 8, 3, 2, 2 };
        quick(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    static void quick(int[] a, int s, int e) {
        if (s < e) {
            int p = partitionIndex(a, s, e);
            quick(a, s, p - 1);
            quick(a, p, e);
        }
    }

    static int partitionIndex(int[] a, int s, int e) {
        int m = (s + e) / 2;
        int p = a[m];
        while (s <= e) {
            while (a[s] < p) {
                s++;
            }
            while (a[e] > p) {
                e--;
            }
            if (s <= e) {
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
        }
        return s;
    }

}
