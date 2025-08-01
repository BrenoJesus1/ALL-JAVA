import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Informe um número");
    double n1 = in.nextDouble();

    System.out.println("Informe outro número");
    double n2 = in.nextDouble();

    System.out.println("Qual operação deseja realizar? (1- Adição, 2- subtração, 3- multiplicação ou 4-divisão)");
    int operacao = in.nextInt();

    in.close();
    
    double soma = n1 + n2;
    double subtracao = n1 - n2;
    double multiplicacao = n1 * n2;
    double divisao = n1 / n2;
    double resultado = 0;

    if (operacao == 1) {
      resultado = soma;
      System.out.println("O resultado é: " + resultado);
    }

    if (operacao == 2) {
      resultado = subtracao;
      System.out.println("O resultado é: " + resultado);
    }

    if (operacao == 3) {
      resultado = multiplicacao;
      System.out.println("O resultado é: " + resultado);
    }

    if (operacao == 4) {
      resultado = divisao;
      System.out.println("O resultado é: " + resultado);
    }

    double arredondamento = Math.round(resultado);

    if (resultado > 0) {
      System.out.println("O resultado é positivo");
    } else if (resultado == 0) {
      System.out.println("O resultado é neutro");
      return;
    } else {
      System.out.println("O resultado é negativo");
    }

    if (resultado == arredondamento) {
      System.out.println("O resultado é inteiro.");
    }

    else {
      System.out.println("O resultado é decimal.");
      return;
    }

    if (resultado % 2 == 0) {
      System.out.println("O resultado é um número par");
    } else {
      System.out.println("O resultado é um número impar");
    }

  }
}