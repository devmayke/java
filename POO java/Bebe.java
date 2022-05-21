public class Bebe extends Crianca implements Runnable {
  // @Override
  // public String falar(){



    public Bebe(String nome,String cpf){
      super(nome, cpf);
    }
  // return super.falar() + "bebê";




  @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + Float.floatToIntBits(altura);
      result = prime * result + Float.floatToIntBits(peso);
      return result;
    }

    
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Bebe other = (Bebe) obj;
      if (Float.floatToIntBits(altura) != Float.floatToIntBits(other.altura))
        return false;
      if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
        return false;
      return true;
    }








  // }
  public static final int VELOC_ANDAR = 0; // metros por segundo
  public static int SENTE_FOME = 2; // a cada x horas
  // protected final boolean prematuro;

  public float peso; // informação do nascimento
  public float altura; // informação do nascimento

  // public Bebe(boolean aPrematuro, float aPeso, float aTamanho) {
  //   super();
  //   prematuro = aPrematuro;
  //   this.peso = aPeso;
  //   this.altura = aTamanho;
  // }

  public Bebe(float aPeso, float aTamanho) {
    this(false, aPeso, aTamanho);
  }
  public Bebe() {
 
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


  public void run() {
    for ( int i=0; i<10; i++ ) {
        System.out.println( "Bebe:" + nome + " Birra..." );
        Main.setCadeira( nome );
    }
}

}
