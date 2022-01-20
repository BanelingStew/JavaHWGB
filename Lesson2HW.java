/** Java1. Homework 2
 *
 * @author Yury Fesechka
 * @version 17.01.2022
 */
public class Lesson2HW {
    public static void main(String[] args) {

        System.out.println(between10and20(5, 16));
        isPositiveorNegative(-21);
        System.out.println(checkNumSign(345));
        polarityCheck(5);


    }

    public static boolean between10and20(int x1, int x2) {
        int sum = x1 + x2;
        return sum <= 20;
    }

    public static boolean checkNumSign(int z) {
        if (z > 0) {
           return true;
        } else {
            return false;
        }
    }

    public static void isPositiveorNegative(int x) {
        if (x < 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }

    public static void polarityCheck(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("Polarity");
        }

    }
}