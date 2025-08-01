import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Insira a nota A1 do Aluno: ");
    double A1 = in.nextDouble();

    System.out.println("Insira a nota A2 do Aluno: ");
    double A2 = in.nextDouble();

    System.out.println("Insira a nota A1 do Aluno: ");
    double A3 = in.nextDouble();

    in.close();

    double media = (A1 + A2 + A3) / 3;

    if (media == 10) {
      System.out.println("O aluno foi aprovado com distinção");
    }

    else if (media < 7) {
      System.out.println("O aluno foi reprovado");
    }

    else if (media >= 7 && media != 10) {
      System.out.println("O aluno foi aprovado");
    }

  }
}
