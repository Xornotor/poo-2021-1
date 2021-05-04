package empresa.classes;

public class Chefe extends Funcionario {
  private double bonus;

  public Chefe (String nome, String funcao, double salario, double bonus) {
    super(nome, funcao, salario);
    this.bonus = bonus;
  }

  @Override
  public double getSalario() {
    return super.getSalario() + (super.getSalario() * this.bonus / 100);
  }

  @Override
  public boolean promove(String novaFuncao, double novoSalario) {
    super.promove(novaFuncao, novoSalario);
    this.bonus += 1;
    return true;
  }

  @Override
  public double valorEmprestimo() {
    return (0.4 * super.getSalario()) + (0.1 * super.getSalario() * this.bonus / 100);
  }

  
}