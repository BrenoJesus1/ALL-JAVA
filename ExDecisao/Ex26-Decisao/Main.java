import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double valorAlcoolDesconto3 = 1.843;
    double valorAlcoolDesconto5 = 1.805;
    double valorGasolinaDesconto4 = 2.4;
    double valorGasolinaDesconto6 = 2.35;

    System.out.println("Quantidade de litros: ");
    double litros = in.nextDouble();
    in.nextLine();

    System.out.println("Tipo de combustível (A- alcool ou G- Gasolina): ");
    String tipo = in.nextLine();

    in.close();

    if (tipo.equalsIgnoreCase("A") && litros <= 20) {
      double valorTotal = litros * valorAlcoolDesconto3;
      System.out.println("O valor a ser pago é: " + valorTotal);
    } else if (tipo.equalsIgnoreCase("A") && litros > 20) {
      double valorTotal = litros * valorAlcoolDesconto5;
      System.out.println("O valor a ser pago é: " + valorTotal);
    }

    if (tipo.equalsIgnoreCase("G") && litros <= 20) {
      double valorTotal = litros * valorGasolinaDesconto4;
      System.out.println("O valor a ser pago é: " + valorTotal);
    } else if (tipo.equalsIgnoreCase("G") && litros > 20) {
      double valorTotal = litros * valorGasolinaDesconto6;
      System.out.println("O valor a ser pago é: " + valorTotal);
    }
  }
}