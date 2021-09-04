package fundamentos;

public class ConversorTemperatura {

  public static void main( String[] args){
    double valorInicial = 5;
    final double eq1 = 32;
    final double eq2 = 5. / 9.;
    double resultado = (valorInicial - eq1) * eq2;   
    System.out.println(resultado);
  }
  
}
