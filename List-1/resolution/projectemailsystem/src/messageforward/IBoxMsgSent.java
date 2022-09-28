package messageforward;

import mail.Email;

public interface IBoxMsgSent {

    public void pushMsgSent(Email email);

}
