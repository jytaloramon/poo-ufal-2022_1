public class Dev extends Funcionario {

    public Dev(String nome, int idade, double salarioBase) throws Exception {
        super(nome, idade, salarioBase);
    }

    @Override
    public double calculaSalario() {
        return this.getSalarioBase();
    }

}
