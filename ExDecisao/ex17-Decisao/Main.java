import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um ano");
    int ano = in.nextInt();

    in.close();

    if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
      System.out.println("O ano é bissexto");
    }

    else {
      System.out.println("O ano não é bissexto");
    }
  }
}