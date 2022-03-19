public class Main {
  public static void main(String[] args) {
   
    
    // Crianca lC = new Bebe( 4.37f, 0.39f );
    // lC.Birra();


    // Humano idoso = new Idoso("status");
    // idoso.Falar();


    


    // Estrutura movel = new Movel(5f,2f,3f, 4);
    // movel.Molhar();
    // movel.Quebrar("médio");
    System.out.println("=================================");
    System.out.println("Cachorros :");
    Animal fila = new Cachorro();
    fila.EmitirSom();
    Animal viraLata = new Cachorro();
    viraLata.EmitirSom();
    System.out.println();
    System.out.println("=================================");



    System.out.println("Pássaros :");
    Passaro pombo = new Passaro();  
    pombo.Comer(); 
    pombo.EmitirSom(); 
    System.out.println();
    System.out.println("=================================");




    System.out.println("Carros :");
    Estrutura fusca = new Movel(1.5f, 2f, 3, 100 );
    fusca.Quebrar("leve");
    System.out.println();
    System.out.println("=================================");




    System.out.println("Prédios :");
    Fixo predio = new Fixo(200f,30f,30f,"Alto");
    System.out.println(predio.altura);
    System.out.println(predio.tipo);
    System.out.println();
    System.out.println("=================================");


    Elemento bebe = new Bebe(2, 3);
    bebe.Andar();








    

  }
}