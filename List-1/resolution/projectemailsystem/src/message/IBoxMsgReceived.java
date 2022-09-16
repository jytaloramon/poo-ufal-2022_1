package message;

public interface IBoxMsgReceived<M> {

    public void pushMsgReceived(M msg);

}
