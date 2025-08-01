import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("tamanho do arquivo em MB");
    double mb = in.nextDouble();

    System.out.println("velocidade do link de internet em Mbps");
    double mbps = in.nextDouble();

    in.close();

    double segundos = mb / (mbps / 8);
    double minutos = Math.round(segundos / 60);

    System.out.println("o tempo aproximado necessário para baixar o arquivo será de " + minutos + " minutos");
  }
}