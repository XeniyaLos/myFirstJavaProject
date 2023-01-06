package arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {

        int [] arr = {2, 4, 5, 8, 9, 10};
        containsX(arr, 12);

        containX2(arr, 5);

    }

    /*
    which takes array of int and another int x, if arr contains x -> return true
    else -> false
     */

    public static boolean containsX(int [] array, int x){
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public static boolean containX2(int [] arr, int x){
        String str = Arrays.toString(arr);
        if(str.contains(x + "")){
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}
