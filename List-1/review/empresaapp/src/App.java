public class App {
    public static void main(String[] args) throws Exception {

        final double salarioBaseDev = 1000;

        Funcionario funcDev = new Dev("Noemy", 40, salarioBaseDev),
                funcLider = new Lider("Franklyn", 25, salarioBaseDev),
                funcGerente = new Gerente("Maria", 18, salarioBaseDev);

        calculaSalarioFinal(funcDev);
        calculaSalarioFinal(funcLider);
        calculaSalarioFinal(funcGerente);
    }

    public static void calculaSalarioFinal(ICalculadoraSalario s) {
        System.out.println(s + " -> Salario Final: " + s.calculaSalario() + "\n");
    }
}
