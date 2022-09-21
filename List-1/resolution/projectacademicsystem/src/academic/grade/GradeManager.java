package academic.grade;

import academic.calcgrade.IGradeCalcPeriod;

public class GradeManager implements IGradeCalcPeriod {

    private final Grade[] grades;

    public GradeManager(Grade[] grade) throws Exception {
        if (grade.length != 5)
            throw new Exception("É necessário 5 notas");

        this.grades = grade;
    }

    public Grade[] getGrades() {
        return grades;
    }

    @Override
    public double calcGradePeriod() {
        return sumGrades() - minGrade();
    }

    private double sumGrades() {
        double sum = 0;

        for (Grade grade : grades)
            sum += grade.getValue();

        return sum;
    }

    private double minGrade() {
        double minGrade = Double.MAX_VALUE;

        for (Grade grade : grades) {
            if (grade.getValue() < minGrade)
                minGrade = grade.getValue();
        }

        return minGrade;
    }
}
