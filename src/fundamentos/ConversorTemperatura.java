package fundamentos;

public class ConversorTemperatura {

  public static void main( String[] args){
    double fahrenheit = 5;
    final double diminui = 32;
    final double multiplicador  = 5. / 9.;
    double celsius = (fahrenheit - diminui) * multiplicador;   
    System.out.println(celsius);
  }
  
}
