import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Macaco m1 = new Macaco("Koba");
    Macaco m2 = new Macaco("César");

    System.out.println(m1.nome + m1.comer("banana"));
    System.out.println(m1.verEstomago());
    System.out.println(m1.nome + m1.comer("laranja"));
    System.out.println(m1.verEstomago());
    System.out.println(m1.nome + m1.comer("melancia"));
    System.out.println(m1.verEstomago());
    System.out.println(m1.nome + m1.digerir());
    System.out.println(m1.verEstomago());

    System.out.println("");

    System.out.println(m2.nome + m2.comer("maçã"));
    System.out.println(m2.verEstomago());
    System.out.println(m2.nome + m2.comer("uva"));
    System.out.println(m2.verEstomago());
    System.out.println(m2.nome + m2.comer("manga"));
    System.out.println(m2.verEstomago());
    m2.comerMacaco(m1);
    System.out.println(m2.verEstomago());
    System.out.println(m2.nome + m2.digerir());
    System.out.println(m2.verEstomago());

  }
}