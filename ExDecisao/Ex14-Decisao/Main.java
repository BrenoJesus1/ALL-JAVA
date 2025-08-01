import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String conceito;
    float a1, a2, media;

    conceito = "";

    System.out.println("Nota A1: ");
    a1 = in.nextFloat();

    System.out.println("Nota A2: ");
    a2 = in.nextFloat();

    in.close();

    System.out.println("");

    media = (a1 + a2) / 2;

    if (media >= 9 && media <= 10) {
      conceito = "A\nAprovado";
    }

    else if (media >= 7.5 && media < 9) {
      conceito = "B\nAprovado";
    }

    else if (media >= 6 && media < 7.5) {
      conceito = "C\nAprovado";
    }

    else if (media >= 4 && media < 6) {
      conceito = "D\nReprovado";
    }

    else if (media >= 0 && media < 4) {
      conceito = "E\nReprovado";
    }

    System.out.println("Nota A1: " + a1 + "\nNota A2: " + a2 + "\nMédia: " + media + "\nNota de conceito: " + conceito);

  }
}