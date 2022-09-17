package player;

public class VideoPlayer {

    private IVideo video;

    public VideoPlayer() {
    }

    public IVideo getVideo() {
        return video;
    }

    public void setVideo(IVideo video) {
        this.video = video;
    }

    public void play() {
        if (video == null) {
            System.out.println("Não há vídeo...\n");
            return;
        }

        System.out.print("Vídeo Executando... >> ");

        for (String c : video.getContent())
            System.out.print(c);

        System.out.println();
    }

}
