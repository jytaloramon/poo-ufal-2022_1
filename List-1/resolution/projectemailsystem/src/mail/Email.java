package mail;

import java.text.DateFormat;

import message.Message;

public class Email extends Message {

    private final String title;

    private final BoxEmail sender;

    private final BoxEmail recipient;

    public Email(String title, String content, BoxEmail sender, BoxEmail recipient) throws Exception {
        super(content);

        if (title == null || title.length() < 1)
            throw new Exception("Título inválido");

        if (sender == null || recipient == null)
            throw new Exception("E-mail do remetente ou detinatário inválido");

        this.title = title;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
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
