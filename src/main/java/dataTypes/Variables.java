package dataTypes;

public class Variables {
    public static void main (String [] args){
        System.out.println("My name is Xeniya");

        byte a = 12;
        //System.out.println(a);

        byte b = 127;
        //System.out.println("First value of b: " + b);

        b = 23;
        //System.out.println("Second value of b: " + b);

        // ------ Variable: short -------//
        // ------ range from -32768 to 32767 ----//

        short youngAge = 18;
        //System.out.println("My age is " + youngAge);

        youngAge = -32768; //reassigning the value of youngAge
        youngAge = 125;    // reassigning the value of youngAge one more time
        //System.out.println("New age is: " + youngAge);

        //----- Variable int -----//

        int transactionId = 24758586;
        System.out.println("Transaction ID is:" + transactionId);

        transactionId = 345436546;
        System.out.println("New transaction ID is: " + transactionId);

        int bankAccount = 111222334;
        System.out.println("Bank account: " + bankAccount);

        //
        short myShort = 12323;
        byte myByte = 2;
        int myInt = -45434335;
        long myLong = 835657688;

        System.out.println("My short: " + myShort);
        System.out.println("My byte: " + myByte);
        System.out.println("My int: " + myInt);
        System.out.println("My long: " + myLong);

        //----- float -----//

        float degreeCelsius = 32.1234567f; // f (in the end of a number - stands for float)
        System.out.println("Degree Celsius: " + degreeCelsius);

        double degreeFahrenheit = 3242.465476578678687678;
        System.out.println("Degree Fahrenheit: " + degreeFahrenheit);

        // ----- boolean -----//

        boolean isLegal = true;
        System.out.println(isLegal);
        isLegal = false;
        System.out.println("Second boolean value: " + isLegal);

        //---- char ----//

        char letter = 't';
        char digit = '4';
        char specCharacter = '%';
        System.out.println("char letter: " + letter);
        System.out.println("char digit: " + digit);
        System.out.println("char special character: " + specCharacter);

        char num = 'a';
        char newNum = 'c';
        System.out.println(num + newNum);

        //------ String (always from upper letter) -----//

        String name = "Hello";
        System.out.println("String name is: " + name);

        String firstName = "Xeniya";
        String lastName = "Loskutova";
        System.out.println(firstName + " " + lastName);

        int age = 33;
        String city = "Buffalo Grove";
        System.out.println("Hello my name is " + firstName + " " + lastName + ". I am " + age + " years old");
        System.out.println("And I'm from " + city + ". ");

        byte myByte1 = 12;
        int myInt1 = 23;
        double myDouble1 = 8989;

        String myName1 = "Xeniya";
        String myCity1 = "Chicago";

        System.out.println(myByte1 + myInt1);
        System.out.println("Hi " + myByte1 + " Here is my int " + myInt1);
        System.out.println(myByte1 + " " + myInt1);
        System.out.println("" + myByte1 + myInt1);

    }
}
