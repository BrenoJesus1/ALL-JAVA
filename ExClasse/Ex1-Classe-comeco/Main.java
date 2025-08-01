class Main {
  public static void main(String[] args) {
    Bola b1 = new Bola();

    b1.circunferencia = 1.7587;

    b1.material = "Borracha";

    b1.cor = "Azul";
    System.out.println("A cor atual é: " + b1.mostraCor());

    b1.trocaCor("Verde");
    System.out.println("A nova cor é: " + b1.cor);

    System.out.println("O material da bola é: " + b1.material);
    System.out.println("A circunferencia da bola é: " + b1.circunferencia);
  }
}