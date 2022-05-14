import java.util.ArrayList;

public class Main {
  public static final int MAX = 10;

  public static void main(String[] args) {

    // Crianca lC = new Bebe( 4.37f, 0.39f );
    // lC.Birra();

    // Humano idoso = new Idoso("status");
    // idoso.Falar();

    // Estrutura movel = new Movel(5f,2f,3f, 4);
    // movel.Molhar();
    // movel.Quebrar("médio");
    // System.out.println("=================================");
    // System.out.println("Cachorros :");
    // Animal fila = new Cachorro();
    // fila.EmitirSom();
    // Animal viraLata = new Cachorro();
    // viraLata.EmitirSom();
    // System.out.println();
    // System.out.println("=================================");

    // System.out.println("Pássaros :");
    // Passaro pombo = new Passaro();
    // pombo.Comer();
    // pombo.EmitirSom();
    // System.out.println();
    // System.out.println("=================================");

    // System.out.println("Carros :");
    // Estrutura fusca = new Movel(1.5f, 2f, 3, 100 );
    // fusca.Quebrar("leve");
    // System.out.println();
    // System.out.println("=================================");

    // System.out.println("Prédios :");
    // Fixo predio = new Fixo(200f,30f,30f,"Alto");
    // System.out.println(predio.altura);
    // System.out.println(predio.tipo);
    // System.out.println();
    // System.out.println("=================================");

    // Elemento bebe = new Bebe(2, 3);
    // bebe.Andar();

    // ArrayList<Elemento> lista = new ArrayList<Elemento>();

    // lista.add(new Idoso("Pedro Alvares Cabral", "000.000.000-00"));
    // lista.add(new Bebe());
    // lista.add(new Fixo());

    // for(Elemento el: lista){
    // if(el instanceof Humano){
    // el.Andar();
    // el.EmitirSom();

    // }

    // if(el instanceof Fixo){
    // ( (Fixo) el).Molhar();
    // }
    // if(el instanceof Idoso){
    // System.out.println(((Idoso)el).getNome());

    // }
    // }

    // Idoso idoso = new Idoso("Pedro Alvares Cabral", "000.000.000-00");

    // Adulto pedro = new Adulto();
    // Adulto joao = new Adulto();
    // Idoso jose = new Idoso();
    // Bebe julio = new Bebe();

    // Relacionamento relacionamento = new Relacionamento(pedro, joao, "Amigos");
    // System.out.println(relacionamento.getRelacionamento());

    // Relacionamento relacionamento2 = new Relacionamento(jose, pedro, "Pai e
    // filho");
    // System.out.println(relacionamento2.getRelacionamento());

    // Relacionamento relacionamento3 = new Relacionamento(jose, julio, "Irmãos");
    // System.out.println(relacionamento3.getRelacionamento());

    // Adulto adulto = new Adulto(1.8f, 80f);
    // adulto.Comer();

    ArrayList<ContadorThread> lista = new ArrayList<ContadorThread>();
    for (int i = 0; i < MAX; i++) {
      lista.add(new ContadorThread(i));
    }
    for (int i = 0; i < MAX; i++) {

      Thread t1 = new Thread(lista.get(i));
      t1.start();
    }

  }
}