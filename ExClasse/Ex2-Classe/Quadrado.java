public class Quadrado {

  private Double lado, area;

  public void mudarLado(Double novoLado){
    lado = novoLado;
  }

  public Double valorLado(){
    return lado;
  }

  public Double calcularArea(){
    area = lado*lado;
    return area;
  }
    }
