import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Quanto voce gostaria de sacar? (min:R$10.00 e máx:R$600.00");
    int saque = in.nextInt();

    in.close();

    int quantidadeNotas100 = saque / 100;
    saque %= 100;

    int quantidadeNotas50 = saque / 50;
    saque %= 50;

    int quantidadeNotas10 = saque / 10;
    saque %= 10;

    int quantidadeNotas5 = saque / 5;
    saque %= 5;

    int quantidadeNotas1 = saque;

    if (quantidadeNotas100 > 0) {
      System.out.println(quantidadeNotas100 + " nota(s) de 100");
    }

    if (quantidadeNotas50 > 0) {
      System.out.println(quantidadeNotas50 + " nota(s) de 50");
    }

    if (quantidadeNotas10 > 0) {
      System.out.println(quantidadeNotas10 + " nota(s) de 10");
    }

    if (quantidadeNotas5 > 0) {
      System.out.println(quantidadeNotas5 + " nota(s) de 5");
    }

    if (quantidadeNotas1 > 0) {
      System.out.println(quantidadeNotas1 + " nota(s) de 1");
    }

  }
}