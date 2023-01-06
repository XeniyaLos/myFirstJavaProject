package baiaChallenges;

public class IsPalindrome {
    public static void main(String[] args) {

    }
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
}
