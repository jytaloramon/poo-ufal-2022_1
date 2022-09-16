package mail;

import message.IBoxMsgReceived;
import message.IBoxMsgSent;
import message.IMessageForward;

public class EmailForward implements IMessageForward<Email> {

    @Override
    public void forward(Email email, IBoxMsgSent<Email> boxSent, IBoxMsgReceived<Email> boxReceived) {
        boxSent.pushMsgSent(email);
        boxReceived.pushMsgReceived(email);
    } 

}
