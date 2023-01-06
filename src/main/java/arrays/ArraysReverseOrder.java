package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysReverseOrder {
    public static void main(String[] args) {

        Integer [] intArr = {5, 6, 3, 0, 1, 2};
        Arrays.sort(intArr);
        System.out.println("ascending order: " + Arrays.toString(intArr)); // return string sorting in ascending order
        Arrays.sort(intArr, Collections.reverseOrder());
        System.out.println("descending order: " + Arrays.toString(intArr));

        String [] strArr = {"0", "hello", "buy", "thanks"};
        Arrays.sort(strArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(strArr));

        Character [] charArr = {'s', 'f', 'a', 'b'};
        Arrays.sort(charArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(charArr));

        Double [] doubleArr = {0.99, 3.99, 2.99, 4.99};
        Arrays.sort(doubleArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(doubleArr));

        int [] arr1 = {4, 5, 45, 43, 56, 235};
        sortedArr(arr1);
        sortedArr(new int []{46, 345, 3, 6, 2, 7});

        reverseOrder(new Integer[]{2, 43, 53, 1, 54, 78});
        String [] str1 = {"my", "new", "a", "clock"};
        sortString(str1);

        reverseString(new String[] {"b", "or", "code" , "hi"});

    }

    public static int [] sortedArr(int [] intArray){
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        return intArray;
    }

    public static Integer [] reverseOrder(Integer [] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static String [] sortString(String [] str){
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        return str;
    }

    public static String [] reverseString(String [] arr){
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
