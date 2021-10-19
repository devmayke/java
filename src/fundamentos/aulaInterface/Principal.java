package fundamentos.aulaInterface;

public class Principal {
  public static void main(String[] args) {
    ControleRemoto tv = new ControleRemoto();
    tv.ligar();
    System.out.println(tv.getStatus());
  }

}
