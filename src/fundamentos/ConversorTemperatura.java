package fundamentos;

public class ConversorTemperatura {

  public static void main( String[] args){
    double fahrenheit = 5;
    final double DIMINUI  = 32;
    final double MULTIPLICADOR  = 5. / 9.;
    double celsius = (fahrenheit - DIMINUI) * MULTIPLICADOR;   
    System.out.println(celsius);
  }
  
}
