import personal.Person;
import personal.PersonIndividual;
import personal.PersonLegal;
import validation.Validator;

public class App {

    public static void main(String[] args) throws Exception {

        Person[] persons = {
                new PersonIndividual("863.354.756-04"),
                new PersonLegal("11.444.777/0001-65"),
                new PersonLegal("11.444.777/0001-61"),
                new PersonIndividual("944.243.912-05"),
                new PersonLegal("44.334.862/0001-85"),
                new PersonIndividual("111.444.777.35"),
        };

        System.out.println("------ Validations ------");

        for (Person person : persons)
            Validator.runValidation(person);

    }
}
