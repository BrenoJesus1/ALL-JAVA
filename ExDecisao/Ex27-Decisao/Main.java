import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double precoMorangoAte5Kg = 2.50;
    double precoMorangoAcima5Kg = 2.20;
    double precoMacaAte5Kg = 1.80;
    double precoMacaAcima5Kg = 1.50;
    double desconto = 0.10;

    System.out.println("Quantidade de morangos (em Kg): ");
    double quantidadeMorangos = in.nextDouble();

    System.out.println("Quantidade de maçãs (em Kg): ");
    double quantidadeMacas = in.nextDouble();

    in.close();

    double valorTotalMorangos;

    if (quantidadeMorangos <= 5) {
      valorTotalMorangos = quantidadeMorangos * precoMorangoAte5Kg;
    } else {
      valorTotalMorangos = quantidadeMorangos * precoMorangoAcima5Kg;
    }

    double valorTotalMacas;
    if (quantidadeMacas <= 5) {
      valorTotalMacas = quantidadeMacas * precoMacaAte5Kg;
    } else {
      valorTotalMacas = quantidadeMacas * precoMacaAcima5Kg;
    }

    double valorTotalCompra = valorTotalMorangos + valorTotalMacas;

    if (quantidadeMorangos + quantidadeMacas > 8 || valorTotalCompra > 25) {
      double valorDesconto = valorTotalCompra * desconto;
      valorTotalCompra -= valorDesconto;
    }

    System.out.println("Valor a ser pago pelo cliente: " + valorTotalCompra);
  }
}