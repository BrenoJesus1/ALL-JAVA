import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Complete a equação de segundo grau com os valores desejados");

    System.out.print("a = ");
    int a = in.nextInt();

    if (a == 0) {
      System.out.println("A equação não é de segundo grau");
      return;
    }

    System.out.print("b = ");
    int b = in.nextInt();

    System.out.print("c = ");
    int c = in.nextInt();

    in.close();

    System.out.println(a + "x² + (" + b + ")x + (" + c + ")");

    double delta = Math.pow(b, 2) - (4 * a * c);

    if (delta < 0) {
      System.out.println("A equação não possui raízes reais");
      return;
    }

    double raiz1 = (-b - Math.sqrt(delta)) / (2 * a);

    if (delta == 0) {
      System.out.println("A equação possui apenas a raíz real de número: " + raiz1);
    }

    double raiz2 = (-b + Math.sqrt(delta)) / (2 * a);

    if (delta > 0) {
      System.out.println("A equação possui 2 raízes reais, são elas: " + raiz1 + " e " + raiz2);
    }

  }
}