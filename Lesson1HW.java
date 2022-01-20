/**
 * Java1. Homework 1
 *
 * @author Yury Fesechka
 * @version 17.01.2022
 */
class Lesson1HW {
    private static int a;
    private static int b;

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSign() {
        int a = 3;
        int b = 5;

        if (a + b >= 0) {
            System.out.println("Sum is Positive!");
        }
        if (a + b < 0) {
            System.out.println("Sum is Negative");
        }
    }

    public static void printColor() {
        int value = 87;

        if (value > 0) {
            System.out.println("Red");
        } else if (value > 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 27;
        int b = -21;

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }


}
