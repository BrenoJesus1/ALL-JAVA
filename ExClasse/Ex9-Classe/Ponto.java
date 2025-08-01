public class Ponto {

  public int x, y;

  public Ponto(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int valorX() {
    return x;
  }

  public int valorY() {
    return y;
  }

  public void imprimirPonto() {
    System.out.println("Ponto: " + x + ", " + y);
  }
}