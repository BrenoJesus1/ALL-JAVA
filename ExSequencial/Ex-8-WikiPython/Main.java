import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("salário por hora:");
    float s = in.nextFloat();

    System.out.println("número de horas trabalhadas no mes:");
    float h = in.nextFloat();

    System.out.println("sálario mensal");
    System.out.println(s * h);
  }
}