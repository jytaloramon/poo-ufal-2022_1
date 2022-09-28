package mail;

import java.util.ArrayList;

import business.Employee;
import messageforward.IBoxMsgReceived;
import messageforward.IBoxMsgSent;

public class BoxEmail implements IBoxMsgSent, IBoxMsgReceived {

    private final String addr;

    private final Employee employee;

    private final ArrayList<Email> emailSent;

    private final ArrayList<Email> emailReceived;

    public BoxEmail(String addr, Employee employee) {
        this.addr = addr;
        this.employee = employee;
        emailSent = new ArrayList<>();
        emailReceived = new ArrayList<>();
    }

    public String getAddr() {
        return addr;
    }

    public Employee getEmployee() {
        return employee;
    }

    public ArrayList<Email> getEmailSent() {
        return emailSent;
    }

    public ArrayList<Email> getEmailReceived() {
        return emailReceived;
    }

    @Override
    public void pushMsgReceived(Email email) {
        emailReceived.add(email);
    }

    @Override
    public void pushMsgSent(Email email) {
        emailSent.add(email);

    }

}
