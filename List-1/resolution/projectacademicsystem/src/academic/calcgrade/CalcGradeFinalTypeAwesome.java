package academic.calcgrade;

public class CalcGradeFinalTypeAwesome extends CalcGradeFinal {

    public CalcGradeFinalTypeAwesome(IGradeCalcPeriod iCalcPeriod) {
        super(iCalcPeriod);
    }

    @Override
    public double calcGradeFinal() {
        // Qualquer outra nota automaticamente se torna 10.
        return 10;
    }

}
