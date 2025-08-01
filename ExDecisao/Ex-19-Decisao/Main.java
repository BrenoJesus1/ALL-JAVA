import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Insira um número menor que 1000");
    int numero = in.nextInt();

    in.close();

    int centena = (int) Math.floor(numero / 100);
    int dezena = (int) Math.floor((numero % 100) / 10);
    int unidade = (numero % 100) % 10;

    System.out.println(centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades");
  }
}