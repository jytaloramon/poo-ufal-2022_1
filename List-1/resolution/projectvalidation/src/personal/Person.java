package personal;

import validation.IEntityValidation;

public abstract class Person implements IEntityValidation {

    protected int sumCharInterval(String s, int[] arrWeight) {
        int sum = 0;

        for (int i = 0; i < arrWeight.length; ++i)
            sum += charToInt(s.charAt(i)) * arrWeight[i];

        return sum;
    }

    protected int charToInt(char v) {
        return v - 48;
    }

    @Override
    public String toString() {
        return "Type: Person";
    }

}
