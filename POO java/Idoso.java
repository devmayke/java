public class Idoso extends Humano {
    
  public static final int VELOC_ANDAR = 1; // metros por segundo
  
  protected boolean teveFilhos;
  private boolean aposentado;
  
  public Idoso( boolean aComFilhos ) {
      this.teveFilhos = aComFilhos;
      this.aposentado = false;
  }
  
  public Idoso () {
      this( false );
  }
  
  @Override
  public void Andar() {
      System.out.println( "Anda bem devagar" );
  }
  
  @Override
  public void Correr() {
      System.out.println( "Ela não corre" );
  }
  
  @Override
  public void Comer() {
      System.out.println( "Tem restrições Alimentares" );
  }
  
  @Override
  public void Falar() {
      System.out.println( "Fala pausadamente" );
  }
  
}
