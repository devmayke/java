public class Passaro extends Animal  {
    
  public String tipo;

  // public Passaro( float aPeso, float aAltura, String aTipo ) {
  //     super( aPeso, aAltura );
  //     tipo = aTipo;
  // }
  
  
  @Override
  public void Andar() {
      System.out.println( "Pulando" );
  }
  
  public void voar() {
      System.out.println( "Bate asas" );
  }
  
  @Override
  public void Comer() {
      System.out.println( "Come ração" );
  }
  
  @Override
  public void EmitirSom() {
      System.out.println( "Canta" );
  }
}