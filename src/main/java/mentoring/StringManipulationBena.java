package mentoring;

public class StringManipulationBena {
    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));
        countA("hella everyone aaaaa");

    }

    public static String reverseString(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }

    public static void countA(String str){
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                counter++;
            }
        }
        System.out.println(str + " - " + counter);
    }
}
