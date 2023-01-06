package constructors;

public class User {

    String firstName;
    String lastName;
    String userName;
    String email;
    String password;
    String phoneNumber;
    String gender;
    int age;
    boolean isModerator;
    boolean isUser;
    double costOfSubscription;

    public User(){
    }

    public User(String userName, String email, String password){
        this.userName = userName;
        this.email = email;
        this.password = password;
        System.out.println("New user was created using email address: " + email);
        System.out.println("In order to login next time, use your user name: " + userName + " and a password" +
                " you provided during registration: " + password);
    }

    public User(boolean isModerator){
        this.isModerator = isModerator;
        if(isModerator){
            System.out.println("As Moderator you can change cost of Prime Subscription.");
        }
        System.out.println("Only Moderator can make changes.");
    }

    public User(String gender, boolean isModerator){
        this.isModerator = isModerator;
        this.gender = gender;
        if(isModerator && gender.equals("male")){
            System.out.println("As Moderator you updated user's gender to: " + gender);
        }else if(isModerator && gender.equals("female")){
            System.out.println("As Moderator you updated user's gender to: " + gender);
        }
        System.out.println("Only Moderator can make changes.");
    }

    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(firstName + " " + lastName + ", welcome to your Account Page.");
    }

    public User(String firstName, String lastName, boolean isAccountTypeUser){
        if(isAccountTypeUser){
            System.out.println(firstName + " " + lastName + ". You account type is User.");
            isUser = true;
        }
        System.out.println(firstName + " " + lastName + ". You have no rights to login as Moderator.");
        isUser = false;
        isModerator = true;
    }

    public User(String userName, String phoneNumber, int age){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        System.out.println("User: " + userName + " just added phone number: " + phoneNumber + " to his/her profile.");
        System.out.println("User: " + userName + " just added age: " + age + " to his/her profile.");
    }

    public User(String userName){
        this.userName = userName;
        isModerator = true;
        isUser = false;
        System.out.println("Permission of User: " + userName + " was changed from User to Moderator.");
    }

    public User(String firstName, String lastName, double costOfSubscription){
        this.firstName = firstName;
        this.lastName = lastName;
        this.costOfSubscription = costOfSubscription;
        System.out.println(firstName + " " + lastName + " paid $" + costOfSubscription + " to become a Prime Member.");
    }

    public User(String firstName, String lastName, String userName, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        System.out.println(firstName + " " + lastName + ", user name for you profile is: " + userName +
                ", password for you profile is: " + password);
    }
}
