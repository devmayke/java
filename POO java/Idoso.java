public class Idoso extends Humano {
    
  public static final int VELOC_ANDAR = 1; // metros por segundo
  
  protected boolean teveFilhos;
  private boolean aposentado;
  


  public Idoso(String status){
      if(status == "status"){
        this.status();
      }else{
          System.out.println("A string '" + status + "' passada no construtor não pôde retornar nenhum resultado. Tente 'status'" );

      }


  }

  public void status(){
      System.out.println( "============================================================" );
      System.out.println("O Status do idoso é :");
      System.out.print( "Andar: " );
      this.Andar();
      System.out.print("Correr: " );
      this.Correr();
      System.out.print("Comer: ");
      this.Comer();
      System.out.print("Falar: " );
      this.Falar();
      System.out.println( "============================================================" );


  }

  
  public Idoso( boolean aComFilhos ) {
      this.teveFilhos = aComFilhos;
      this.aposentado = false;
  }
  
  public Idoso () {
      this( false );
  }
  
//   @Override
  public void Andar() {
      System.out.println( "Anda bem devagar" );
  }
  
//   @Override
  public void Correr() {
      System.out.println( "Ela não corre" );
  }
  
  @Override
  public void Comer() {
      System.out.println( "Tem restrições Alimentares" );
  }
  
  @Override
  public void Falar() {
      super.Falar();
      System.out.println( "...para ouvintes desatentos" );
  }
  
}
