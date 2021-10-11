package fundamentos.desafioPOOCursoEmVideo;

import java.util.Scanner;

public class Banco {
  public int numConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private Boolean status;

  public void Banco() {
    this.status = false;
    this.saldo = 0;

  }

  void abrirConta() {
    this.status = true;
    System.out.print("Digite o tipo da conta: ");
    Scanner entrada = new Scanner(System.in);
    this.tipo = entrada.nextLine();
    System.out.print("Digite o seu nome: ");
    this.dono = entrada.nextLine();
    entrada.close();
    if (this.tipo.equals("cc")) {
      this.saldo = 50f;
    } else {
      this.saldo = 150f;
    }
  }

  String getTipo() {
    return this.tipo;
  }

  String fecharConta() {
    if (this.saldo > 0) {
      return "Você ainda tem " + this.saldo + " na sua conta. Você não pode fechar.";
    } else if (this.saldo < 0) {
      return "Você tem " + this.saldo + " em débito na sua conta. Você não pode fechar.";
    }else{
      this.status = false;
      return "Sua conta foi encerrada com sucesso. ";
    }
  }

  void depositar(float valor) {
    if (this.status) {
      this.saldo += valor;
    } else {
      System.out.println("Antes, você precisa abrir uma conta para depositar.");

    }

  }

  void sacar(float valor) {
    if (this.status) {
      if (valor <= 1000) {
        if (this.saldo < valor) {
          System.out.println("Saldo insuficiente");
        } else {
          this.saldo = this.saldo - valor;
        }
      } else {
        System.out.println("O limite máximo por saque é de 1000 reais, tente um valor inferior. ");
      }
    } else {
      System.out.println("Antes, você precisa abrir uma conta para sacar.");
    }
  }

  void pagarMensal(float valor) {

  }

  public static void main(String[] args) {
    Banco b1 = new Banco();
    b1.abrirConta();
    b1.saldo = -30f;  
    b1.depositar(35f);
    b1.sacar(5f);
    System.out.println("status: " + b1.status);
    System.out.println("tipo: " + b1.tipo);
    System.out.println("dono: " + b1.dono);
    System.out.println("saldo: " + b1.saldo);
    

    System.out.println(b1.fecharConta());
  }

}