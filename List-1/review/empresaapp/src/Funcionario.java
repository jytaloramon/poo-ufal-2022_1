public abstract class Funcionario implements ICalculadoraSalario {

    private String nome;

    private int idade;

    private double salarioBase;

    public Funcionario(String nome, int idade, double salarioBase) throws Exception {
        setNome(nome);
        setIdade(idade);
        setSalarioBase(salarioBase);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() > 50)
            throw new Exception("Nome passa de 50 caracteres");

        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if (idade < 0)
            throw new Exception("Idade não pode ser negativo");

        this.idade = idade;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) throws Exception {
        if (salarioBase < 0)
            throw new Exception("Salario Base não pode ser negativo");

        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Salario Base: " + salarioBase;
    }

}
