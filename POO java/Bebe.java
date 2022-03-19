public class Bebe extends Crianca {
  // @Override
  // public String falar(){

  // return super.falar() + "bebê";

  // }
  public static final int VELOC_ANDAR = 0; // metros por segundo
  public static int SENTE_FOME = 2; // a cada x horas
  protected final boolean prematuro;

  public float peso; // informação do nascimento
  public float altura; // informação do nascimento

  public Bebe(boolean aPrematuro, float aPeso, float aTamanho) {
    super();
    prematuro = aPrematuro;
    this.peso = aPeso;
    this.altura = aTamanho;
  }

  public Bebe(float aPeso, float aTamanho) {
    this(false, aPeso, aTamanho);
  }
 @Override
  public void Andar(){
    super.Andar();
    System.out.println("Engatinha");
  }


  protected void Aprender() {
    System.out.println("Aprende a Sorrir");
  }

  public void MamarNoPeito() {
    System.out.println("Mamar na mãe");
  }

  @Override
  public void Birra() {
    System.out.println("Solta um sonzinho");
    super.Birra();
    System.out.println("Solta outro sonzinho");
  }

}
