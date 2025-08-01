class BichoVirtual {

  private String nome;
  private int idade, saciedade, saude;

  public void alterarNome(String novoNome){
    nome = novoNome;
  }

  public void alterarIdade(int novaIdade){
    idade = novaIdade;
  }

  public void alterarSaciedade(int novaSaciedade){
    saciedade = novaSaciedade;
  }

  public void alterarSaude(int novaSaude){
    saude = novaSaude;
  }

  public String retornarNome(){
  return nome;
  }

  public int retornarSaciedade(){
  return saciedade;
  }

  public int retornarSaude(){
  return saude;
  }

  public int retornarIdade(){
  return idade;
  }

   public void fornecerComida(int quantidadeComida) {
    saciedade += quantidadeComida;
    if (saciedade < 0) {
      saciedade = 0;
    }
     else if(saciedade>5){
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
    int humor = (saude+saciedade)/2;
    if(humor==1){
      return "Humor ruim";
    }
    else if(humor==2 || humor==3){
      return "Humor bom";
    }
    else if(humor==4 || humor==5){
      return "Humor ótimo";
    }
    else {
      return "Humor ainda não definido.";
    }
  }
  

}