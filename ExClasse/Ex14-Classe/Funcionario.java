public class Funcionario {

  public String nome;
  public double salario;

  public Funcionario(String nome, double salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public String mostrarNome() {
    return nome;
  }

  public double mostrarSalario() {
    return salario;
  }

  public void aumentarSalario(double porcentualDeAumento) {
    salario += salario * (porcentualDeAumento / 100.0);
  }
}