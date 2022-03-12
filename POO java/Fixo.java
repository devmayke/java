public class Fixo extends Estrutura {
    
  public String tipo;
  
  public Fixo( float aAltura, float aLargura, float aComprimento, 
  String aTipo ) {
      super( aAltura, aLargura, aComprimento );
      tipo = aTipo;
  }
  public Fixo(){

  }
  
  
  @Override
  public void Quebrar( String aNivel ) {
      if ( "Leve".equalsIgnoreCase( aNivel ) ) {
          System.out.println( "Causar uma sujeira" );
      }
      else if ( "Médio".equalsIgnoreCase( aNivel ) ) {
          System.out.println( "Interdição do Local" );
      }
      else if ( "Grande".equalsIgnoreCase( aNivel ) ) {
          System.out.println( "Impacto em outros objetos" );
      }
      else {
          System.out.println( "Destruição Total" );
      }
  }

  
  @Override
  public void Molhar() {
      System.out.println( "Fazer dança da chuva" );
  }
  
}