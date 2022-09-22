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

        if (c.length() != 11)
            return false;

        int sumS1 = sumCharInterval(c, 10),
                r1 = sumS1 % 11, d1 = r1 < 2 ? 0 : 11 - r1;

        if (d1 + 48 != c.charAt(9))
            return false;

        int sumS2 = sumCharInterval(c, 11),
                r2 = sumS2 % 11, d2 = r2 < 2 ? 0 : 11 - r2;

        return d2 + 48 == c.charAt(10);
    }

    private int sumCharInterval(String s, int sInterv) {
        int sum = 0;

        for (int i = sInterv; i > 1; --i)
            sum += (s.charAt(sInterv - i) - 48) * i;

        return sum;
    }

    @Override
    public String toString() {
        return super.toString() + " {Individual}, CPF: " + this.cpf;
    }
}
