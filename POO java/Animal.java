
public abstract class Animal implements Elemento {
    
  public float peso;
  public float altura;
  
  // public Animal( float aPeso, float aAltura ) {
  //     peso = aPeso;
  //     altura = aAltura;
  // }
  
  
  @Override
  public void Andar() {
    // TODO Auto-generated method stub
    
  }
  
  @Override
  public void Comer() {
    // TODO Auto-generated method stub
    
  }
  
  @Override
  public void Correr() {
    // TODO Auto-generated method stub
    
  }
  
  @Override
  public void EmitirSom() {
    // TODO Auto-generated method stub
    
  }
  
  public abstract void andar();
  public abstract void comer();  
  public abstract void emitirSom();
}