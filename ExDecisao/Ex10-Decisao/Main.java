import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Em qual turno voce estuda? (Digite M-matutino ou V-Vespertino ou N- Noturno)");
    String turno = in.nextLine();
    turno = turno.toUpperCase();

    in.close();

    if (turno.equals("M")) {
      System.out.println("Bom dia");
    } else if (turno.equals("V")) {
      System.out.println("Boa tarde");
    } else if (turno.equals("N")) {
      System.out.println("Boa noite");
    }

    else {
      System.out.println("Valor inválido");
    }

  }
}