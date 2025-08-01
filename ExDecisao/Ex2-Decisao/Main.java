import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int numero;

    System.out.println("Digite um número:");
    numero = in.nextInt();

    in.close();

    if (numero > 0) {
      System.out.println("O valor é positivo");
    }

    else {
      System.out.println("O valor é negativo");
    }

  }
}