package mentoring;

public class YoutubeVideo {

    String title;
    String comments;
    int views;
    int likes;
    boolean isPrivate;

    public void watch(){
        views++;
    }

    public void like(){
        likes++;
    }

    public void comment(String newComment){
        comments = comments + "\n" + newComment;
    }

    public void makePrivate(){
            isPrivate = true;
        }
}
