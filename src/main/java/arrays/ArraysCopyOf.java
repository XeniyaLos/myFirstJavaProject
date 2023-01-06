package arrays;

import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args) {

        int [] intArr = {1,2,3,4,5};
        int [] intArr2 = intArr; // using same object, but 2 references, both pointing to the same object
        System.out.println(intArr[0]); // 1
        System.out.println(intArr2[0]); // 1

        intArr2[0] = 10;
        System.out.println(intArr[0]); // 10

        String [] strArr1 = {"hello", "hi"};
        String [] strArr2 = Arrays.copyOf(strArr1, strArr1.length);
        strArr2[0] = "bye bye";
        System.out.println(Arrays.toString(strArr2)); // [bye bye, hi]
    }
}
