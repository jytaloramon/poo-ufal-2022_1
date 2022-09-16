package business;

import mail.BoxEmail;

public class Employee {

    private String code;

    private String name;

    private String occupation;

    private BoxEmail boxEmail;

    public Employee(String code, String name, String occupation) {
        setCode(code);
        setName(name);
        setOccupation(occupation);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public BoxEmail getBoxEmail() {
        return boxEmail;
    }

    public void setBoxEmail(BoxEmail boxEmail) {
        this.boxEmail = boxEmail;
    }

}
