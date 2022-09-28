package messageforward;

import mail.Email;

public interface IMessageForward {

    public void forward(Email email, IBoxMsgSent boxSent, IBoxMsgReceived boxReceived);

}
