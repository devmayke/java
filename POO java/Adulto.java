public class Adulto extends Humano{
  public float imc;
    
    public void Correr() {
        imc = peso / ( altura * altura );
        System.out.println( "Com o IMC de " + imc );
        if ( imc < 25 ) {
            System.out.println( "Corre muito rápido" );
        }
        if ( imc >= 25 && imc < 30 ) {
            System.out.println( "Corre bem" );
        }
        if ( imc >= 30 )
        {
            System.out.println( "Corrida bem lenta e com dificuldade" );
        }
    }
    
    public void trabalhar( int aQtdeHoras ) {
        //
    }
    
    public void trabalhar( int aQtdeHoras, String aLocal ) {
        //
    }
    
    public void trabalhar( boolean aEquipamento ) {
        //
    }
    
    public int trabalhar( double aValor ) {
        return 0;
    }
}
