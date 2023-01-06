package arrays;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {

        String [] strArray = {"good", "morning", "everyone"};
        System.out.println(Arrays.toString(strArray));

        int [] intArray = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(intArray));

        byte [] byteArr = {11, 21, 3, 45, 34};
        System.out.println(Arrays.toString(byteArr));

        short [] shortArr = {24, 564, 4234, 0};
        System.out.println(Arrays.toString(shortArr));

        int [] intArr = {3452, 5464536, 2341234};
        System.out.println(Arrays.toString(intArr));

        long [] longArr = {345234543, 45243545, 5635675, 31534514};
        System.out.println(Arrays.toString(longArr));

        float [] floatArr = {(float) 123.424, (float) 235.454, (float) 5345.34223};
        System.out.println(Arrays.toString(floatArr));

        double [] doubleArr = {2.999, 3.999, 45.87978};
        System.out.println(Arrays.toString(doubleArr));

        char [] charArr = {'h', 'e', 'l', 'l', 'o', '%'};
        System.out.println(Arrays.toString(charArr));

        boolean [] booleanArr = {true, false, true, true};
        System.out.println(Arrays.toString(booleanArr));

        String [] stringArr = {"I", "love", "USA", null};
        System.out.println(Arrays.toString(stringArr));
    }
}
