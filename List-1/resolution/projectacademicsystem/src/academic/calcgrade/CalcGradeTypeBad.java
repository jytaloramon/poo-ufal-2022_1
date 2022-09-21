package academic.calcgrade;

public class CalcGradeTypeBad implements IGradeCalFinal {

    private final IGradeCalcPeriod iCalcPeriod;

    public CalcGradeTypeBad(IGradeCalcPeriod iCalcPeriod) {
        this.iCalcPeriod = iCalcPeriod;
    }

    @Override
    public double calcGradeFinal() {
        double grade = iCalcPeriod.calcGradePeriod();

        return grade * 0.75;
    }

}
