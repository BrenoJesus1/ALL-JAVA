import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int resultado = 0;

    System.out.println("Telefonou para a vítima? (S/N)");
    String telefonouPara = in.nextLine();
    if (telefonouPara.equalsIgnoreCase("S")) {
      resultado = resultado + 1;
    }

    System.out.println("Esteve no local do crime? (S/N)");
    String esteveNolocal = in.nextLine();
    if (esteveNolocal.equalsIgnoreCase("S")) {
      resultado = resultado + 1;
    }

    System.out.println("Mora perto da vítima? (S/N)");
    String moraPerto = in.nextLine();
    if (moraPerto.equalsIgnoreCase("S")) {
      resultado = resultado + 1;
    }

    System.out.println("Devia para a vítima? (S/N)");
    String deveDinheiro = in.nextLine();
    if (deveDinheiro.equalsIgnoreCase("S")) {
      resultado = resultado + 1;
    }

    System.out.println("Já trabalhou com a vítima? (S/N)");
    String trabalhouCom = in.nextLine();
    if (trabalhouCom.equalsIgnoreCase("S")) {
      resultado = resultado + 1;
    }

    in.close();

    if (resultado == 0 || resultado == 1) {
      System.out.println("Inocente");
    }

    else if (resultado == 2) {
      System.out.println("Suspeito");
    }

    else if (resultado == 3 || resultado == 4) {
      System.out.println("Cúmplice");
    }

    else if (resultado == 5) {
      System.out.println("Assassino");
    }

  }
}