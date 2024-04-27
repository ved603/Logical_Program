package Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class Missing_Number {

    public static void main(String[] args) {
        int[] a = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }

        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (!list.contains(i)) {
                System.out.println("The Missing Element is : " +a[i]);
            }
        }
    }
}



