package personal;

public class PersonLegal extends Person {

    private final String cnpj;

    public PersonLegal(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean isValid() {

        // Removendo qualquer coisa diferente de número
        String c = this.cnpj.replaceAll("[^0-9]", "");

        if (c.length() != 14
                || c.matches("[0]{14}|[1]{14}|[2]{14}|[3]{14}|[4]{14}"
                        + "|[5]{14}|[6]{14}|[7]{14}|[8]{14}|[9]{14}"))
            return false;

        int sumS1 = sumCharInterval(c, new int[] { 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 }),
                r1 = sumS1 % 11, d1 = r1 < 2 ? 0 : 11 - r1;

        if (d1 != charToInt(c.charAt(12)))
            return false;

        int sumS2 = sumCharInterval(c, new int[] { 6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 }),
                r2 = sumS2 % 11, d2 = r2 < 2 ? 0 : 11 - r2;

        return d2 == charToInt(c.charAt(13));
    }

    @Override
    public String toString() {
        return super.toString() + " {Legal}, CNPJ: " + this.cnpj;
    }

}
