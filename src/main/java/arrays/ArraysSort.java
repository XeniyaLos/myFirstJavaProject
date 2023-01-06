package arrays;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {

        String  [] strArray = {"banana", "orange", "apple", "kiwi"};
        Arrays.sort(strArray); // sorts array in ascending order
        System.out.println(Arrays.toString(strArray)); // apple banana kiwi orange

        double [] doubleArr = new double[]{3, 7.5, 7.1, 9, 0, 3.12};
        System.out.println(Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println(Arrays.toString(doubleArr));

        byte [] byteArr = {0, 1, 2, 3, 4, 5, 6};
        System.out.println("original: " + Arrays.toString(byteArr));
        Arrays.sort(byteArr);
        System.out.println("sorted" + Arrays.toString(byteArr));

        short [] shortArr = {01, 1324, 234, 354, 424};
        System.out.println("original: " + Arrays.toString(shortArr));
        Arrays.sort(shortArr);
        System.out.println("sorted" + Arrays.toString(shortArr));

        int [] intArr = {345634, 1235, 2235, 36345, 42456, 53256};
        System.out.println("original: " + Arrays.toString(intArr));
        Arrays.sort(intArr);
        System.out.println("sorted" + Arrays.toString(intArr));

        long [] longArr = {64564526, 13245234, 3454534, 3345, 43, 54, 6};
        System.out.println("original: " + Arrays.toString(longArr));
        Arrays.sort(longArr);
        System.out.println("sorted" + Arrays.toString(longArr));

        float [] floatArr = {0.5f, 1.34f, 1.456f, 1.6765f, 4.3f, 5.6f};
        System.out.println("original: " + Arrays.toString(floatArr));
        Arrays.sort(floatArr);
        System.out.println("sorted" + Arrays.toString(floatArr));

        double [] doubleArray = {0.46346, 0.45, 2.99, 2.89, 1.77, 5, 6};
        System.out.println("original: " + Arrays.toString(doubleArr));
        Arrays.sort(doubleArr);
        System.out.println("sorted" + Arrays.toString(doubleArr));

        char [] charArr = {'0', 'g', '@', 'r', 'a'};
        System.out.println("original: " + Arrays.toString(charArr));
        Arrays.sort(charArr);
        System.out.println("sorted" + Arrays.toString(charArr));

        String [] stringArr = {"cat", "apple", "frog"};
        System.out.println("original: " + Arrays.toString(stringArr));
        Arrays.sort(stringArr);
        System.out.println("sorted" + Arrays.toString(stringArr));


    }
}
