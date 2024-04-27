package Arrays;
import java.util.*;
public class Maximum_SubArray {
    public static int[] sort(int[] a) {
        int smallest = 0;
        for (int i = 0; i < a.length; i++) {
            smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = {4, 5, 1, 7, 8, 6, 9, 2, 3};
        int[] arr = sort(a);
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
                i++;
            }
        }
        System.out.println(sum);
    }
}
