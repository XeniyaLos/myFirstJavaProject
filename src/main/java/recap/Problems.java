package recap;

import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {

        System.out.println(isPalindrome("madam"));
        System.out.println(ifContains("hello", "mo"));
        System.out.println(countX("hello", "hellohehello"));

        int [] a = {1,2,3};
        int [] b = {7,8,9};
        System.out.println(Arrays.toString(mergeArrays(a, b)));

        System.out.println(countX("hello codewise, how are you.", 'h'));
        System.out.println(reverse("hello"));

        int c = 10;
        int d = 5;

        int temp = c;
        c = d;
        d = temp;
        System.out.println("c = " + c);
        System.out.println("d = " + d);


    }

    public static boolean isPalindrome(String str){
        String temp = "";

        for(int i = str.length(); i > 0; i--){
            temp = temp + str.charAt(i - 1);
            }
        return temp.equals(str);
        }

    public static boolean ifContains(String a, String b){
        if(a.contains(b)){
            return true;
        }else if(b.contains(a)){
            return false;
        }
        return false;
    }


    public static int countX(String x, String y){
        int counter = 0;

        for(int i = 0; i <= y.length() - x.length(); i++){
            if(y.substring(i, i + x.length()).equals(x)){
                counter++;
            }
        }
        return counter;
    }

    public static int [] mergeArrays(int [] a, int [] b) {
//write a code that will return new int array with elements from both a and b arrays
        int[] c = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }

        for(int i = 0; i < b.length; i++){
            c[a.length + i] = b[i];
        }
        return c;
    }

    public static int countX(String str, char x){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == x){
                count++;
            }
        }
        return count;
    }

    public static String reverse(String str){
        String reversed = "";
        for(int i = str.length(); i > 0; i--){
            reversed = reversed + str.charAt(i - 1);
        }
        return reversed;
    }

}



