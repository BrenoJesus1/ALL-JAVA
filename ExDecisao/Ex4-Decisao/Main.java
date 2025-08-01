import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Digite uma letra: ");
    String letra = in.nextLine();
    letra = letra.toUpperCase();

    in.close();

    if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
      System.out.println("A letra é uma vogal");
    }

    else {
      System.out.println("A letra é uma consoante");
    }
  }
}