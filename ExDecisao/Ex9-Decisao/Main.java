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

    double maior, meio, menor;

    if (n1 >= n2 && n1 >= n3) {
      maior = n1;
      if (n2 >= n3) {
        meio = n2;
        menor = n3;
      } else {
        meio = n3;
        menor = n2;
      }
    }

    else if (n2 >= n1 && n2 >= n3) {
      maior = n2;
      if (n1 >= n3) {
        meio = n1;
        menor = n3;
      } else {
        meio = n3;
        menor = n1;
      }
    }

    else {
      maior = n3;
      if (n1 >= n2) {
        meio = n1;
        menor = n2;
      } else {
        meio = n2;
        menor = n1;
      }
    }

    System.out
        .println("O maior numero é: " + maior + " , o numero do meio é: " + meio + " , o menor numero é: " + menor);
  }
}