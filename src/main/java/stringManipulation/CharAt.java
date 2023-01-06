package stringManipulation;

public class CharAt {
    public static void main(String[] args) {

        String name = "Angelina";
        char a = name.charAt(3);
        System.out.println(a); // return us letter 'e', index starts from 0

        String text = "Hello everyone! Hope you are doing well." + "" +
                "I wish you all good luck and at least 120k salary.";
        System.out.println("the number of letters: " + text.length());

        String country = "UAS";
        System.out.println(country + " has " + country.length() + " letters");

        country = "Mexico";
        System.out.println(country + " has " + country.length() + " letters"); // return 6

        country = " Mexico ";
        System.out.println(country + " has " + country.length() + " letters"); // return 8

        country = "Kyrgyzstan";
        System.out.println(country + " has " + country.length() + " letters"); // 13

        System.out.println(country.charAt(0)); // return K
        System.out.println(country.charAt(9)); // return n

        String school = "Harvard";
        String anotherSchool = "Stanford";

        System.out.println(school.charAt(0));

        // find the last letter of word Stanford
        System.out.println(anotherSchool.charAt(anotherSchool.length() - 1)); // returns us 'd'

        String cheers = "Congratiohjofbndkjsbckjdsbvfjhkbfvh";
        System.out.println(cheers.charAt(cheers.length() - 1));
    }
}
