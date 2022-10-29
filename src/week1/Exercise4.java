package week1;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {
    public static void windowPosSum(int[] a, int n) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            if (a[i] < 0) {
                continue;
            }
            for (int j = n; n > 0; j--) {
                if (j > a.length) {
                    break;
                }
                else {
                    sum = a[i] + a[j - a.length];
                }
            }
            list.add(sum);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        //System.out.println(java.util.Arrays.toString(a));
    }
}
