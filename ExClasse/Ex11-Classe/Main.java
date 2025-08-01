public class Main {
  public static void main(String[] args) {
    Carro uno = new Carro(15);
    uno.adicionarGasolina(20);
    uno.andar(100);
    System.out.println("Nível de combustível: " + uno.obterGasolina() + " litros.");
  }
}