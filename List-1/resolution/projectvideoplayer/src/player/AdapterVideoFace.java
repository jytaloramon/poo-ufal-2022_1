package player;

import face.FaceVideo;

public class AdapterVideoFace extends Video {

    private final FaceVideo faceVideo;

    /**
     * "Tabela" das potências de 2 no intervalo de 8bit=1Byte=256(Valores).
     */
    private static final int[] TABLE_TWOPOWERS_BYTE = { 128, 64, 32, 16, 8, 4, 2, 1 };

    public AdapterVideoFace(FaceVideo faceVideo) {
        this.faceVideo = faceVideo;
    }

    @Override
    protected int[] convertBitsToIntArr() {

        boolean[] bits = faceVideo.getBitsFace();
        int[] arrCode = new int[bits.length / 8];

        for (int i = 0; i < bits.length; i++)
            arrCode[i / 8] += TABLE_TWOPOWERS_BYTE[i % 8] * convertBooleanToBit(bits[i]);

        return arrCode;
    }

    private int convertBooleanToBit(boolean v) {
        return v ? 1 : 0;
    }
}
