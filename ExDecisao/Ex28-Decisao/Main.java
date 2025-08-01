import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double precoFileDuploAte5Kg = 4.90;
    double precoFileDuploAcima5Kg = 5.80;
    double precoAlcatraAte5Kg = 5.90;
    double precoAlcatraAcima5Kg = 6.80;
    double precoPicanhaAte5Kg = 6.90;
    double precoPicanhaAcima5Kg = 7.80;
    double descontoCartaoTabajara = 0.05;

    System.out.println("Tipo de carne (F- File Duplo, A- Alcatra, P- Picanha): ");
    String tipoCarne = in.nextLine();

    System.out.println("Quantidade de carne (em Kg): ");
    double quantidadeCarne = in.nextDouble();

    double precoTotal;
    if (tipoCarne.equalsIgnoreCase("F")) {
      if (quantidadeCarne <= 5) {
        precoTotal = quantidadeCarne * precoFileDuploAte5Kg;
      } else {
        precoTotal = quantidadeCarne * precoFileDuploAcima5Kg;
      }
    }

    else if (tipoCarne.equalsIgnoreCase("A")) {
      if (quantidadeCarne <= 5) {
        precoTotal = quantidadeCarne * precoAlcatraAte5Kg;
      } else {
        precoTotal = quantidadeCarne * precoAlcatraAcima5Kg;
      }
    }

    else if (tipoCarne.equalsIgnoreCase("P")) {
      if (quantidadeCarne <= 5) {
        precoTotal = quantidadeCarne * precoPicanhaAte5Kg;
      } else {
        precoTotal = quantidadeCarne * precoPicanhaAcima5Kg;
      }
    }

    else {
      System.out.println("Tipo de carne inválido.");
      return;
    }

    System.out.println("Compra feita no cartão Tabajara? (S- Sim, N- Não): ");
    String cartaoTabajara = in.next();

    in.close();

    double valorDesconto = 0.0;
    if (cartaoTabajara.equalsIgnoreCase("S")) {
      valorDesconto = precoTotal * descontoCartaoTabajara;
      precoTotal -= valorDesconto;
    }

    System.out.println("CUPOM FISCAL");
    System.out.println("Tipo de carne: " + tipoCarne);
    System.out.println("Quantidade de carne: " + quantidadeCarne + " Kg");
    System.out.println("Preço total: R$ " + precoTotal);

    if (cartaoTabajara.equalsIgnoreCase("S")) {
      System.out.println("Tipo de pagamento: Cartão Tabajara");
    } else {
      System.out.println("Tipo de pagamento: Sem Cartão Tabajara");
    }
    System.out.println("Valor do desconto: R$ " + valorDesconto);
    System.out.println("Valor a pagar: R$ " + precoTotal);
  }
}