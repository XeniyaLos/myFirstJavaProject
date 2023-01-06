package stringManipulation;

public class Replace {
    public static void main(String[] args) {

        String city = "Alabama";
        System.out.println(city.replace('a', 'e')); // Alebeme
        System.out.println(city.toLowerCase().replace('a', 'e')); // elebeme
        System.out.println(city.toUpperCase().replace('a', 'e')); // ALABAMA
        System.out.println(city.toUpperCase().replace('A', 'e')); // eLeBeMe

        // ----- replacing special characters and numbers ---- //

        String numbersAndChars = "Hello 2023! Happy ****N3w Y3ar****";
        System.out.println(numbersAndChars.replace('*', '!'));
        System.out.println(numbersAndChars); // it will still print with * coz we didnt catch the previous value

        // ---- we can also replace Strings ---- //

        System.out.println();

        String cake = "honeycake";
        System.out.println(cake.replace("honey", "chocolate ")); // chocolate cake
        System.out.println(cake);
        System.out.println(cake = cake.replace("chocolate", "honey"));



    }
}
