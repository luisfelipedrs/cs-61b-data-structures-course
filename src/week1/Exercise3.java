package week1;

public class Exercise3 {
    public static void main(String[] args) {

        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};

        System.out.println(max(numbers));

    }

    public static int max(int[] m) {

        int max = 0;

        for (int j : m) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
