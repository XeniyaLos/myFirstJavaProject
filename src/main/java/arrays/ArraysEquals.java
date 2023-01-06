package arrays;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        int [] arr2 = {1, 2, 3, 4, 5};
        int [] arr3 = {1, 2, 3, 4, 5, 6};

        boolean b = Arrays.equals(arr, arr2); // true
        System.out.println(b);

        System.out.println(Arrays.equals(arr, arr3)); // false

        String [] strArr1 = {"hello"};
        String [] strArr2 = {"bye"};
        System.out.println(Arrays.equals(strArr1, strArr2)); // false

        char [] charArr1 = {'a', 'b', 'c'};
        char [] charArr2 = {'a', 'b', 'c'};
        System.out.println(Arrays.equals(charArr1, charArr2)); // true

    }
}
