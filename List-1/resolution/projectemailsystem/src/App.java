import java.util.ArrayList;

import business.Employee;
import mail.BoxEmail;
import mail.Email;
import mail.EmailForward;
import message.IMessageForward;

public class App {
    public static void main(String[] args) throws Exception {

        Employee employee1 = new Employee("2000", "Ramon", "RH");
        BoxEmail boxEmail1 = new BoxEmail("ramon@ufal.br", employee1);
        employee1.setBoxEmail(boxEmail1);

        Employee employee2 = new Employee("2001", "José", "Suporte");
        BoxEmail boxEmail2 = new BoxEmail("jose@ufal.br", employee2);
        employee2.setBoxEmail(boxEmail2);

        Employee employee3 = new Employee("2002", "Maria", "Dev");
        BoxEmail boxEmail3 = new BoxEmail("maria@ufal.br", employee3);
        employee3.setBoxEmail(boxEmail3);

        Employee employee4 = new Employee("2003", "Carlos", "Vendedor");
        BoxEmail boxEmail4 = new BoxEmail("carlos@ufal.br", employee4);
        employee4.setBoxEmail(boxEmail4);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        ArrayList<Email> emails = new ArrayList<>();
        emails.add(new Email("Teste - Texto 1", "Teste: Texto 1 do conteúdo",
                employees.get(0).getBoxEmail(), employees.get(1).getBoxEmail()));
        emails.add(new Email("Teste - Texto 2", "Teste: Texto 2 do conteúdo",
                employees.get(0).getBoxEmail(), employees.get(2).getBoxEmail()));
        emails.add(new Email("Teste - Texto 3", "Teste: Texto 3 do conteúdo",
                employees.get(2).getBoxEmail(), employees.get(3).getBoxEmail()));

        IMessageForward<Email> forwardMessage = new EmailForward();

        for (Email email : emails)
            forwardMessage.forward(email, email.getSender(), email.getRecipient());

        for (Employee e : employees) {
            System.out.println(e.getName() + " ( " + e.getCode() + " ) [ " + e.getOccupation() + " ]\n");

            System.out.println("- E-mail Enviados:");
            for (Email m : e.getBoxEmail().getEmailSent())
                System.out.println(m + "\n");

            System.out.println("\n- E-mail Recebídos:");
            for (Email m : e.getBoxEmail().getEmailReceived())
                System.out.println(m + "\n");

            System.out.println("---------\n");
        }
    }
}
