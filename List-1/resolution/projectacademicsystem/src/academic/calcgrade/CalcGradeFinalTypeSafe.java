package academic.calcgrade;

public class CalcGradeFinalTypeSafe extends CalcGradeFinal {

    public CalcGradeFinalTypeSafe(IGradeCalcPeriod iCalcPeriod) {
        super(iCalcPeriod);
    }

    @Override
    public double calcGradeFinal() {
        // Maior ou igual a 6 e menor que 7 se torna 7.
        return 7;
    }

}
