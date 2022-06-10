
public class Padaria {
  private int QtdePaes;

  public int getQtdePaes() {
    return this.QtdePaes;
  }

  public void setQtdePaes(int qtdePaes) {
    this.QtdePaes = qtdePaes;
  }

  public double getValorTotal() {
    return getQtdePaes() * .82;
  }

  public double getValorTotal(int valor) {
    return valor * .82;
  }

  public Padaria(int qtdePaes) {
    setQtdePaes(qtdePaes);
  }

  public double calcularQtdePaes() {
    return getValorTotal(getQtdePaes());
  }

  public void MostrarTabelaPreco() {
    int i = 1;
    System.out.println("---------------------------");
    System.out.println("|  Qtde Paes  |   Valor   |");
    System.out.println("---------------------------");
    while (i <= getQtdePaes()) {
      System.out.print(String.format("%-10s", "|      " + i) + "    |   " + String.format("%.2f", getValorTotal(i)) + "   ");    
      System.out.print( (getValorTotal(i) < 10) ? " ":"");
      System.out.println("|");
      System.out.println("---------------------------");
      i++;
    }
  }
}
