public class Relacionamento {
  private Humano pessoa1;
  private Humano pessoa2;
  private String relacionamento;

  
  public Humano getPessoa1() {
    return pessoa1;
  }
  public void setPessoa1(Humano pessoa1) {
    this.pessoa1 = pessoa1;
  }
  public Humano getPessoa2() {
    return pessoa2;
  }
  public void setPessoa2(Humano pessoa2) {
    this.pessoa2 = pessoa2;
  }
  public String getRelacionamento() {
    return relacionamento;
  }
  public void setRelacionamento(String relacionamento) {
    this.relacionamento = relacionamento;
  }
  public Relacionamento(Humano pessoa1, Humano pessoa2, String relacionamento) {
    this.pessoa1 = pessoa1;
    this.pessoa2 = pessoa2;
    this.relacionamento = relacionamento;
  }

}
