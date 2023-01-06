package baiaChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTockens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String [] str = s.split("[, ?.@']+");
        for(String a : str){
            System.out.println(a);
        }
        System.out.println(str.length);

        String strMain ="Welcome to Guru99";
        String[] arrSplit_3 = strMain.split("\\s");
        //for (int i=0; i < arrSplit_3.length; i++){
          //  System.out.println(arrSplit_3[i]);
        //}
        System.out.println(Arrays.toString(arrSplit_3));
        System.out.println(arrSplit_3.length);

    }
}
