package methodOverloading;

import java.util.Arrays;

public class PracticeOverloadingArrays {
    public static void main(String[] args) {

        int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6};
        System.out.println(Arrays.toString(rotate(arr1, "left")));
        System.out.println(Arrays.toString(rotate(arr2, "right")));
        System.out.println(Arrays.toString(rotate(arr2, "down")));

        System.out.println(Arrays.toString(rotate(arr2, "left", false)));
        System.out.println(Arrays.toString(rotate(arr2, "down", true)));

        System.out.println(reverse("hello"));

    }

    /*
    create a rotate() method which takes
    array of ints
    and String rotate

    if rotate = left: 1,2,3 -> 2,3,1
    if rotate = right: 1,2,3 -> 3,2,1
     */

    public static int [] rotate(int [] arr, String rotate){
        if(rotate.equals("left")){
            int [] arr1 = {arr[1], arr[2], arr[0]};
            return arr1;
        }else if(rotate.equals("right")){
            int [] arr1 = {arr[2], arr[1], arr[0]};
            return arr1;
        }
        return arr;
    }

    public static int [] rotate(int [] arr, String rotate, boolean goRotate){
        if(goRotate == true) {
            if (rotate.equals("left")) {
                int[] arr1 = {arr[1], arr[2], arr[0]};
                return arr1;
            } else if (rotate.equals("right")) {
                int[] arr1 = {arr[2], arr[1], arr[0]};
                return arr1;
            }
        }
        return arr;
    }
    /*
    takes string and returns reverse String
     */
    public static String reverse(String str){
        String str1 = "";
        for(int i = str.length(); i > 0; i--){
            str1 = str1 + str.charAt(i - 1);
        }
        return str1;
    }

    public static String reverse(String str, boolean isTrue){
        String str1 = "";
        if(isTrue) {
            for (int i = str.length(); i > 0; i--) {
                str1 = str1 + str.charAt(i - 1);
            }
        }
        return str1;
    }
}
