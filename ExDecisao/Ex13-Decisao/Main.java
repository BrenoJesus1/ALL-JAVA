import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite um número de 1 a 7: ");
    int numeroSemana = in.nextInt();

    while (numeroSemana != 1 && numeroSemana != 2 && numeroSemana != 3 && numeroSemana != 4 && numeroSemana != 5
        && numeroSemana != 6 && numeroSemana != 7) {
      System.out.println("Esse número é inválido. Digite um número válido: ");
      numeroSemana = in.nextInt();
    }

    in.close();

    if (numeroSemana == 1) {
      System.out.println("O número " + numeroSemana + "  corresponde ao Domingo");
    }

    else if (numeroSemana == 2) {
      System.out.println("O número " + numeroSemana + "  corresponde a Segunda");
    }

    else if (numeroSemana == 3) {
      System.out.println("O número " + numeroSemana + "  corresponde a Terça");
    }

    else if (numeroSemana == 4) {
      System.out.println("O número " + numeroSemana + "  corresponde a Quarta");
    }

    else if (numeroSemana == 5) {
      System.out.println("O número " + numeroSemana + "  corresponde a Quinta");
    }

    else if (numeroSemana == 6) {
      System.out.println("O número " + numeroSemana + "  corresponde a Sexta");
    }

    else if (numeroSemana == 7) {
      System.out.println("O número " + numeroSemana + "  corresponde a Sábado");
    }

  }
}