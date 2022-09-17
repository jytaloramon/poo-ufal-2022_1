import face.FaceVideo;
import player.AdapterVideoFace;
import player.AdapterVideoYoutube;
import player.IVideo;
import player.VideoPlayer;
import youtube.YoutubeVideo;

public class App {
    public static void main(String[] args) throws Exception {

        FaceVideo sourceFaceVideo = new FaceVideo();
        IVideo videoFace = new AdapterVideoFace(sourceFaceVideo);

        YoutubeVideo sourceYVideo = new YoutubeVideo();
        IVideo videoYoutube = new AdapterVideoYoutube(sourceYVideo);

        VideoPlayer vPlayer = new VideoPlayer();

        System.out.println("---- Face Vídeo ----");
        vPlayer.setVideo(videoFace);
        vPlayer.play();

        System.out.println("\n---- Youtube Vídeo ----");
        vPlayer.setVideo(videoYoutube);
        vPlayer.play();

    }
}
