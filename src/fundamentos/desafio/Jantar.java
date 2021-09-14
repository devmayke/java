package fundamentos.desafio;

public class Jantar {
  public static void main(String[] args){
    Pessoa p1 = new Pessoa("Mayke", 80);
    Comida c1 = new Comida("Arroz", 0.250);
    Comida c2 = new Comida("Feijao", 0.400);
    p1.comer(c1);
    p1.comer(c2);
    p1.comer(c1);
    Pessoa p2 = new Pessoa("Adriana", 62);
    p2.comer(c2);
    p2.comer(c1);
    p1.apresentar();
    p2.apresentar();  
  }  
}
