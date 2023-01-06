package wrapperClass;

public class WrapperClass {
    public static void main(String[] args) {

        int age = 35;
        char letter = 's';

        // Wrapper class Autoboxing
        Integer i = age;
        Character c = letter;
        System.out.println(c);

        // Unboxing
        int ageP = i;
        char letterP = c;
        System.out.println(ageP);
        System.out.println(letterP);

        // ====================
        char cc = '9';
        System.out.println(Character.isDigit(cc)); // true


        System.out.println(validatePassword("546546ghgj"));
        digitInString("hello2023");
        numbersInString("12345hello");

    }

    public static boolean validatePassword(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static void digitInString(String str){
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                str1 += str.charAt(i);
            }
        }
        int r = Integer.parseInt(str1);
        System.out.println(r);
        System.out.println("Is it a number data type? - " + (r > 10));
    }

    public static int numbersInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Numbers in:" + str + ": " + count);
        return count;
    }
}

