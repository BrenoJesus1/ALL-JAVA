import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("N1");
    int z = in.nextInt();

    System.out.println("N2");
    int x = in.nextInt();

    System.out.println("N3");
    float c = in.nextFloat();

    System.out.println("o produto do dobro do primeiro com metade do segundo");
    System.out.println((z * 2) * (x / 2));
    System.out.println("a soma do triplo do primeiro com o terceiro");
    System.out.println((z * 3) + c);
    System.out.println("o terceiro elevado ao cubo");
    System.out.println(c * c * c);
  }
}