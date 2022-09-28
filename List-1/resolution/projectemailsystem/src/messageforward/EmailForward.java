package messageforward;

import mail.Email;

public class EmailForward implements IMessageForward {

    @Override
    public void forward(Email email, IBoxMsgSent boxSent, IBoxMsgReceived boxReceived) {
        boxSent.pushMsgSent(email);
        boxReceived.pushMsgReceived(email);
    }

}
