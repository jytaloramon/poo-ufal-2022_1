package mail;

import java.text.DateFormat;
import java.util.Date;

public class Email {

    private final String title;

    private final String content;

    private final Date date;

    private final BoxEmail sender;

    private final BoxEmail recipient;

    public Email(String title, String content, BoxEmail sender, BoxEmail recipient) throws Exception {
        if (content.length() > 2500)
            throw new Exception("Conteúdo muito longo");

        if (title == null || title.length() < 1)
            throw new Exception("Título inválido");

        if (sender == null || recipient == null)
            throw new Exception("E-mail do remetente ou detinatário inválido");

        this.content = content;
        this.title = title;
        this.sender = sender;
        this.recipient = recipient;
        date = new Date();
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getDate() {
        return date;
    }

    public BoxEmail getSender() {
        return sender;
    }

    public BoxEmail getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        DateFormat dateE = DateFormat.getDateTimeInstance();

        return " Título: " + title + " [" + dateE.format(this.getDate()) + "]"
                + "\n Conteúdo: " + this.getContent()
                + "\n De: " + sender.getAddr() + ", Para: " + recipient.getAddr();
    }
}
