package messageforward;

import mail.Email;

public interface IBoxMsgReceived {

    public void pushMsgReceived(Email email);

}
