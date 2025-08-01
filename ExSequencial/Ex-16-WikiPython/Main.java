import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Área em m² a ser pintada");
    double area = in.nextDouble();
    double litros = area / 3;
    double latas = Math.ceil(litros / 18);
    double preco = latas * 80;
    System.out.println("Voce precisará de " + latas + " lata(s) e terá um gasto de R$" + preco);
  }
}
