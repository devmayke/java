public abstract class Veiculo implements Movimento {

  private String tipo;
  
  private String nome;
  
  public Veiculo( String aNome ) {
  
  this.nome = aNome;
  
  this.tipo = "Veículo";
  
  }
  
  public String toString() {
  
  return "\nTipo=" + tipo
  
  + "\nNome=" + nome
  
  + "\nCores=" + getCores();
  
  }
  
  public abstract String getCores();
  
  }