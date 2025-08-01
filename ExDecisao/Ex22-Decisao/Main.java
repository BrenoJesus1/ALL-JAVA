import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um número");
    int numero = in.nextInt();

    in.close();

    if (numero == 0) {
      System.out.println("O número é neutro");
      return;
    }

    if (numero % 2 == 0) {
      System.out.println("O número é par");
    }

    else {
      System.out.println("O número é impar");
    }
  }
}