package player;

public abstract class Video implements IVideo {

    protected abstract int[] convertBitsToIntArr();

    @Override
    public String[] getContent() {

        int[] arrCode = convertBitsToIntArr();
        String[] content = new String[arrCode.length];

        for (int i = 0; i < content.length; i++)
            content[i] = String.valueOf((char) arrCode[i]);

        return content;
    }

}
