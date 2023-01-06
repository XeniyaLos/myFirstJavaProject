package recap;

import java.util.Random;

public class ConstructorsMethodOverloading {
    public static void main(String[] args) {

        login("   630-220-85 - 28   ", true);
        login("hey@gmail.com", false);
        login("", "hello");
        login("hello", "");
        login("hi", "hello");

        Face face = new Face("orange", "round");
        login(face);

    }

    public static void login(String phoneNumber, boolean isPhoneNumber){
        if(isPhoneNumber) {
            phoneNumber = phoneNumber.trim().replaceAll("-", "").replaceAll(" ", "");
            if (phoneNumber.length() == 10 || phoneNumber.length() == 11) {
                Random random = new Random();
                int secretPassCode = random.nextInt(1000);
                System.out.println("Passcode " + secretPassCode + " sent to: " + phoneNumber);
            } else {
                System.out.println("Invalid phone number format");
            }
        }else{
            System.out.println("Redirecting to Gmail for Login");
        }
    }

    public static void login(String userName, String password){
        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Invalid data");
        }else {
            System.out.println("Successfully login");
        }
    }

    public static void login(Face faceID){
        System.out.println("successfully logged in with Face ID below:");
        faceID.displayFace();
    }
}
