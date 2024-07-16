
// s
import java.util.Arrays;

public class insertion {

    public static void main(String[] args) {

        int a[] = { 7, 6, 8, 3, 2, 2 };
        insertionSort(a);

    }

    static void insertionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j] > a[i]) {
                    break;
                } else {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }

            }

        }
        System.out.println(Arrays.toString(a));

    }
}
