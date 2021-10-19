package fundamentos.aulaInterface;

public class ControleRemoto implements Controlador {
  private boolean status = false;
  private int volume;

  public ControleRemoto(){   
    this.setVolume(0);

  }
  public boolean getStatus(){
    return this.status;
  }
  public void setVolume(int valor){
    this.volume = this.volume + valor;
  }
  public void setLigar(){
    this.status = true;

  }
  @Override
  public void ligar(){
    this.setLigar();
  }
  @Override
  public void aumentarVolume(int valor){
    this.setVolume(valor);
  }
  @Override
  public void desligar(){

  }
  @Override
  public void diminuirVolume(){

  }
  


  
}
