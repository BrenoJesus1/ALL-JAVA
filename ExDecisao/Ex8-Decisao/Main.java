import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite o preço do produto: ");
    double produto1 = in.nextDouble();

    System.out.println("Digite o preço do segundo produto: ");
    double produto2 = in.nextDouble();

    System.out.println("Digite o preço do terceiro produto: ");
    double produto3 = in.nextDouble();

    in.close();

    double menorPreco = produto1;

    if (produto2 < menorPreco) {
      menorPreco = produto2;
    }

    if (produto3 < menorPreco) {
      menorPreco = produto3;
    }

    System.out.println("O produto de valor: " + menorPreco + " é o mais barato e de melhor escolha");

  }
}