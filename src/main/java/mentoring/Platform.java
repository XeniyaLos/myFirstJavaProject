package mentoring;

public class Platform {
    public static void main(String[] args) {

        YoutubeVideo video = new YoutubeVideo();
        System.out.println(video.views);
        video.watch();
        System.out.println(video.views);

        System.out.println(video.likes);
        video.like();
        System.out.println(video.likes);

        video.comment("Hello");
        video.comment("Bye");
        System.out.println(video.comments);

        video.makePrivate();
        System.out.println(video.isPrivate);
    }
}
