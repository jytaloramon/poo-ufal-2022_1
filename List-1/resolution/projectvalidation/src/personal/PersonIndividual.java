package personal;

public class PersonIndividual extends Person {

    private final String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean isValid() {

        // Removendo qualquer coisa diferente de número
        String c = this.cpf.replaceAll("[^0-9]", "");

        if (c.length() != 11
                || c.matches("[0]{11}|[1]{11}|[2]{11}|[3]{11}|[4]{11}"
                        + "|[5]{11}|[6]{11}|[7]{11}|[8]{11}|[9]{11}"))
            return false;

        int sumS1 = sumCharInterval(c, new int[] { 10, 9, 8, 7, 6, 5, 4, 3, 2 }),
                r1 = sumS1 % 11, d1 = r1 < 2 ? 0 : 11 - r1;

        if (d1 != charToInt(c.charAt(9)))
            return false;

        int sumS2 = sumCharInterval(c, new int[] { 11, 10, 9, 8, 7, 6, 5, 4, 3, 2 }),
                r2 = sumS2 % 11, d2 = r2 < 2 ? 0 : 11 - r2;

        return d2 == charToInt(c.charAt(10));
    }

    @Override
    public String toString() {
        return super.toString() + " {Individual}, CPF: " + this.cpf;
    }
}
