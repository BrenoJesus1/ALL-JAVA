public class Pessoa {

  private String nome;
  private int idade;
  private double peso, altura;

  public void envelhecer() {
    idade++;
    if (idade < 21) {
      crescer(0.5);
    }
  }

  public double engordar(double pesoGanho) {
    peso += pesoGanho;
    return peso;
  }

  public double emagrecer(double pesoPerdido) {
    peso -= pesoPerdido;
    return peso;
  }

  public double crescer(double alturaGanha) {
    altura += alturaGanha;
    return altura;
  }
}