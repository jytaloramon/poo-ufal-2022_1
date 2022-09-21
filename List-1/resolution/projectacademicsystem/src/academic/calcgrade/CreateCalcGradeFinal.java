package academic.calcgrade;

public class CreateCalcGradeFinal {

    public static IGradeCalFinal create(IGradeCalcPeriod iCalcPeriod) {
        double gradeP = iCalcPeriod.calcGradePeriod();

        if (gradeP < 6)
            return new CalcGradeFinalTypeBad(iCalcPeriod);
        if (gradeP < 7)
            return new CalcGradeFinalTypeSafe(iCalcPeriod);
        if (gradeP <= 8)
            return new CalcGradeFinalTypeGood(iCalcPeriod);

        return new CalcGradeFinalTypeAwesome(iCalcPeriod);
    }

}
