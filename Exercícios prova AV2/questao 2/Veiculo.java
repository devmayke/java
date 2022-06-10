public abstract class Veiculo implements Movimento {

  private String tipo;
  private String nome;
  ///////////////////////// faltava implementar estes setters  ///////////////////////// 


  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  ///////////////////////// faltava implementar estes setters    /////////////////////////


  /////////////////////// falatava esse construtur  /////////////////////// 
  public Veiculo() {

  }
  /////////////////////// falatava esse construtur  /////////////////////// 

  public Veiculo(String aNome) {

    this.nome = aNome;

    this.tipo = "Veículo";

  }
  //////////////////////////////// faltava implementar estes métodos  //////////////////////////////// 

  @Override
  public void descer(int aAltitude) {
  
  }

  @Override
  public void subir(int aAltitude) {
 
  }

  @Override
  public void virarDireita(int aGraus) {

  }

  @Override
  public void virarEsquerda(int aGraus) {

  }
  //////////////////////////////// faltava implementar estes métodos  ////////////////////////////////

  public String toString() {

    return "\nTipo=" + tipo + "\nNome=" + nome + "\nCores=" + getCores();

  }

  public abstract String getCores();

}
