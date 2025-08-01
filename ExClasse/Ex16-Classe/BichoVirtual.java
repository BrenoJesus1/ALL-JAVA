class BichoVirtual {

  private String nome;
  private int idade, saciedade, saude;

  public void alterarNome(String novoNome){
    nome = novoNome;
  }

  public void alterarIdade(int novaIdade){
    idade = novaIdade;
  }

  public void alterarFome(int novaFome){
    saciedade = novaFome;
  }

  public void alterarSaude(int novaSaude){
    saude = novaSaude;
  }

  public String retornarNome(){
  return nome;
  }

  public int retornarFome(){
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
    else if(saude<0){
      saude = 0;
    }
  }

  public String humor() {
    int humor = (int) Math.floor((saude + saciedade) / 2);
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
      return "Humor ainda não definido";
    }
  }
  
  public String str() {
    return "Nome: " + nome + "\nIdade: " + idade + "\nSaciedade: " + saciedade + "\nSaúde: " + saude;
  }
  

}