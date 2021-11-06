package fundamentos.ufc

public class Lutador{
  private String nome;
  private int vitoria;
  private int derrota;
  private int empate;

  public Lutador(){
    this.setVitoria(0);
    this.setEmpate(0);
    this.setDerrota(0);

  }
  public void setNome(String nomeValue){
    this.nome =  nomeValue;
  }
  public String getNome(){
    return this.nome;
  }
  public setVitoria(int vitoriaValue){
    this.vitoria = vitoriaValue;
  }
  public int getVitoria(){
    return this.vitoria;

  }
  public setEmpate(int empateValue){
    this.empate = empateValue;
  }
  public int getEmpate(){
    return this.empate;

  }public setDerrota(int derrotaValue){
    this.derrota = derrotaValue;
  }
  public int getDerrota(){
    return this.derrota;

  }
  


}