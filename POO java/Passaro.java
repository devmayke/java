public class Passaro extends Animal  {
    
  public String tipo;

  // public Passaro( float aPeso, float aAltura, String aTipo ) {
  //     super( aPeso, aAltura );
  //     tipo = aTipo;
  // }
  
  
  @Override
  public void andar() {
      System.out.println( "Pulando" );
  }
  
  public void voar() {
      System.out.println( "Bate asas" );
  }
  
  @Override
  public void comer() {
      System.out.println( "Come ração" );
  }
  
  @Override
  public void emitirSom() {
      System.out.println( "Canta" );
  }
}