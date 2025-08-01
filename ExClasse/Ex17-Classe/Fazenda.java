import java.util.ArrayList;
import java.util.List;

class Fazenda {
  private List<BichoVirtual> bichinhos;

  public Fazenda() {
    bichinhos = new ArrayList<>();
  }

  public void adicionarBichinho(BichoVirtual bicho) {
    bichinhos.add(bicho);
  }

  public void alimentarBichinhos(int quantidadeComida) {
    for (BichoVirtual bicho : bichinhos) {
      bicho.fornecerComida(quantidadeComida);
    }
  }

  public void brincarComBichinhos(int tempoBrincadeira) {
    for (BichoVirtual bicho : bichinhos) {
      bicho.brincar(tempoBrincadeira);
    }
  }

  public void ouvirBichinhos() {
    for (BichoVirtual bicho : bichinhos) {
      System.out.println("Humor do " + bicho.retornarNome() + ": " + bicho.humor());
    }
  }

  public String str() {
    StringBuilder sb = new StringBuilder();
    for (BichoVirtual bicho : bichinhos) {
      sb.append(bicho.str()).append("\n");
    }
    return sb.toString();
  }
}