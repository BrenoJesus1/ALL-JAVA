import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número:");
    double numero1 = in.nextDouble();

    System.out.println("Digite outro número:");
    double numero2 = in.nextDouble();

    in.close();

    if (numero1 > numero2) {
      System.out.println("O número: " + numero1 + " é maior");
    } else if (numero1 == numero2) {
      System.out.println("Os números são iguais");
    } else {
      System.out.println("O número: " + numero2 + "é maior");
    }
  }
}