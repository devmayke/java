
public class Padaria {
  private int QtdePaes;
  private double precoPao;

  public void setPrecoPao(double valor){
    this.precoPao = valor;

  }
  public double getPrecoPao(){
    return this.precoPao;

  }

  public int getQtdePaes() {
    return this.QtdePaes;
  }

  public void setQtdePaes(int qtdePaes) {
    this.QtdePaes = qtdePaes;
  }

  public double getValorTotal() {
    return getQtdePaes() * getPrecoPao();
  }

  public double getValorTotal(int valor) {
    return valor * getPrecoPao();
  }

  public Padaria(int qtdePaes, double precoPao) {
    setQtdePaes(qtdePaes);
    setPrecoPao(precoPao);
  }

  public double calcularQtdePaes() {
    return getValorTotal(getQtdePaes());
  }

  public void MostrarTabelaPreco() {
    int i = 1;
    System.out.println("----------------------------");
    System.out.println("|  Qtde Paes  |   Valor    |");
    System.out.println("----------------------------");
    while (i <= getQtdePaes()) {
      System.out.print(String.format("%-10s", "|      " + i) + "    |  R$ " + String.format("%.2f", getValorTotal(i)) + "  ");    
      System.out.print( (getValorTotal(i) < 10) ? " ":"");
      System.out.println("|");
      System.out.println("----------------------------");
      i++;
    }
  }
}
