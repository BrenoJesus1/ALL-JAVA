public class Retangulo {

  public Ponto pontoPartida;
  public int largura, altura;

  public Retangulo(Ponto pontoPartida, int largura, int altura) {
    this.pontoPartida = pontoPartida;
    this.largura = largura;
    this.altura = altura;
  }

  public Ponto encontrarCentro() {
    int centroX = pontoPartida.valorX() + largura / 2;
    int centroY = pontoPartida.valorY() + altura / 2;
    return new Ponto(centroX, centroY);
  }
}