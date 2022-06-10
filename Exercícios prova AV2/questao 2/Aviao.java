public class Aviao extends Veiculo {

  private int qtdePassageiros = 274;

  public Aviao(String aNome) {

//////////////////////////// falatava usar estes setters //////////////////////////// 

    // super( aNome ); ---> errado
    setNome(aNome);

    // this.tipo = "Avião"; ---> errado
    setTipo("Avião");
    //////////////////////////// falatava usar estes setters //////////////////////////// 
  }

  @Override
  public String toString() {

    return super.toString() + "\nQtde Passageiros=" + qtdePassageiros;

  }

  @Override

  public String getCores() {

    return "Branco, azul e amarelo";

  }

  public void virarDireita(int aGraus) {

    // virar suavemente o manche para direita aGraus

  }

  public void virarEsquerda(int aGraus) {

    // virar suavemente o manche para esquerda aGraus

  }

  public void descer(int aAltitude) {

    // empurrar suavemente o manche até atingir aAltitude

  }

}