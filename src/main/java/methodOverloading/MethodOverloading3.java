package methodOverloading;

import java.util.Arrays;

public class MethodOverloading3 {
    public static void main(String[] args) {

        isPalindrome("madam");
        isPalindrome("hello");
        isPalindrome("madam",  "hello");

        String [] arr = {"civic", "madam", "mom", "level", "lol"};
        String [] arr1 = {"me", "he", "she"};

        System.out.println("Checking palindrome");

        System.out.println(isPalindrome(arr));
        System.out.println(isPalindrome(arr1));

        for(int i = 0; i < 10; i++){
            System.out.println("* ");
        }

    }
    /*
    create a method, which will find if the word is polindrom
    take String and if palindrom return true
    else return false
     */

    public static boolean isPalindrome(String str){
        String strReversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            strReversed = strReversed + str.charAt(i);
        }
        if(str.equals(strReversed)){
            //System.out.println(true);
            return true;
        }
        //System.out.println(false);
        return false;
    }

    public static boolean isPalindrome(String str, String str1){
        System.out.println(str.equals(str1));
        return str.equals(str1);
    }

    public static boolean isPalindrome(String[] arr){
        for(int i = 0; i < arr.length; i++){
            if(!isPalindrome(arr[i])){
                return false;
            }
        }
        return true;
    }
}
