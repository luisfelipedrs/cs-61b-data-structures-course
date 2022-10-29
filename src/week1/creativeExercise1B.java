package week1;

public class creativeExercise1B {
    public static void main(String[] args) {

        drawTriangle(10);

    }

    public static void drawTriangle(int n) {

        String star = "*";

        for (int i = 1; i <= n; i++) {
            System.out.println(star);
            star += "*";
        }
    }
}
