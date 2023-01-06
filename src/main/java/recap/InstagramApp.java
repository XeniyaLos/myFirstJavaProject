package recap;

public class InstagramApp {
    public static void main(String[] args) {

        InstagramUser user1 = new InstagramUser("James Bond", "jb2022", "JB2022!");

        user1.display();

        InstagramUser user2 = new InstagramUser("John Wick", "jw20", " Wick22", "I am an actor");
        user2.display();

        InstagramUser user3 = new InstagramUser("Anna", "an22", "anna2022", "I am a waitress", "anna.com");
        user3.display();

        user2.postStory("I am coming back!");
        user1.postStory("Game is on today...");

        user3.visitProfile(user1);
        user3.visitProfile(user2);

        // Jame Bond wants his profile private
        user1.isPrivate = true;
        System.out.println();
        user3.visitProfile(user1);
        user3.visitProfile(user2);

    }
}
