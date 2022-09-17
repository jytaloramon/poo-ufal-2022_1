package personal;

public class PersonLegal extends Person {

    private final String cnpj;

    public PersonLegal(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean isValid() {
        if (this.cnpj.length() != 18)
            return false;

        String c = this.cnpj.replace(".", "").replace("-", "").replace("/", "");

        int sumS1 = sumCharInterval(c, new int[] { 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 }),
                r1 = sumS1 % 11, d1 = r1 < 2 ? 0 : 11 - r1;

        if (d1 + 48 != c.charAt(12))
            return false;

        int sumS2 = sumCharInterval(c, new int[] { 6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 }),
                r2 = sumS2 % 11, d2 = r2 < 2 ? 0 : 11 - r2;

        return d2 + 48 == c.charAt(13);
    }

    private int sumCharInterval(String s, int[] arrWeight) {
        int sum = 0;

        for (int i = 0; i < arrWeight.length; ++i)
            sum += (s.charAt(i) - 48) * arrWeight[i];

        return sum;
    }

    @Override
    public String toString() {
        return super.toString() + " {Legal}, CNPJ: " + this.cnpj;
    }

}
