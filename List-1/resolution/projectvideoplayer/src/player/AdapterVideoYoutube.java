package player;

import youtube.YoutubeVideo;

public class AdapterVideoYoutube extends Video {

    private final YoutubeVideo yVideo;

    public AdapterVideoYoutube(YoutubeVideo yVideo) {
        this.yVideo = yVideo;
    }

    @Override
    protected int[] convertBitsToIntArr() {
        return yVideo.getBits();
    }

}
