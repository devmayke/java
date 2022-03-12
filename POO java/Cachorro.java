public class Cachorro extends Animal {
    
  public String raca;

  public Cachorro( float aPeso, float aAltura, String aRaca ) {
      super( aPeso, aAltura );
      raca = aRaca;
  }
  public Cachorro(){
      
  }
  @Override
  public void andar() {
      System.out.println( "PDD - PTE - PDE - PTD" );
  }
  
  @Override
  public void comer() {
      System.out.println( "Come ração" );
      String lValor;
      if ( peso < 2 ) { lValor = "100 gramas"; }
      else if ( peso >= 2 && peso <5 ) { lValor = "300 gramas"; }
      else if ( peso >= 5 && peso <8 ) { lValor = "500 gramas"; }
      else if ( peso >= 8 && peso <10 ) { lValor = "800 gramas"; }
      else { lValor = "1 kilo"; }
      System.out.println( "Cerca de " + lValor + " por dia" );
  }
  
  @Override
  public void emitirSom() {
      System.out.println( "Latir" );
  }
}