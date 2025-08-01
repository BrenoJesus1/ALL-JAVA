import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número");
    double numero = in.nextDouble();

    in.close();

    double arredondamento = Math.round(numero);

    if (numero == arredondamento) {
      System.out.println("O número é inteiro.");
    } else {
      System.out.println("O número é decimal.");
    }

  }
}