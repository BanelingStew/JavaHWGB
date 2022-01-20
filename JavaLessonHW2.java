public class Main2 {
    public static void main(String[] args) {

        System.out.println(Between10and20(5, 16));

        IsPositiveorNegative(-21);
        PolarityCheck(5);

    }

    public static boolean Between10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void IsPositiveorNegative(int x) {
        if (x < 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }
    }

    public static void PolarityCheck(int x) {
        for (int i =0; i<x; i++) {
            System.out.println("Polarity");
        }

    }
}