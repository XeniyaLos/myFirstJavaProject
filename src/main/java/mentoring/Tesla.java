package mentoring;

public class Tesla {
    public static void main(String[] args) {
        signUp("James", "j4323", "james");

        String phoneNumber = "+1 773 847 7273";
        //1. step: remove +
        //2. step: remove spaces
        //3. step: if it is 11 digits then remove the first character

        phoneNumber = phoneNumber.replaceAll(" ", "");
        phoneNumber = phoneNumber.replaceAll("-", "");
        phoneNumber = phoneNumber.replaceAll("\\+", "");
        int l = phoneNumber.length();
        if(l > 10){
            phoneNumber = phoneNumber.substring(1);
        }else {
        }

        System.out.println(phoneNumber);

    }

    // Create method sign up that takes 3 parameters for name, username, pass
    // method doesn't return anything
    // check the pass, if pass is at least 6 characters - success if not fail

    public static void signUp(String name, String username, String pass){
        // String manipulation starts
        // i need to be able to manipulate strings, get some
        // information about strings, change things in string

        int l = pass.length();
        if(l >= 6){
            System.out.println("Login was successful");
        }else{
            System.out.println("Login fail");
        }
    }
}
