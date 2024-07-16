import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        int a[] = { 1, 3, 6, 2, 8, 2 };
        bubblesort(a);

    }

    static void bubblesort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int k = 0;
            for (int j = 1; j < a.length - i; j++) {
                if (a[k] > a[j]) {
                    int temp = a[k];
                    a[k] = a[j];
                    a[j] = temp;
                }
                k++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}