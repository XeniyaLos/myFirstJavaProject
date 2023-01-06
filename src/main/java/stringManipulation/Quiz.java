package stringManipulation;

public class Quiz {
    public static void main(String[] args) {

        String s = "Java String Quiz";
        System.out.println(s.charAt(s.toUpperCase().length()-1)); // z
        System.out.println(s.toUpperCase().charAt(s.length()-1)); // Z

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is:" + s1 == s2);

        char s3 = 'a';
        char s4 = 'a';
        System.out.println("s3 == s4 is:" + (s3 == s4));

        String s5 = "Java"+1+2+"Quiz"+""+(3+4);
        System.out.println(s5);

        String sk = new String("java");
        String sl = new String("JAVA");
        sl = sl.toLowerCase();
        System.out.println(sk = sl);
    }
}
