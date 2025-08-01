import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("lado");
    float l = in.nextFloat();

    System.out.println("área");
    System.out.println(l * l);
    System.out.println("área x 2");
    System.out.println(l * l * 2);
  }
}
