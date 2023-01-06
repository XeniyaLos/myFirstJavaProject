package baiaChallenges;

public class ChristmasTree {
    public static void main(String[] args) {

        // -------- WHOLE CHRISTMAS TREE -------- //

        for(int i = 0; i <= 6; i++){

            for(int a = 0; a <= 6 - i; a++){ // print spaces
                System.out.print(" ");
            }
            for(int v = 1; v <= i * 2 - 1; v++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("!!! HAPPY NEW YEAR !!!");

        // -------------- HALF OF THE TREE ------------- //

        for(int c = 1; c <= 7; c++){
            for(int a = 1; a <= c; a++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int k = 1; k <= 6; k++){
            System.out.println("*".repeat(3));
        }

    }

}
