import java.util.ArrayList;

public class Macaco {

  protected String nome;
  protected ArrayList<String> estomago;

  public Macaco(String nome) {
    this.nome = nome;
    this.estomago = new ArrayList<>();
  }

  public String comer(String comida) {
    estomago.add(comida);
    return " comeu " + comida;
  }

  public String verEstomago() {
    return "O estomago dele contém: " + estomago;
  }

  public String digerir() {
    estomago.clear();
    return " está digerindo";
  }

  public void comerMacaco(Macaco macaco) {
    estomago.add(macaco.nome);
    System.out.println(nome + " comeu o macaco " + macaco.nome);
  }

}