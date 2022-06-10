public class Main{
  public static void main(String[] args){
    try{
      Padaria paes = new Padaria(-100, 82);     
      paes.MostrarTabelaPreco();    
    }
    catch( NumeroNegativoException error){
      System.out.println(error);
    }     
  }  
}
