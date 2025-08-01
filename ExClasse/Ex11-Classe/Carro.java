public class Carro {

  public double consumoCombustivel, nivelCombustivel;

  public Carro(double consumoCombustivel) {
    this.consumoCombustivel = consumoCombustivel;
    this.nivelCombustivel = 0;
  }

  public void andar(double distancia) {
    double combustivelNecessario = distancia / consumoCombustivel;
    if (combustivelNecessario <= nivelCombustivel) {
      nivelCombustivel -= combustivelNecessario;
      System.out.println("O carro percorreu " + distancia + " quilômetros.");
    } else {
      System.out.println("Não possui combustível suficiente para percorrer essa distância.");
    }
  }

  public double obterGasolina() {
    return nivelCombustivel;
  }

  public void adicionarGasolina(double quantidade) {
    nivelCombustivel += quantidade;
    System.out.println("Tanque agora possui " + nivelCombustivel + " litros de gasolina.");
  }
}