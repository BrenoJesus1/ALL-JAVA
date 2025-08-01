public class ContaInvestimento {

  public double saldo, taxaJuros;

  public ContaInvestimento(double saldoInicial, double taxaJuros) {
    this.saldo = saldoInicial;
    this.taxaJuros = taxaJuros;
  }

  public void adicioneJuros() {
    double juros = saldo * (taxaJuros / 100);
    saldo += juros;
  }

  public double mostrarSaldo() {
    return saldo;
  }
}