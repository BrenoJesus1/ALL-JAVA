public class Retangulo {

  protected Double base, altura, area, perimetro;

  public void mudarBase(Double novaBase) {
    base = novaBase;
  }

  public void mudarAltura(Double novaAltura) {
    altura = novaAltura;
  }

  public Double retornarBase() {
    return base;
  }

  public Double retornarAltura() {
    return altura;

  }

  public Double calcularArea() {
    area = base * altura;
    return area;
  }

  public Double calcularPerimetro() {
    perimetro = 2 * (base + altura);
    return perimetro;
  }

}
