package fundamentos.desafio;

public class Jantar {
  public static void main(String[] args){
    Pessoa p1 = new Pessoa("Mayke", 80);
    Comida arroz = new Comida("Arroz", 0.250);
    Comida feijao = new Comida("Feijao", 0.400);
    p1.comer(arroz.peso);
    p1.comer(feijao.peso);
    p1.comer(arroz.peso);
    Pessoa p2 = new Pessoa("Adriana", 62);
    p2.comer(feijao.peso);
    System.out.println("O " + p1.nome + " aumentou seu peso para " + p1.peso + "kg");    
    System.out.print("O " + p2.nome + " aumentou seu peso para " + p2.peso + "kg");    

  }
  
}
