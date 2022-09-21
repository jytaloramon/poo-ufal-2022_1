package academic.calcgrade;

public abstract class CalcGradeFinal implements IGradeCalFinal{
    
    protected final IGradeCalcPeriod iCalcPeriod;

    public CalcGradeFinal(IGradeCalcPeriod iCalcPeriod) {
        this.iCalcPeriod = iCalcPeriod;
    }

}
