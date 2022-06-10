public class Drone extends Veiculo {
  //////////////////////////////// faltava ; ////////////////////////////////
  // private int qtdeRotores = 4 ---> errado
  private int qtdeRotores = 4;
  //////////////////////////////// faltava ; ////////////////////////////////

  @Override

  public String toString() {

    return super.toString() + "\nQtde Rotores=" + qtdeRotores;

  }

  @Override

  public String getCores() {

    return "Vermelho, branco, verde";

  }

  public void virarDireita(int aGraus) {

    // Aumentar a velocidade dos rotores da esquerda

  }

  public void subir(int aAltitude) {

    // Aumentar a velocidade de todos os rotores

  }

  public void descer(int aAltitude) {

    // Diminuir a velocidade de todos os rotores

  }

  //////////////////////////////// faltava implementar este método  ////////////////////////////////
  public void virarEsquerda(int aGraus) {
  }
  //////////////////////////////// faltava implementar este método  ////////////////////////////////

  //////////////////////////////// faltava o construtor com estes setters //////////////////////////////// 
  public Drone(String nome) {
    setNome(nome);
    setTipo("Drone");
  }
  //////////////////////////////// faltava o construtor com estes setters //////////////////////////////// 

}
