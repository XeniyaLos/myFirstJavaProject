package classesAndObjects;

public class User {

    String userName;
    String password;
    String email;
    String dateOfBirth;
    String gender;
    String lastMessage;
    int numOfFollowers;
    int phoneNumber;

    boolean isPrivate;

    /*
    public - is access modifier
    username, password - method parameters
     */
    public void login(String username, String password){ //empty parameters (not a variables)
        System.out.println(userName + " logged in using password: " + password);
    }

    public  int getNumberOfFollowers(String username){
        return numOfFollowers;
    }

    public String getLastMessage(String username){
        return lastMessage;
    }

    public boolean isPrivateAccount(String username){
        return isPrivate;
    }

    public String todaysDate(){
        return "11/30/2022";
    }

    public void likePost(String username, String post){
        System.out.println(username + " liked " + post);
    }

    // -----create 10 methods for each time of data type------- //

    public void result(){
    }

    public byte small(){
        return 1;
    }

    public short easy(){
        return 31556;
    }
    public int medium(){
        return 34543656;
    }

    public long largest(){
        return 748463635;
    }

    public float decimal(){
        return (float) 45.4353;
    }

    public double moreDecimals(){
        return 234.65867876;
    }
    public boolean isAdmin(){
        return true;
    }
    public char spec(){
        return '@';
    }
}
