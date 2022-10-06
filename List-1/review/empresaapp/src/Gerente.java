public class Gerente extends Funcionario {

    public Gerente(String nome, int idade, double salarioBase) throws Exception {
        super(nome, idade, salarioBase);
    }

    @Override
    public double calculaSalario() {
        return this.getSalarioBase() * 15;
    }

}
