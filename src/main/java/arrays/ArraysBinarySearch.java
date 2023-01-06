package arrays;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String[] args) {

        String [] strArr = {"chicago", "la", "san francisco", "ny"};
        int index = Arrays.binarySearch(strArr, "la");
        System.out.println(index);
    }
}
