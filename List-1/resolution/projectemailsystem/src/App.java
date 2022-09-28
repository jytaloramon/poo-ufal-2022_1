import java.util.ArrayList;

import business.Employee;
import mail.BoxEmail;
import mail.Email;
import messageforward.EmailForward;
import messageforward.IMessageForward;
import repository.EmployeeRepository;

public class App {
    public static void main(String[] args) throws Exception {

        // Criação de funcionários e suas respectivas caixas de e-mails
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

        EmployeeRepository.getInstance().insert(employee1.getCode(), employee1);
        EmployeeRepository.getInstance().insert(employee2.getCode(), employee2);
        EmployeeRepository.getInstance().insert(employee3.getCode(), employee3);
        EmployeeRepository.getInstance().insert(employee4.getCode(), employee4);

        // Criando e enviando e-mails
        ArrayList<Email> emails = new ArrayList<>();
        emails.add(new Email("Teste - Texto 1", "Teste: Texto 1 do conteúdo",
                EmployeeRepository.getInstance().getByCode("2000").getBoxEmail(),
                EmployeeRepository.getInstance().getByCode("2001").getBoxEmail()));

        emails.add(new Email("Teste - Texto 2", "Teste: Texto 2 do conteúdo",
                EmployeeRepository.getInstance().getByCode("2000").getBoxEmail(),
                EmployeeRepository.getInstance().getByCode("2002").getBoxEmail()));

        emails.add(new Email("Teste - Texto 3", "Teste: Texto 3 do conteúdo",
                EmployeeRepository.getInstance().getByCode("2002").getBoxEmail(),
                EmployeeRepository.getInstance().getByCode("2003").getBoxEmail()));

        IMessageForward forwardMessage = new EmailForward();

        for (Email email : emails)
            forwardMessage.forward(email, email.getSender(), email.getRecipient());

        // Saída
        for (Employee e : EmployeeRepository.getInstance().getAll()) {
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
