package academic.calcgrade;

public class CalcGradeFinalTypeGood extends CalcGradeFinal {

    public CalcGradeFinalTypeGood(IGradeCalcPeriod iCalcPeriod) {
        super(iCalcPeriod);
    }

    @Override
    public double calcGradeFinal() {
        // Maior ou igual a 7 e menor ou igual a 8 recebe uma bonificação de 15% (Para melhorar o coeficiente).
        return this.iCalcPeriod.calcGradePeriod() * 1.15;
    }

}
