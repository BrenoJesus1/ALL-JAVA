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

    double maior = n1;
    double menor = n1;

    if (n2 > maior) {
      maior = n2;
    }

    if (n3 > maior) {
      maior = n3;
    }

    if (n2 < menor) {
      menor = n2;
    }

    if (n3 < menor) {
      menor = n3;
    }

    System.out.println("O maior número é: " + maior);
    System.out.println("O menor número é: " + menor);
  }
}