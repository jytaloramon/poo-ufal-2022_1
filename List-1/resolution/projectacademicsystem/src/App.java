import academic.calcgrade.CreateCalcGradeFinal;
import academic.calcgrade.IGradeCalFinal;
import academic.grade.Grade;
import academic.grade.GradeManager;
import personal.Student;

public class App {
    public static void main(String[] args) throws Exception {

        Grade[] grades = {
                new Grade("POO - Fundamentos", 9),
                new Grade("POO - Projeto 1", 7),
                new Grade("POO - Padrões de Projetos e SOLID", 5),
                new Grade("POO - Projeto 2", 10),
                new Grade("POO - Recuperação", 10),
        };

        GradeManager gradeManager = new GradeManager(grades);

        Student student = new Student("20169632", "Ramon Almeida", gradeManager);

        IGradeCalFinal gradeFinalCalculator = CreateCalcGradeFinal.create(student.getGradeManager());

        System.out.println(student.getGradeManager().calcGradePeriod());
        System.out.println(gradeFinalCalculator.calcGradeFinal());
    }
}
