package message;

import java.util.Date;

public abstract class Message {

    private final String content;

    private final Date date;

    public Message(String content) throws Exception {
        if (content.length() > 2500)
            throw new Exception("Conteúdo muito longo");

        this.content = content;
        date = new Date();
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

}
