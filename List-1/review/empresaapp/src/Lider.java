public class Lider extends Funcionario {

    public Lider(String nome, int idade, double salarioBase) throws Exception {
        super(nome, idade, salarioBase);
        // TODO Auto-generated constructor stub
    }

    @Override
    public double calculaSalario() {
        return this.getSalarioBase() * 3;
    }

}
