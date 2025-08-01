import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número: ");
    double n1 = in.nextDouble();

    System.out.println("Digite um segundo numero: ");
    double n2 = in.nextDouble();

    System.out.println("Digite um terceiro numero: ");
    double n3 = in.nextDouble();

    in.close();

    if (n1 > n2 && n1 > n3) {
      System.out.println("O primeiro número digitado é o maior");
    }

    else if (n2 > n1 && n2 > n3) {
      System.out.println("O segundo número digitado é o maior");
    }

    else if (n3 > n1 && n3 > n2) {
      System.out.println("O terceiro número digitado é o maior");
    }

    else if (n3 == n1 && n2 == n1) {
      System.out.println("Os números são iguais");
    }
  }
}