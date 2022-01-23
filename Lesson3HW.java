
/**
 * Java1. Homework 3
 *
 * @author Yury Fesechka
 * @version 23.01.2022
 */
import java.util.Arrays;
import java.util.stream.IntStream;

class Lesson3HW {


    public static void main(String[] args) {
        int n = 100;
        System.out.println("Assignment 1");
        invertArray1();
        System.out.println("Assignment 2");
        fillArray();
        System.out.println("Assignment 3");
        changeArray();
        System.out.println("Assignment 4");
        fillDiagonal();
        System.out.println("Assignment 5");
        createAndFillArray(7,3);





    }
    public static void invertArray1() {
        int[] arr1 = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 1 - arr1[i];

        }
        System.out.println(Arrays.toString(arr1));

    }
    public static void fillArray() {
        int[] arr2 = new int[100];
        IntStream.rangeClosed(1, 100).forEach(i -> arr2[i - 1] = i);

        System.out.println(Arrays.toString(arr2));
        }

    public static void changeArray() {
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i]<6) {
                arr3[i]*=2;
            }

        }
        System.out.println(Arrays.toString(arr3));
    }
    public static void fillDiagonal() {
        int[][] arr4 = new int[4][4];
                for (int i = 0; i < arr4.length; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length -1 -i] =1;
        }
        System.out.println(Arrays.deepToString((arr4)));
        System.out.println();
    }
    static void createAndFillArray(int len, int initialValue){
        int[] arr5 = new int[len];
        Arrays.fill(arr5,initialValue);
        System.out.println(Arrays.toString(arr5));
    }



}

