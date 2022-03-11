public class Movel extends Estrutura {
    
  public int velocidade; // metros por segundo
  
  public Movel( float aAltura, float aLargura, float aComprimento, 
  int aVelocidade ) {
      super( aAltura, aLargura, aComprimento );
      velocidade = aVelocidade;
  }
  
  @Override
  public void Quebrar( String aNivel ) {
      if ( "Leve".equalsIgnoreCase( aNivel ) ) {
          System.out.println( "Causar um pequeno dano" );
      }
      else if ( "Médio".equalsIgnoreCase( aNivel ) ) {
          System.out.println( "Tá impossibilitado de uso" );
      }
      else if ( "Grande".equalsIgnoreCase( aNivel ) ) {
          System.out.println( "Jogar Fora" );
      }
      else {
          System.out.println( "Destruição Total" );
      }
  }
  
  @Override
  public void Molhar() {
      if ( volume < 10 ) { System.out.println( "Pouca água" ); }
      else { System.out.println( "Muita água" ); }
  }
}