public class Main {
    private static int a;
    private static int b;

    public static void main(String[] args) {
        PrintThreeWords();
       CheckSumSign();
       PrintColor();
       CompareNumbers();

    }
    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void CheckSumSign() {
        int a = 3;
        int b = 5;

        if (a + b >= 0) {
            System.out.println("Sum is Positive!");
        }
        if (a + b < 0) {
            System.out.println("Sum is Negative");
        }
    }
    public static void PrintColor() {
        int value = 87;

        if (value > 0) {
            System.out.println("Red");
        } else if (value > 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
    public static void CompareNumbers() {
        int a = 27;
        int b = -21;

        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }



}
