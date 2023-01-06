package stringManipulation;

public class IndexOf {
    public static void main(String[] args) {

        String str = "abcdefg";
        System.out.println(str.charAt(3));

        // ---- .indexOf(); ---- //
        System.out.println(str.indexOf('c'));
        int index = str.indexOf('g');

        // ---- what if String has 2 or more same letters ---- //
        String str2 = "abcaccdeelaab";
        System.out.println(str2 + ": " + str2.indent('a'));
        int index2 = str2.indexOf('b', 5); // it will start looking from position 5, not searching from the begginnig

        str2.indexOf('c');
        int i = str2.indexOf("dee"); // takes String and return us only the index of FIRST letter
        System.out.println("index of dee: " + i);

        // ----- .isEmpty(); ---- //
        String str3 = "";
        System.out.println("is the string empty: " + str2.isEmpty()); // false
        System.out.println("is the string empty: " + str3.isEmpty()); // true
        System.out.println((str2 = str3).isEmpty()); // true


        // ------------------------- //
        String state = "Connecticut";

        System.out.println(state.indexOf('o')); // 1
        System.out.println(state.indexOf("ti")); // 6
        System.out.println(state.indexOf('u', state.length()) / 2); // 13


        String city = "New York";
        System.out.println(city.charAt(3));


    }
}
