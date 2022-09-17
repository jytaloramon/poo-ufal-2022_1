package player;

import face.FaceVideo;
import java.lang.Math;

public class AdapterVideoFace extends Video {

    private final FaceVideo faceVideo;

    public AdapterVideoFace(FaceVideo faceVideo) {
        this.faceVideo = faceVideo;
    }

    @Override
    protected int[] convertBitsToIntArr() {

        boolean[] bits = faceVideo.getBitsFace();
        int[] arrCode = new int[bits.length / 8];

        for (int i = 0, valueBit = 0; i < bits.length; i++) {
            valueBit = (int) Math.pow((double) 2, (double) (7 - i % 8)) * (bits[i] ? 1 : 0);
            arrCode[i / 8] += valueBit;
        }

        return arrCode;
    }

}
