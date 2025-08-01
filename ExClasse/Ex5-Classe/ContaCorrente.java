public class ContaCorrente {

  private double numeroConta, saldo;
  private String nome;

  public ContaCorrente(double numeroConta, String nome, double saldo) {
    this.numeroConta = numeroConta;
    this.nome = nome;
    this.saldo = saldo;
  }

  public ContaCorrente(double numeroConta, String nome) {
    this.numeroConta = numeroConta;
    this.nome = nome;
    this.saldo = 0;
  }

  public String alterarNome(String novoNome) {
    nome = novoNome;
    return nome;
  }

  public double deposito(double valorDepositado) {
    saldo += valorDepositado;
    return saldo;
  }

  public double saque(double valorSacado) {
    saldo -= valorSacado;
    return saldo;
  }

}