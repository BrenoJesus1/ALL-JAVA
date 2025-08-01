import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Retangulo r1 = new Retangulo();

    Double areaPiso = 0.25;
    Double comprimentoRodape = 0.1;

    System.out.println("Informe a base do local medido: ");
    r1.base = in.nextDouble();

    System.out.println("Informe a altura do local medido: ");
    r1.altura = in.nextDouble();

    in.close();

    Double pisos = r1.calcularArea() / areaPiso;
    Double rodapes = r1.calcularPerimetro() / comprimentoRodape;

    System.out.println("O seu local possui: \nBase: " + r1.retornarBase() + "\nAltura: " + r1.retornarAltura()
        + "\nÁrea: " + r1.calcularArea() + "\nPerimetro: " + r1.calcularPerimetro()
        + "\nA quantidade de pisos necessários serão de: " + pisos + "\nA quantidade de rodapés necessários serão de: "
        + rodapes);
  }
}
