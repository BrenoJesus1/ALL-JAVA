
public class BombaCombustivel {

  public String tipoCombustivel;
  public double valorLitro, quantidadeCombustivel;

  public BombaCombustivel(String tipoCombustivel, double valorLitro, double quantidadeCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
    this.valorLitro = valorLitro;
    this.quantidadeCombustivel = quantidadeCombustivel;
  }

  public void abastecerPorValor(double valor) {
    double litrosAbastecidos = valor / valorLitro;
    if (litrosAbastecidos <= quantidadeCombustivel) {
      quantidadeCombustivel -= litrosAbastecidos;
      System.out.println("Quantidade de litros abastecidos: " + litrosAbastecidos);
    } else {
      System.out.println("Não há combustível suficiente para abastecer essa quantidade.");
    }
  }

  public void abastecerPorLitro(double litros) {
    double valorAPagar = litros * valorLitro;
    if (litros <= quantidadeCombustivel) {
      quantidadeCombustivel -= litros;
      System.out.println("Valor a pagar: R$ " + valorAPagar);
    } else {
      System.out.println("Não há combustível suficiente para abastecer essa quantidade.");
    }
  }

  public void alterarValor(double novoValor) {
    valorLitro = novoValor;
    System.out.println("Valor do litro de combustível alterado para: R$ " + novoValor);
  }

  public void alterarCombustivel(String novoCombustivel) {
    tipoCombustivel = novoCombustivel;
    System.out.println("Tipo de combustível alterado para: " + novoCombustivel);
  }

  public void alterarQuantidadeCombustivel(double novaQuantidade) {
    quantidadeCombustivel = novaQuantidade;
    System.out.println("Quantidade de combustível alterada para: " + novaQuantidade + " litros");
  }
}