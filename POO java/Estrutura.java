public abstract class Estrutura implements Elemento {
    
  public float altura;
  public float largura;
  public float comprimento;
  protected float volume;
  
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

  public Estrutura( float aAltura, float aLargura, float aComprimento ) {
      altura = aAltura;
      largura = aLargura;
      comprimento = aComprimento;
      volume = altura * largura * comprimento;
  }
  public Estrutura(){
    
  }
  
  public abstract void Quebrar( String aNivel );
  
  public abstract void Molhar();
  
}