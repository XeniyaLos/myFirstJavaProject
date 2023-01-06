package loops;

import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String realPass = "Hello";

       /* while(true){
            System.out.print("Please enter your password: ");
            String pass = scan.nextLine();
            if(pass.equals(realPass)) {
                System.out.println("Successfully logged in");
                break;
            }else{
                System.out.println("Incorrect password. Please try again!");
            }
        } */

        int i = 3;
        int counter = 0;
        while(true){
            System.out.print("Please enter your password: ");
            String pass = scan.nextLine();
            if(pass.equals(realPass)) {
                System.out.println("Successfully logged in");
                break;
            }else {
                System.out.println("Incorrect password. Please try again!");
                counter++;
            }
            if(counter == i){
                System.out.println("You've reached the limit");
                break;
            }
        }
    }
}
