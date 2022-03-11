public abstract class Estrutura {
    
  public float altura;
  public float largura;
  public float comprimento;
  protected float volume;
  
  public Estrutura( float aAltura, float aLargura, float aComprimento ) {
      altura = aAltura;
      largura = aLargura;
      comprimento = aComprimento;
      volume = altura * largura * comprimento;
  }
  
  public abstract void Quebrar( String aNivel );
  
  public abstract void Molhar();
  
}