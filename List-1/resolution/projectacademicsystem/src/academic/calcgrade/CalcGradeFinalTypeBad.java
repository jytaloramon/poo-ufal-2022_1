package academic.calcgrade;

public class CalcGradeFinalTypeBad extends CalcGradeFinal {

    public CalcGradeFinalTypeBad(IGradeCalcPeriod iCalcPeriod) {
        super(iCalcPeriod);
    }

    @Override
    public double calcGradeFinal() {
        // Nota menor que 6 recebe uma penalização de 25%.
        return this.iCalcPeriod.calcGradePeriod() * 0.75;
    }

}
