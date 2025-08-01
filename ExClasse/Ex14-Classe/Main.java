public class Main {
  public static void main(String[] args) {
    Funcionario joao = new Funcionario("João", 2500.00);

    System.out.println("Nome do funcionário: " + joao.mostrarNome());
    System.out.println("Salário do funcionário: R$" + joao.mostrarSalario());
    joao.aumentarSalario(10);
    System.out.println("Novo salário do funcionário após aumento: R$" + joao.mostrarSalario());

  }
}