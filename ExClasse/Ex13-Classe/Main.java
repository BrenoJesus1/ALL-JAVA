public class Main {
  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("João", 2500.00);

    System.out.println("Nome do funcionário: " + funcionario.mostrarNome());
    System.out.println("Salário do funcionário: R$" + funcionario.mostrarSalario());
  }
}