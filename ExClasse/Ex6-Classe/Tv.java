public class Tv {

  protected int canal, volume;

  public Tv(int canal, int volume) {
    this.canal = canal;
    this.volume = volume;
  }

  public void aumentarVolume() {
    if (volume >= 0 && volume <= 24) {
      volume++;
    } else {
      System.out.println("Volume máximo");
    }
  }

  public void diminuirVolume() {
    if (volume > 0) {
      volume--;
    } else {
      System.out.println("Volume mínimo");
    }
  }

}
