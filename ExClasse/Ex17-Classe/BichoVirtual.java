import java.util.Random;

class BichoVirtual {

  private String nome;
  private int idade, saciedade, saude;

  public BichoVirtual(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    this.saciedade = gerarValorAleatorio();
    this.saude = gerarValorAleatorio();
  }

  public void fornecerComida(int quantidadeComida) {
    saciedade += quantidadeComida;
    if (saciedade < 0) {
      saciedade = 0;
    } else if (saciedade > 5) {
      saciedade = 5;
    }
  }

  public void brincar(int tempoBrincadeira) {
    saude += tempoBrincadeira;
    if (saude > 5) {
      saude = 5;
    }
  }

  public String humor() {
    int humor = (int) Math.floor((saude + saciedade) / 2);
    if (humor == 1) {
      return "Humor ruim";
    } else if (humor == 2 || humor == 3) {
      return "Humor bom";
    } else if (humor == 4 || humor == 5) {
      return "Humor ótimo";
    } else {
      return "Humor ainda não definido.";
    }
  }

  private int gerarValorAleatorio() {
    Random random = new Random();
    return random.nextInt(6);
  }

  public String retornarNome() {
    return nome;
  }

  public String str() {
    return "Nome: " + nome + "\nIdade: " + idade + "\nSaciedade: " + saciedade + "\nSaúde: " + saude;
  }
}
