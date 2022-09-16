package message;

public interface IMessageForward<M> {

    public void forward(M msg, IBoxMsgSent<M> boxSent, IBoxMsgReceived<M> boxReceived);

}
