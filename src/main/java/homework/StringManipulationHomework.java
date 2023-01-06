package homework;

public class StringManipulationHomework {
    public static void main(String[] args) {

        String message = "Hello everyone, Let's do Java String exercises";

        int index = 10;

        System.out.println("1. The character at position 10 is: " + message.charAt(index));
        System.out.println("2. The length of the String is: " + message.length());
        System.out.println("3. The String message all in upperCase: " + message.toUpperCase());
        System.out.println("4. The String message all in lowerCase: " + message.toLowerCase());
        System.out.println("5. The character at position 5 is: " + message.charAt(4));
        System.out.println("6. Last character of the String is: " + message.charAt(message.length() - 1));
        System.out.println("7. First letter in lowerCase: " + message.toLowerCase().charAt(0));
        System.out.println("8. Last letter in upperCase: " + message.toUpperCase().charAt(message.length() - 1));

        // ---- Second part of the homework ---- //

        String hello1 = "Hello World!";
        String hello2 = "Hello world!";
        String hello3 = new String("HelloWorld!");
        boolean isSame;

        isSame = hello1.equals(hello2);
        System.out.println("1. Is values are same: Hello World = Hello world? " + isSame);

        isSame = hello1.equals(hello3);
        System.out.println("2. Is values are same: Hello World = HelloWorld? " + isSame);

        isSame = hello1 == hello2;
        System.out.println("3. Compare if 2 objects are the same? " + isSame);

        isSame = hello1.equalsIgnoreCase(hello2);
        System.out.println("4. Make it be true: " + isSame);

        isSame = hello1.toLowerCase() == hello2.toLowerCase(); // false coz after String manipulations reference number changed
        System.out.println("5. Convert hello1 and hello2 to lowerCase and compare: " + isSame);
        System.out.println(isSame);

        isSame = hello1.toLowerCase().equals(hello2.toLowerCase());
        System.out.println("5. Convert hello1 and hello2 to lowerCase and compare: " + isSame); // treated same as equalsIgnoreCase()

    }
}
